package com.fengkuang.java.面向对象06.Java9改进的接口66;

interface InterfaceA {
    int PROP_A = 5;

    void testA();
}

interface InterfaceB {
    int PROP_B = 6;

    void testB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    int PROP_C = 7;

    void testC();
}

public class InterfaceExtendsTest {
    public static void main(String[] args) {
        System.out.println(InterfaceC.PROP_A);
        System.out.println(InterfaceC.PROP_B);
        System.out.println(InterfaceC.PROP_C);
    }
}