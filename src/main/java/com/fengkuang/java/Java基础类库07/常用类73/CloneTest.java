package com.fengkuang.java.Java基础类库07.常用类73;
class Address {
    String detail;
    public Address(String detail) {
        this.detail = detail;
    }
}
// 实现Cloneable接口
class User implements Cloneable {
    int age;
    Address address;
    public User(int age) {
        this.age = age;
        address = new Address("广州天河");
    }
    // 通过调用super.clone()来实现clone()方法
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
public class CloneTest {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        var u1 = new User(29);
        // clone得到u1对象的副本。
        var u2 = u1.clone();
        // 判断u1、u2是否相同
        System.out.println(u1 == u2);      // ①
        // 判断u1、u2的address是否相同
        System.out.println(u1.address == u2.address);     // ②
    }
}