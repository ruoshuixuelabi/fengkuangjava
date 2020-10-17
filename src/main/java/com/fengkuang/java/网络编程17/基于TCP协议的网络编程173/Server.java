package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建一个ServerSocket，用于监听客户端Socket的连接请求
        var ss = new ServerSocket(30000);
        // 采用循环不断接受来自客户端的请求
        while (true) {
            // 每当接受到客户端Socket的请求，服务器端也对应产生一个Socket
            Socket s = ss.accept();
            // 将Socket对应的输出流包装成PrintStream
            var ps = new PrintStream(s.getOutputStream());
            // 进行普通IO操作
            ps.println("您好，您收到了服务器的新年祝福！");
            // 关闭输出流，关闭Socket
            ps.close();
            s.close();
        }
    }
}