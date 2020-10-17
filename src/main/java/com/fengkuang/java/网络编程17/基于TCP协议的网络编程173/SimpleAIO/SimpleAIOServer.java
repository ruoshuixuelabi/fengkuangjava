package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.SimpleAIO;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*;
public class SimpleAIOServer {
    static final int PORT = 30000;
    public static void main(String[] args) throws Exception {
        try (
                // ①创建AsynchronousServerSocketChannel对象。
                AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()) {
            // ②指定在指定地址、端口监听。
            serverChannel.bind(new InetSocketAddress(PORT));
            while (true) {
                // ③采用循环接受来自客户端的连接
                Future<AsynchronousSocketChannel> future = serverChannel.accept();
                // 获取连接完成后返回的AsynchronousSocketChannel
                AsynchronousSocketChannel socketChannel = future.get();
                // 执行输出。
                socketChannel.write(ByteBuffer.wrap("欢迎你来自AIO的世界！".getBytes("UTF-8"))).get();
            }
        }
    }
}