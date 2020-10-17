package com.fengkuang.java.数据类型和运算符03;

public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        // int可以自动转换为float类型
        float f = a;
        // 下面将输出6.0
        System.out.println(f);
        // 定义一个byte类型的整数变量
        byte b = 9;
        // 下面代码将出错，byte型不能自动类型转换为char型
        // char c = b;
        // 下面是byte型变量可以自动类型转换为double型
        double d = b;
        // 下面将输出9.0
        System.out.println(d);
    }
}