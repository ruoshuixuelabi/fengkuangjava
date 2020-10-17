package com.fengkuang.java.面向对象06.处理对象62;
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class PrintObject {
    public static void main(String[] args) {
        // 创建一个Person对象，将之赋给p变量
        var p = new Person("孙悟空");
        // 打印p所引用的Person对象
        System.out.println(p+"");
        System.out.println(p.toString()+"");
    }
}