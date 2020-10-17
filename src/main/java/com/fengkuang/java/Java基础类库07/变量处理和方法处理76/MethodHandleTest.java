package com.fengkuang.java.Java基础类库07.变量处理和方法处理76;

import java.lang.invoke.*;

/**
 * MethodHandle的用法
 *
 * @author mzk
 */
public class MethodHandleTest {
    /**
     * 定义一个private的类方法
     */
    private static void hello() {
        System.out.println("Hello world!");
    }

    /**
     * 定义一个private的实例方法
     */
    private String hello(String name) {
        System.out.println("执行带参数的hello" + name);
        return name + ",您好";
    }

    public static void main(String[] args) throws Throwable {
        // 定义一个返回值为void、不带形参的方法类型
        var type = MethodType.methodType(void.class);
        // 使用MethodHandles.Lookup的findStatic获取类方法
        var mtd = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", type);
        // 通过MethodHandle执行方法
        mtd.invoke();
        // 使用MethodHandles.Lookup的findVirtual获取实例方法
        var mtd2 = MethodHandles.lookup()
                .findVirtual(MethodHandleTest.class, "hello",
                        // 指定获取返回值为String, 形参为String的方法类型
                        MethodType.methodType(String.class, String.class));
        // 通过MethodHandle执行方法，传入主调对象和参数
        System.out.println(mtd2.invoke(new MethodHandleTest(), "孙悟空"));
    }
}