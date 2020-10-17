package com.fengkuang.java.面向对象05.初始化块59;
public class Person {
    // 下面定义一个实例初始化块
    {
        var a = 6;
        if (a > 4) {
            System.out.println("Person实例初始化块：局部变量a的值大于4");
        }
        System.out.println("Person的实例初始化块");
    }
    // 定义第二个实例初始化块
    {
        System.out.println("Person的第二个实例初始化块");
    }
    // 定义无参数的构造器
    public Person() {
        System.out.println("Person类的无参数构造器");
    }
    public static void main(String[] args) {
        new Person();
    }
}