package com.fengkuang.java.网络编程17.Java11标准化的HTTPClient176;
import java.net.http.*;
import java.time.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
public class WebSocketChat {
    public static void main(String[] args) throws Exception {
        // 构建WebSocket.Listener监听器对象
        WebSocket.Listener listener = new WebSocket.Listener() {
            // 与服务端打开连接时激发该方法
            @Override
            public void onOpen(WebSocket webSocket) {
                System.out.println("已打开连接");
                // 请求获取下一次的消息
                webSocket.request(1);
            }
            // 接收到服务端发送回来的文本消息时激发该方法
            @Override
            public CompletionStage<?> onText(WebSocket webSocket, CharSequence message, boolean last) {
                System.out.println(message);
                // 请求获取下一次的消息
                webSocket.request(1);
                return null;
            }
        };
        HttpClient client = HttpClient.newHttpClient();
        // 传入监听器作为参数，创建WebSocket客户端
        client.newWebSocketBuilder().buildAsync(
                URI.create("ws://127.0.0.1:8888/foo/chatSocket"), listener)
                .thenAccept(webSocket -> {
                    try {
                        // 创建BufferedReader对象
                        BufferedReader br = new BufferedReader(new InputStreamReader(
                                System.in));
                        String line = null;
                        // 不断读取用户键盘输入，并将用户输入发送到WebSocket
                        while ((line = br.readLine()) != null) {
                            webSocket.sendText(line, true);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                })
                .join();
    }
}
