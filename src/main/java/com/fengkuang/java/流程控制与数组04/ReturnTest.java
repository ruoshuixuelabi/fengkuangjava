package com.fengkuang.java.流程控制与数组04;
public class ReturnTest {
    public static void main(String[] args) {
        // 一个简单的for循环
        for (var i = 0; i < 3; i++) {
            System.out.println("i的值是" + i);
            if (i == 1) {
                return;
            }
            System.out.println("return后的输出语句");
        }
    }
}