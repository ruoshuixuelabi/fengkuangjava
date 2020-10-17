package com.fengkuang.java.面向对象06.处理对象62;
// 定义一个Person类
class Person1 {
    // 重写equals()方法，提供自定义的相等标准
    @Override
    public boolean equals(Object obj) {
        // 不加判断，总是返回true，即Person对象与任何对象都相等
        return true;
    }
}
// 定义一个Dog空类
class Dog {
}
public class OverrideEqualsError {
    public static void main(String[] args) {
        var p = new Person1();
        System.out.println("Person对象是否equals Dog对象？" + p.equals(new Dog()));
        System.out.println("Person对象是否equals String对象？" + p.equals(new String("Hello")));
    }
}

