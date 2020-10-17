package com.fengkuang.java.面向对象06.final修饰符64;
public class IntegerCacheTest {
    public static void main(String[] args) {
        // 生成新的Integer对象
        var in1 = new Integer(6);
        // 生成新的Integer对象，并缓存该对象
        var in2 = Integer.valueOf(6);
        // 直接从缓存中取出Ineger对象
        var in3 = Integer.valueOf(6);
        System.out.println(in1 == in2); // 输出false
        System.out.println(in2 == in3); // 输出true
        // 由于Integer只缓存-128~127之间的值，
        // 因此200对应的Integer对象没有被缓存。
        var in4 = Integer.valueOf(200);
        var in5 = Integer.valueOf(200);
        System.out.println(in4 == in5); //输出false
    }
}