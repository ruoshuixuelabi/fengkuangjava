package com.fengkuang.java.输入输出15.NIO159;
import java.nio.*;
import java.nio.charset.*;
public class CharsetTransform {
    public static void main(String[] args) throws Exception {
        // 创建简体中文对应的Charset
        Charset cn = Charset.forName("GBK");
        // 获取cn对象对应的编码器和解码器
        CharsetEncoder cnEncoder = cn.newEncoder();
        CharsetDecoder cnDecoder = cn.newDecoder();
        // 创建一个CharBuffer对象
        CharBuffer cbuff = CharBuffer.allocate(8);
        cbuff.put('孙');
        cbuff.put('悟');
        cbuff.put('空');
        cbuff.flip();
        // 将CharBuffer中的字符序列转换成字节序列
        ByteBuffer bbuff = cnEncoder.encode(cbuff);
        // 循环访问ByteBuffer中的每个字节
        for (var i = 0; i < bbuff.capacity(); i++) {
            System.out.print(bbuff.get(i) + " ");
        }
        // 将ByteBuffer的数据解码成字符序列
        System.out.println("\n" + cnDecoder.decode(bbuff));
    }
}