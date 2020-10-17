package com.fengkuang.java.输入输出15.Java9改进的对象序列化158.custom;
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
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        // 将name实例变量的值反转后写入二进制流
        out.writeObject(new StringBuffer(name).reverse());
        out.writeInt(age);
    }
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        // 将读取的字符串反转后赋给name实例变量
        this.name = ((StringBuffer) in.readObject()).reverse()
                .toString();
        this.age = in.readInt();
    }
}