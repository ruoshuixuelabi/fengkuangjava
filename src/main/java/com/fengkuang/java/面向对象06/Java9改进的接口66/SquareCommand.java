package com.fengkuang.java.面向对象06.Java9改进的接口66;
public class SquareCommand implements Command {
    @Override
    public void process(int element) {
        System.out.println("数组元素的平方是:" + element * element);
    }
}