package com.fengkuang.java.泛型09.泛型方法94;
class MyClass<E> {
    public <T> MyClass(T t) {
        System.out.println("t参数的值为：" + t);
    }
}
public class GenericDiamondTest {
    public static void main(String[] args) {
        // MyClass类声明中的E形参是String类型。
        // 泛型构造器中声明的T形参是Integer类型
        MyClass<String> mc1 = new MyClass<>(5);
        // 显式指定泛型构造器中声明的T形参是Integer类型，
        MyClass<String> mc2 = new <Integer>MyClass<String>(5);
        // MyClass类声明中的E形参是String类型。
        // 如果显式指定泛型构造器中声明的T形参是Integer类型
        // 此时就不能使用"菱形"语法，下面代码是错的。
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
    }
}