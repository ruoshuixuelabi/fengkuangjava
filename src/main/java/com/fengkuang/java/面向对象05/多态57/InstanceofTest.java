package com.fengkuang.java.面向对象05.多态57;
public class InstanceofTest {
    public static void main(String[] args) {
        // 声明hello时使用Object类，则hello的编译类型是Object，
        // Object是所有类的父类, 但hello变量的实际类型是String
        Object hello = "Hello";
        // String与Object类存在继承关系，可以进行instanceof运算。返回true。
        System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));
        System.out.println("字符串是否是String类的实例：" + (hello instanceof String)); // 返回true。
        // Math与Object类存在继承关系，可以进行instanceof运算。返回false。
        System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));
        // String实现了Comparable接口，所以返回true。
        System.out.println("字符串是否是Comparable接口的实例：" + (hello instanceof Comparable));
        var a = "Hello";
        // String类与Math类没有继承关系，所以下面代码编译无法通过
//		System.out.println("字符串是否是Math类的实例："
//			+ (a instanceof Math));
    }
}