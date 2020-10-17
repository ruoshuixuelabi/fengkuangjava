package com.fengkuang.java.面向对象06.类成员63;
public class NullAccessStatic {
    private static void test() {
        System.out.println("static修饰的类方法");
    }
    public static void main(String[] args) {
        // 定义一个NullAccessStatic变量，其值为null
        NullAccessStatic nas = null;
        // 使用null对象调用所属类的静态方法
        nas.test();
    }
}