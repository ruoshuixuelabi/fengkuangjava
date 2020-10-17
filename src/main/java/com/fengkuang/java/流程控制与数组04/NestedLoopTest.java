package com.fengkuang.java.流程控制与数组04;
public class NestedLoopTest {
    public static void main(String[] args) {
        // 外层循环
        for (var i = 0; i < 5; i++) {
            // 内层循环
            for (var j = 0; j < 3; j++) {
                System.out.println("i的值为:" + i + "  j的值为:" + j);
            }
        }
    }
}