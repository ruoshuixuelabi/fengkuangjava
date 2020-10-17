package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        var socket = new Socket("127.0.0.1", 30000);   // ①
        // 将Socket对应的输入流包装成BufferedReader
        var br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        socket.connect(new InetSocketAddress("127.0.0.1", 30000),10);
        // 进行普通IO操作
        String line = br.readLine();
        System.out.println("来自服务器的数据：" + line);
        // 关闭输入流、socket
        br.close();
        socket.close();
    }
}