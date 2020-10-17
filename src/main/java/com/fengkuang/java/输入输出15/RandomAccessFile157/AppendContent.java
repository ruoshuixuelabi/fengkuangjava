package com.fengkuang.java.输入输出15.RandomAccessFile157;
import java.io.*;
/**
 * 下面程序示范了如何向指定文件后追加内容，为了追加内容，
 * 程序应该先将记录指针移动到文件最后，然后开始向文件中输出内容。
 * @author mzk
 */
public class AppendContent {
    public static void main(String[] args) {
        try (
                //以读、写方式打开一个RandomAccessFile对象
                var raf = new RandomAccessFile("out.txt", "rw")) {
            //将记录指针移动到out.txt文件的最后
            raf.seek(raf.length());
            raf.write("追加的内容！\r\n".getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}