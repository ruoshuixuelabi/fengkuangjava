package com.fengkuang.java.输入输出15.RandomAccessFile157;
import java.io.*;
/**
 * 下面程序使用了RandomAccessFile来访问指定的中间部分数据。
 * @author mzk
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (
                var raf = new RandomAccessFile("RandomAccessFileTest.java", "r")) {
            // 获取RandomAccessFile对象文件指针的位置，初始位置是0
            System.out.println("RandomAccessFile的文件指针的初始位置：" + raf.getFilePointer());
            // 移动raf的文件记录指针的位置
            raf.seek(300);
            var bbuf = new byte[1024];
            // 用于保存实际读取的字节数
            var hasRead = 0;
            // 使用循环来重复“取水”过程
            while ((hasRead = raf.read(bbuf)) > 0) {
                // 取出“竹筒”中水滴（字节），将字节数组转换成字符串输入！
                System.out.print(new String(bbuf, 0, hasRead));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}