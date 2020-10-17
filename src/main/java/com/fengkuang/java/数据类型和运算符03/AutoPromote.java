package com.fengkuang.java.数据类型和运算符03;
public class AutoPromote {
    public static void main(String[] args) {
        // 定义一个short类型变量
        short sValue = 5;
        // 下面代码将出错：表达式中的sValue将自动提升到int类型，
        // 则右边的表达式类型为int，将一个int类型赋给short类型的变量将发生错误。
        // sValue = sValue - 2;
        byte b = 40;
        var c = 'a';
        var i = 23;
        var d = .314;
        // 右边表达式中在最高等级操作数为d（double型）
        // 则右边表达式的类型为double型,故赋给一个double型变量
        double result = b + c + i * d;
        // 将输出144.222
        System.out.println(result);
        var val = 3;
        // 右边表达式中2个操作数都是int，故右边表达式的类型为int
        // 因此，虽然23/3不能除尽，依然得到一个int整数
        int intResult = 23 / val;
        System.out.println(intResult); // 将输出7
        // 输出字符串Hello!a7
        System.out.println("Hello!" + 'a' + 7);
        // 输出字符串104Hello!
        System.out.println('a' + 7 + "Hello!");
    }
}