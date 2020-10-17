package com.fengkuang.java.泛型09.类型通配符93;
// 定义Shape的子类Circle
public class Circle extends Shape {
    // 实现画图方法，以打印字符串来模拟画图方法实现
    @Override
    public void draw(Canvas c) {
        System.out.println("在画布" + c + "上画一个圆");
    }
}