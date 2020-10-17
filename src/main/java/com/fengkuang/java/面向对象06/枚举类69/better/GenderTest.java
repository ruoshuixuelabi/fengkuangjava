package com.fengkuang.java.面向对象06.枚举类69.better;
public class GenderTest {
    public static void main(String[] args) {
        Gender g = Gender.valueOf("FEMALE");
        g.setName("女");
        System.out.println(g + "代表:" + g.getName());
        // 此时设置name值时将会提示参数错误。
        g.setName("男");
        System.out.println(g + "代表:" + g.getName());
    }
}