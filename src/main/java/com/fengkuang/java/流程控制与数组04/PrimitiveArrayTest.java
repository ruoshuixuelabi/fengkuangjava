package com.fengkuang.java.流程控制与数组04;
public class PrimitiveArrayTest {
    public static void main(String[] args) {
        // 定义一个int[]类型的数组变量
        int[] iArr;
        // 动态初始化数组，数组长度为5
        iArr = new int[5];
        // 采用循环方式为每个数组元素赋值。
        for (var i = 0; i < iArr.length; i++) {
            iArr[i] = i + 10;
        }
    }
}