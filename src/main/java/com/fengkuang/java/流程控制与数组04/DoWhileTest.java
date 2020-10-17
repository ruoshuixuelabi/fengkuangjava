package com.fengkuang.java.流程控制与数组04;
public class DoWhileTest {
    public static void main(String[] args) {
        // 定义变量count
        var count = 1;
        // 执行do while循环
        do {
            System.out.println(count);
            // 循环迭代语句
            count++;
            // 循环条件紧跟while关键字
        } while (count < 10);
        System.out.println("循环结束!");
        // 定义变量count2
        var count2 = 20;
        // 执行do while循环
        do
            // 这行代码把循环体和迭代部分合并成了一行代码
            System.out.println(count2++);
        while (count2 < 10);
        System.out.println("循环结束!");
    }
}