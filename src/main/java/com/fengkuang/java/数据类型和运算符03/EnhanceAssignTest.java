package com.fengkuang.java.数据类型和运算符03;
public class EnhanceAssignTest {
    public static void main(String[] args) {
        // 定义一个byte类型的变量
        byte a = 5;
        // 下面语句出错，因为5默认是int类型，a + 5就是int类型。
        // 把int类型赋给byte类型的变量，所以出错
        // a = a + 5;
        // 定义一个byte类型的变量
        byte b = 5;
        // 下面语句不会出现错误
        b += 5;
    }
}