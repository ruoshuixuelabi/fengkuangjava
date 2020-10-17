package com.fengkuang.java.数据类型和运算符03;

public class ModTest {
    public static void main(String[] args) {
        var a = 5.2;
        var b = 3.1;
        var mod = a % b;
        System.out.println(mod); // mod的值为2.1
        System.out.println("5对0.0求余的结果是:" + 5 % 0.0); // 输出非数:NaN
        System.out.println("-5.0对0求余的结果是:" + -5.0 % 0); // 输出非数:NaN
        System.out.println("0对5.0求余的结果是:" + 0 % 5.0); // 输出0.0
        System.out.println("0对0.0求余的结果是:" + 0 % 0.0); // 输出非数:NaN
        // 下面代码将出现异常：java.lang.ArithmeticException: / by zero
        System.out.println("-5对0求余的结果是:" + -5 % 0);
    }
}