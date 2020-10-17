package com.fengkuang.java.面向对象05.类的继承56;
public class Apple extends Fruit {
    public static void main(String[] args) {
        // 创建Apple对象
        var a = new Apple();
        // Apple对象本身没有weight成员变量
        // 因为Apple的父类有weight成员变量，也可以访问Apple对象的weight成员变量
        a.weight = 56;
        // 调用Apple对象的info()方法
        a.info();
    }
}