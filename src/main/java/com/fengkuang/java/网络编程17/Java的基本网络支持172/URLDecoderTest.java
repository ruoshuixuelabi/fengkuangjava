package com.fengkuang.java.网络编程17.Java的基本网络支持172;
import java.net.*;
public class URLDecoderTest {
    public static void main(String[] args) throws Exception {
        // 将application/x-www-form-urlencoded字符串转换成普通字符串
        // 其中的字符串直接从图17.3所示窗口复制过来
        String keyWord = URLDecoder.decode("%E7%96%AF%E7%8B%82java", "utf-8");
        System.out.println(keyWord);
        // 将普通字符串转换成
        // application/x-www-form-urlencoded字符串
        String urlStr = URLEncoder.encode("疯狂Android讲义", "GBK");
        System.out.println(urlStr);
    }
}