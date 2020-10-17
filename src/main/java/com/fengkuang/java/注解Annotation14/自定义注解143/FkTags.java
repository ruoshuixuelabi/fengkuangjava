package com.fengkuang.java.注解Annotation14.自定义注解143;
import java.lang.annotation.*;
// 指定该注解信息会保留到运行时
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FkTags {
    // 定义value成员变量，该成员变量可接受多个@FkTag注解
    FkTag[] value();
}