package com.fengkuang.java.网络编程17.基于TCP协议的网络编程173.Senior;
import java.net.*;
import java.io.*;
public class Server {
    private static final int SERVER_PORT = 30000;
    // 使用CrazyitMap对象来保存每个客户名字和对应输出流之间的对应关系。
    public static CrazyitMap<String, PrintStream> clients = new CrazyitMap<>();
    public void init() {
        try (
                // 建立监听的ServerSocket
                var ss = new ServerSocket(SERVER_PORT)) {
            // 采用死循环来不断接受来自客户端的请求
            while (true) {
                Socket socket = ss.accept();
                new ServerThread(socket).start();
            }
        }
        // 如果抛出异常
        catch (IOException ex) {
            System.out.println("服务器启动失败，是否端口" + SERVER_PORT + "已被占用？");
        }
    }

    public static void main(String[] args) {
        var server = new Server();
        server.init();
    }
}