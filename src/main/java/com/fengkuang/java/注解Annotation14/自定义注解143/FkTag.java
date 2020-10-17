package com.fengkuang.java.注解Annotation14.自定义注解143;
import java.lang.annotation.*;
// 指定该注解信息会保留到运行时
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
public @interface FkTag {
    // 为该注解定义2个成员变量
    String name() default "疯狂软件";
    int age();
}