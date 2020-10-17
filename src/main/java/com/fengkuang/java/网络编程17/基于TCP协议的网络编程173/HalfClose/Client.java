package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.HalfClose;
import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) throws Exception {
        var s = new Socket("localhost", 30000);
        var scan = new Scanner(s.getInputStream());
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        var ps = new PrintStream(s.getOutputStream());
        ps.println("客户端的第一行数据");
        ps.println("客户端的第二行数据");
        ps.close();
        scan.close();
        s.close();
    }
}