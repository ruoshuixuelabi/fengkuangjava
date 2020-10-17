package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.MultiThread;
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) throws Exception {
        var s = new Socket("127.0.0.1", 30000);
        // 客户端启动ClientThread线程不断读取来自服务器的数据
        new Thread(new ClientThread(s)).start();   // ①
        // 获取该Socket对应的输出流
        var ps = new PrintStream(s.getOutputStream());
        String line = null;
        // 不断读取键盘输入
        var br = new BufferedReader(new InputStreamReader(System.in));
        while ((line = br.readLine()) != null) {
            // 将用户的键盘输入内容写入Socket对应的输出流
            ps.println(line);
        }
    }
}