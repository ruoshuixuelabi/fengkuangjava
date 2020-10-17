package com.fengkuang.java.注解Annotation14.自定义注解143;
import java.lang.annotation.*;
import java.awt.event.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListenerFor {
    // 定义一个成员变量，用于设置元数据
    // 该listener成员变量用于保存监听器实现类
    Class<? extends ActionListener> listener();
}