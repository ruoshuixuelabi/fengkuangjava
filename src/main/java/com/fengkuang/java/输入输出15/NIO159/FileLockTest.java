package com.fengkuang.java.输入输出15.NIO159;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
/**
 * 下面程序示范了使用FileLock锁定文件。
 * @author mzk
 */
public class FileLockTest {
    public static void main(String[] args) throws Exception {
        try (
                // 使用FileOutputStream获取FileChannel
                var channel = new FileOutputStream("a.txt").getChannel()) {
            // 使用非阻塞式方式对指定文件加锁
            FileLock lock = channel.tryLock();
            // 程序暂停10s
            Thread.sleep(10000);
            // 释放锁
            lock.release();
        }
    }
}