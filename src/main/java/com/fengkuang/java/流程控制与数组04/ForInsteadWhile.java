package com.fengkuang.java.流程控制与数组04;
public class ForInsteadWhile {
    public static void main(String[] args) {
        // 把for循环的初始化条件提出来独立定义
        var count = 0;
        // for循环里只放循环条件
        for (; count < 10; ) {
            System.out.println(count);
            // 把循环迭代部分放在循环体之后定义
            count++;
        }
        System.out.println("循环结束!");
        // 此处将还可以访问count变量
    }
}