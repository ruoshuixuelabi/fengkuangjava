package com.fengkuang.java.流程控制与数组04;
public class ArrayInRam {
    public static void main(String[] args) {
        // 定义并初始化数组，使用静态初始化
        int[] a = {5, 7, 20};
        // 定义并初始化数组，使用动态初始化
        var b = new int[4];
        // 输出b数组的长度
        System.out.println("b数组的长度为：" + b.length);
        // 循环输出a数组的元素
        for (int i = 0, len = a.length; i < len; i++) {
            System.out.println(a[i]);
        }
        // 循环输出b数组的元素
        for (int i = 0, len = b.length; i < len; i++) {
            System.out.println(b[i]);
        }
        // 因为a是int[]类型，b也是int[]类型，所以可以将a的值赋给b。
        // 也就是让b引用指向a引用指向的数组
        b = a;
        // 再次输出b数组的长度
        System.out.println("b数组的长度为：" + b.length);
    }
}