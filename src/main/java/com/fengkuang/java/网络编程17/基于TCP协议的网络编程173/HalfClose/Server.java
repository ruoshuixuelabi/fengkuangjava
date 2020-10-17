package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.HalfClose;
import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
    public static void main(String[] args) throws Exception {
        var ss = new ServerSocket(30000);
        Socket socket = ss.accept();
        var ps = new PrintStream(socket.getOutputStream());
        ps.println("服务器的第一行数据");
        ps.println("服务器的第二行数据");
        // 关闭socket的输出流，表明输出数据已经结束
        socket.shutdownOutput();
        // 下面语句将输出false，表明socket还未关闭。
        System.out.println(socket.isClosed());
        var scan = new Scanner(socket.getInputStream());
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
        socket.close();
        ss.close();
    }
}