package com.fengkuang.java.异常处理10.异常处理机制102;
import java.io.*;
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            // return语句强制方法返回
            return;       // ①
            // 使用exit来退出虚拟机
            // System.exit(1);     // ②
        } finally {
            // 关闭磁盘文件，回收资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally块里的资源回收!");
        }
    }
}