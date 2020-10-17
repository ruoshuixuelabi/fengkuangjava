package com.fengkuang.java.异常处理10.Checked异常和Runtime异常体系103;
import java.io.*;
public class ThrowsTest {
    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("a.txt");
    }
}