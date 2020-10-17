package com.fengkuang.java.输入输出15.Java虚拟机读写其他进程的数据156;
import java.io.*;
import java.util.*;
public class WriteToProcess {
    public static void main(String[] args) throws IOException {
        // 运行java ReadStandard命令，返回运行该命令的子进程
        Process p = Runtime.getRuntime().exec("java ReadStandard");
        try (
                // 以p进程的输出流创建PrintStream对象
                // 这个输出流对本程序是输出流，对p进程则是输入流
                var ps = new PrintStream(p.getOutputStream())) {
            // 向ReadStandard程序写入内容，这些内容将被ReadStandard读取
            ps.println("普通字符串");
            ps.println(new WriteToProcess());
        }
    }
}
// 定义一个ReadStandard类，该类可以接受标准输入，
// 并将标准输入写入out.txt文件。
class ReadStandard {
    public static void main(String[] args) {
        try (
                // 使用System.in创建Scanner对象，用于获取标准输入
                var sc = new Scanner(System.in);
                var ps = new PrintStream(new FileOutputStream("out.txt"))) {
            // 增加下面一行将只把回车作为分隔符
            sc.useDelimiter("\n");
            // 判断是否还有下一个输入项
            while (sc.hasNext()) {
                // 输出输入项
                ps.println("键盘输入的内容是：" + sc.next());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}