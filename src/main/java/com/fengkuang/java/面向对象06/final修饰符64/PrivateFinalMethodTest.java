package com.fengkuang.java.面向对象06.final修饰符64;
public class PrivateFinalMethodTest {
    private final void test() {
    }
}
class Sub1 extends PrivateFinalMethodTest {
    // 下面方法定义将不会出现问题
    public void test() {
    }
}