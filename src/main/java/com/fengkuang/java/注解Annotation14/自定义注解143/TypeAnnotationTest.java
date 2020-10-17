package com.fengkuang.java.注解Annotation14.自定义注解143;

import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.annotation.*;
// 定义一个简单的类型注解，不带任何成员变量
@Target(ElementType.TYPE_USE)
@interface NotNull {
}
// 定义类时使用类型注解
@NotNull
public class TypeAnnotationTest implements @NotNull /* implements时使用类型注解 */ Serializable {
    // 方法形参中使用类型注解
    public static void main(@NotNull String[] args)
    // throws时使用类型注解
            throws @NotNull FileNotFoundException {
        Object obj = "fkjava.org";
        // 强制类型转换时使用类型注解
        String str = (@NotNull String) obj;
        // 创建对象时使用类型注解
        Object win = new @NotNull JFrame("疯狂软件");
    }
    // 泛型中使用类型注解
    public void foo(List<@NotNull String> info) {
    }
}