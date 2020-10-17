package com.fengkuang.java.网络编程17.Java11标准化的HTTPClient176;
import java.net.http.*;
import java.time.*;
import java.net.*;
public class GetTest {
    public static void main(String[] args) throws Exception {
        // ①、创建HttpClient对象
        HttpClient client = HttpClient.newBuilder()
                // 指定HTTP协议的版本
                .version(HttpClient.Version.HTTP_2)
                // 指定重定向策略
                .followRedirects(HttpClient.Redirect.NORMAL)
                // 指定超时的时长
                .connectTimeout(Duration.ofSeconds(20))
                // 如有必要，可通过该方法指定代理服务器地址
//			.proxy(ProxySelector.of(new InetSocketAddress("proxy.crazyit.com", 80)))
                .build();
        // ②、创建HttpRequest对象
        HttpRequest request = HttpRequest.newBuilder()
                // 执行请求的URL
                .uri(URI.create("http://localhost:8888/foo/secret.jsp"))
                // 指定请求超时的时长
                .timeout(Duration.ofMinutes(2))
                // 指定请求头
                .header("Content-Type", "text/html")
                // 创建GET请求
                .GET()
                .build();
        // HttpResponse.BodyHandlers.ofString()指定将服务器响应转化成字符串
        HttpResponse.BodyHandler<String> bh = HttpResponse.BodyHandlers.ofString();
        // ③、发送请求，获取服务器响应
        HttpResponse<String> response = client.send(request, bh);
        // 获取服务器响应的状态码
        System.out.println("响应的状态码:" + response.statusCode());
        System.out.println("响应头:" + response.headers());
        System.out.println("响应体:" + response.body());
    }
}