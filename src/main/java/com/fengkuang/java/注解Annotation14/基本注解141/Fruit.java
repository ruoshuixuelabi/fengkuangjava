package com.fengkuang.java.注解Annotation14.基本注解141;
public class Fruit {
    public void info() {
        System.out.println("水果的info方法...");
    }
}
class Apple extends Fruit {
    // 使用@Override指定下面方法必须重写父类方法
    @Override
    public void info() {
        System.out.println("苹果重写水果的info方法...");
    }
}