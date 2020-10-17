package com.fengkuang.java.类加载机制与反射18.类的加载连接和初始化181;
public class ATest1 {
    public static void main(String[] args) {
        // 创建A类的实例
        var a = new A();
        // 让a实例的类变量a的值自加
        a.a++;
        System.out.println(a.a);
    }
}