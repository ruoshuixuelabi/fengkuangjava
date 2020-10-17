package com.fengkuang.java.网络编程17.Java11标准化的HTTPClient176;
import java.net.http.*;
import java.time.*;
import java.net.*;
public class AsyncTest {
    public static void main(String[] args) throws Exception {
        // 为CookieHandler设置默认的Cookie管理器
        CookieHandler.setDefault(new CookieManager());
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                // 设置默认的Cookie处理器
                .cookieHandler(CookieHandler.getDefault())
                .build();
        // 创建发送POST请求的request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8888/foo/login.jsp"))
                .timeout(Duration.ofMinutes(2))
                // 指定以提交表单的方式编码请求体
                .header("Content-Type", "application/x-www-form-urlencoded")
                // 通过字符串创建请求体，然后作为POST请求的请求参数
                .POST(HttpRequest.BodyPublishers.ofString("name=crazyit.org&pass=leegang"))
                .build();
        // 创建发送GET请求的request
        HttpRequest getReq = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8888/foo/secret.jsp"))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "text/html")
                .GET()
                .build();
        // 发送异步的POST请求，返回CompletableFuture对象
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                // 当CompletableFuture完成时，传入的Lambda表达式对该返回值进行转换
                .thenApply(resp -> new Object[]{resp.statusCode(), resp.body()})
                // 当CompletableFuture完成时，传入的Lambda表达式处理该返回值
                .thenAccept(rt -> {
                    System.out.println("POST请求的响应码:" + rt[0]);
                    System.out.println("POST请求的响应体:" + rt[1]);
                    // 发送异步的GET请求，返回CompletableFuture对象
                    client.sendAsync(getReq, HttpResponse.BodyHandlers.ofString())
                            // 当CompletableFuture完成时，传入的Lambda表达式处理该返回值
                            .thenAccept(resp -> {
                                System.out.println("GET请求的响应码:" + resp.statusCode());
                                System.out.println("GET请求的响应体:" + resp.body());
                            });
                });
        System.out.println("--程序结束--");
        Thread.sleep(1000);
    }
}