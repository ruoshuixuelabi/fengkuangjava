package com.fengkuang.java.注解Annotation14.编译时处理注解144;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Persistent {
    String table();
}