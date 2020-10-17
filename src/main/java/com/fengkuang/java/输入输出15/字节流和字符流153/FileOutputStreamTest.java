package com.fengkuang.java.输入输出15.字节流和字符流153;
import java.io.*;
/**
 * 下面程序使用FileInputStream来执行输入，并使用FileOutputStream来执行输出，用以实现复制FileOutputStreamTest.java文件的功能。
 * @author mzk
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (
                // 创建字节输入流
                var fis = new FileInputStream("FileOutputStreamTest.java");
                // 创建字节输出流
                var fos = new FileOutputStream("newFile.txt")) {
            var bbuf = new byte[32];
            var hasRead = 0;
            // 循环从输入流中取出数据
            while ((hasRead = fis.read(bbuf)) > 0) {
                // 每读取一次，即写入文件输出流，读了多少，就写多少。
                fos.write(bbuf, 0, hasRead);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}