package com.fengkuang.java.输入输出15.字节流和字符流153;
import java.io.*;
public class FileReaderTest {
    public static void main(String[] args) {
        try (
                // 创建字符输入流
                var fr = new FileReader("FileReaderTest.java")) {
            // 创建一个长度为32的“竹筒”
            var cbuf = new char[32];
            // 用于保存实际读取的字符数
            var hasRead = 0;
            // 使用循环来重复“取水”过程
            while ((hasRead = fr.read(cbuf)) > 0) {
                // 取出“竹筒”中水滴（字符），将字符数组转换成字符串输入！
                System.out.print(new String(cbuf, 0, hasRead));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}