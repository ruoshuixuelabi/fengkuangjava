package com.fengkuang.java.泛型09.深入泛型92;
public class R<T> {
    // 下面代码错误，不能在静态变量声明中使用泛型形参
//	static T info;
    T age;
    public void foo(T msg) {
    }
    // 下面代码错误，不能在静态方法声明中使用泛型形参
//	public static void bar(T msg){}
}

