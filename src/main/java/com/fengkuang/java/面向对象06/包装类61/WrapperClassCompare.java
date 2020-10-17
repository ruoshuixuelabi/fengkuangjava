package com.fengkuang.java.面向对象06.包装类61;
public class WrapperClassCompare {
    public static void main(String[] args) {
        var a = Integer.valueOf(6);
        // 输出true
        System.out.println("6的包装类实例是否大于5.0" + (a > 5.0));
        System.out.println("比较2个包装类的实例是否相等：" + (Integer.valueOf(2) == Integer.valueOf(2))); // 输出false
        // 通过自动装箱，允许把基本类型值赋值给包装类的实例
        Integer ina = 2;
        Integer inb = 2;
        System.out.println("两个2自动装箱后是否相等：" + (ina == inb)); // 输出true
        Integer biga = 128;
        Integer bigb = 128;
        System.out.println("两个128自动装箱后是否相等：" + (biga == bigb)); // 输出false
        System.out.println(Boolean.compare(true,false));//1
        System.out.println(Boolean.compare(true,true));//0
        System.out.println(Boolean.compare(false,true));//-1
    }
}