package com.fengkuang.java.数据类型和运算符03;
public class BooleanTest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        // 下面代码将出现错误：字符串不能直接变成boolean型的值
        // boolean b3 = "true";
        // 使用boolean和字符串进行连接运算，boolean会自动转换成字符串
        String str = true + "";
        // 下面将输出true
        System.out.println(str);
    }
}