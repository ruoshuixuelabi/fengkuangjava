package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.MultiThread;
import java.io.*;
import java.net.*;
public class ClientThread implements Runnable {
    // 该线程负责处理的Socket
    private Socket s;
    // 该线程所处理的Socket所对应的输入流
    BufferedReader br = null;
    public ClientThread(Socket s) throws IOException {
        this.s = s;
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }
    @Override
    public void run() {
        try {
            String content = null;
            // 不断读取Socket输入流中的内容，并将这些内容打印输出
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}