package com.fengkuang.java.泛型09.泛型方法94;
class Foo {
    public <T> Foo(T t) {
        System.out.println(t);
    }
}
public class GenericConstructor {
    public static void main(String[] args) {
        // 泛型构造器中的T类型为String。
        new Foo("疯狂Java讲义");
        // 泛型构造器中的T类型为Integer。
        new Foo(200);
        // 显式指定泛型构造器中的T类型为String，
        // 传给Foo构造器的实参也是String对象，完全正确。
        new <String>Foo("疯狂Android讲义");
        // 显式指定泛型构造器中的T类型为String，
        // 但传给Foo构造器的实参是Double对象，下面代码出错
//		new <String> Foo(12.3);
    }
}