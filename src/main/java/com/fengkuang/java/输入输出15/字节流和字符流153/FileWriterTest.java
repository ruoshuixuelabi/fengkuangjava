package com.fengkuang.java.输入输出15.字节流和字符流153;
import java.io.*;
/**
 * 如果希望直接输出字符串内容，则使用Writer会有更好的效果，如下程序所示。
 * @author mzk
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try (
                var fw = new FileWriter("poem.txt")) {
            fw.write("锦瑟 - 李商隐\r\n");
            fw.write("锦瑟无端五十弦，一弦一柱思华年。\r\n");
            fw.write("庄生晓梦迷蝴蝶，望帝春心托杜鹃。\r\n");
            fw.write("沧海月明珠有泪，蓝田日暖玉生烟。\r\n");
            fw.write("此情可待成追忆，只是当时已惘然。\r\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}