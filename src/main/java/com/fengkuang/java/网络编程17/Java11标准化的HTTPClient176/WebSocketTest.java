package com.fengkuang.java.网络编程17.Java11标准化的HTTPClient176;
import java.net.http.*;
import java.time.*;
import java.net.*;
import java.util.*;
import java.nio.*;
import java.util.concurrent.*;
public class WebSocketTest {
    public static void main(String[] args) throws Exception {
        // 构建WebSocket.Listener监听器对象
        WebSocket.Listener listener = new WebSocket.Listener() {
            // 与服务端打开连接时激发该方法
            @Override
            public void onOpen(WebSocket webSocket) {
                System.out.println("已打开连接");
                webSocket.sendText("我是疯狂软件教育中心!", true);
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
        client.newWebSocketBuilder().buildAsync(URI.create("ws://127.0.0.1:8888/foo/simpleSocket"), listener);
        Thread.sleep(5000);
    }
}