package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.SimpleAIO;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
public class SimpleAIOClient {
    static final int PORT = 30000;
    public static void main(String[] args) throws Exception {
        // 用于读取数据的ByteBuffer。
        ByteBuffer buff = ByteBuffer.allocate(1024);
        Charset utf = Charset.forName("utf-8");
        try (
                // ①创建AsynchronousSocketChannel对象
                AsynchronousSocketChannel clientChannel = AsynchronousSocketChannel.open()) {
            // ②连接远程服务器
            clientChannel.connect(new InetSocketAddress("127.0.0.1", PORT)).get();     // ④
            buff.clear();
            // ③从clientChannel中读取数据
            clientChannel.read(buff).get();     // ⑤
            buff.flip();
            // 将buff中内容转换为字符串
            String content = utf.decode(buff).toString();
            System.out.println("服务器信息：" + content);
        }
    }
}