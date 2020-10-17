package com.fengkuang.java.数据类型和运算符03;
public class LogicOperatorTest {
    public static void main(String[] args) {
        // 直接对false求非运算，将返回true
        System.out.println(!false);
        // 5>3返回true，'6'转换为整数54，'6'>10返回true，求与后返回true
        System.out.println(5 > 3 && '6' > 10);
        // 4>=5返回false，'c'>'a'返回true。求或后返回true
        System.out.println(4 >= 5 || 'c' > 'a');
        // 4>=5返回false，'c'>'a'返回true。两个不同的操作数求异或返回true
        System.out.println(4 >= 5 ^ 'c' > 'a');
        // 定义变量a,b，并为两个变量赋值
        var a = 5;
        var b = 10;
        // 对a > 4和b++ > 10求或运算
        if (a > 4 | b++ > 10) {
            // 输出a的值是5，b的值是11。
            System.out.println("a的值是:" + a + "，b的值是:" + b);
        }
        // 定义变量c,d，并为两个变量赋值
        var c = 5;
        var d = 10;
        // c > 4 || d++ > 10求或运算
        if (c > 4 || d++ > 10) {
            // 输出c的值是5，d的值是10。
            System.out.println("c的值是:" + c + "，d的值是:" + d);
        }
    }
}