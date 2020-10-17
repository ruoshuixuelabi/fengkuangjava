package com.fengkuang.java.面向对象06.对象与垃圾回收610;
public class StatusTranfer {
    public static void test() {
        var a = new String("轻量级Java EE企业应用实战"); // ①
        a = new String("疯狂Java讲义");   // ②
    }
    public static void main(String[] args) {
        test();     // ③
    }
}