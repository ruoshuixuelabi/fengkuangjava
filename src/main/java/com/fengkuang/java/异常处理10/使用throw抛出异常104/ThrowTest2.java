package com.fengkuang.java.异常处理10.使用throw抛出异常104;
import java.io.*;
public class ThrowTest2 {
    public static void main(String[] args)
        // Java 6认为①号代码可能抛出Exception，
        // 所以此处必须声明抛出Exception
        // Java 7会检查①号代码可能抛出异常的实际类型，
        // 因此此处只需声明抛出FileNotFoundException即可。
            throws FileNotFoundException {
        try {
            new FileOutputStream("a.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;        // ①
        }
    }
}