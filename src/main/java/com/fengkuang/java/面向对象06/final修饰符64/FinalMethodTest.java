package com.fengkuang.java.面向对象06.final修饰符64;
public class FinalMethodTest {
    public final void test() {
    }
}
class Sub extends FinalMethodTest {
    // 下面方法定义将出现编译错误，不能重写final方法
//    public void test() {
//    }
}