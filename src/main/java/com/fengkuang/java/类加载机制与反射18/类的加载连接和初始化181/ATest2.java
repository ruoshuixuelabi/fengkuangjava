package com.fengkuang.java.类加载机制与反射18.类的加载连接和初始化181;
public class ATest2 {
    public static void main(String[] args) {
        // 创建A类的实例
        var b = new A();
        // 输出b实例的类变量a的值
        System.out.println(b.a);
    }
}