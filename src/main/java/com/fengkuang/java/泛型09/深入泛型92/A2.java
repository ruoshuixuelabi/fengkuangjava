package com.fengkuang.java.泛型09.深入泛型92;
public class A2 extends Apple {
    // 重写父类的方法
    @Override
    public String getInfo() {
        // super.getInfo()方法返回值是Object类型，
        // 所以加toString()才返回String类型
        return super.getInfo().toString();
    }
}