package com.fengkuang.java.数据类型和运算符03;
public class NarrowConversion {
    public static void main(String[] args) {
        var iValue = 233;
        // 强制把一个int类型的值转换为byte类型的值
        byte bValue = (byte) iValue;
        // 将输出-23
        System.out.println(bValue);
        var dValue = 3.98;
        // 强制把一个double类型的值转换为int
        int tol = (int) dValue;
        // 将输出3
        System.out.println(tol);
    }
}