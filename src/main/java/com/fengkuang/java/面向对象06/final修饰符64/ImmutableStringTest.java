package com.fengkuang.java.面向对象06.final修饰符64;
public class ImmutableStringTest {
    public static void main(String[] args) {
        var str1 = new String("Hello");
        var str2 = new String("Hello");
        System.out.println(str1 == str2); // 输出false
        System.out.println(str1.equals(str2)); // 输出true
        // 下面两次输出的hashCode相同
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}