package com.fengkuang.java.输入输出15.Java9改进的对象序列化158.replace;
import java.util.*;
import java.io.*;
public class Person implements java.io.Serializable {
    private String name;
    private int age;
    // 注意此处没有提供无参数的构造器!
    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }
    // 省略name与age的setter和getter方法
    // name的setter和getter方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // age的setter和getter方法
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    //	重写writeReplace方法，程序在序列化该对象之前，先调用该方法
    private Object writeReplace() throws ObjectStreamException {
        ArrayList<Object> list = new ArrayList<>();
        list.add(name);
        list.add(age);
        return list;
    }
}