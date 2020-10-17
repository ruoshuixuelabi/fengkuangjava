package com.fengkuang.java.输入输出15.NIO2的功能和用法1510;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class FileVisitorTest {
    public static void main(String[] args)
            throws Exception {
        // 遍历g:\publish\codes\15目录下的所有文件和子目录
        Files.walkFileTree(Paths.get("g:", "publish", "codes", "15"),
                new SimpleFileVisitor<Path>() {
                    // 访问文件时候触发该方法
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        System.out.println("正在访问" + file + "文件");
                        // 找到了FileInputStreamTest.java文件
                        if (file.endsWith("FileInputStreamTest.java")) {
                            System.out.println("--已经找到目标文件--");
                            return FileVisitResult.TERMINATE;
                        }
                        return FileVisitResult.CONTINUE;
                    }
                    // 开始访问目录时触发该方法
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                        System.out.println("正在访问：" + dir + " 路径");
                        return FileVisitResult.CONTINUE;
                    }
                });
    }
}