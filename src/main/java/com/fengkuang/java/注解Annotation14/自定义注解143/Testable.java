package com.fengkuang.java.注解Annotation14.自定义注解143;
import java.lang.annotation.*;
// 使@Retention指定注解的保留到运行时
@Retention(RetentionPolicy.RUNTIME)
// 使用@Target指定被修饰的注解可用于修饰方法
@Target(ElementType.METHOD)
// 定义一个标记注解，不包含任何成员变量，即不可传入元数据
public @interface Testable {
}