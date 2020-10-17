package com.fengkuang.java.输入输出15.输入输出流体系154;
import java.io.*;
public class PrintStreamTest {
    public static void main(String[] args) {
        try (
                var fos = new FileOutputStream("test.txt");
                var ps = new PrintStream(fos)) {
            // 使用PrintStream执行输出
            ps.println("普通字符串");
            // 直接使用PrintStream输出对象
            ps.println(new PrintStreamTest());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}