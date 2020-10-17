package com.fengkuang.java.输入输出15.NIO159;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class RandomFileChannelTest {
    public static void main(String[] args) throws IOException {
        var f = new File("a.txt");
        try (
                // 创建一个RandomAccessFile对象
                var raf = new RandomAccessFile(f, "rw");
                // 获取RandomAccessFile对应的Channel
                FileChannel randomChannel = raf.getChannel()) {
            // 将Channel中所有数据映射成ByteBuffer
            ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            // 把Channel的记录指针移动到最后
            randomChannel.position(f.length());
            // 将buffer中所有数据输出
            randomChannel.write(buffer);
        }
    }
}