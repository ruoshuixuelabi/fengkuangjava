package com.fengkuang.java.Java集合08.List集合84;
import java.util.*;
public class FixedSizeList {
    public static void main(String[] args) {
        var fixedList = Arrays.asList("疯狂Java讲义", "轻量级Java EE企业应用实战");
        // 获取fixedList的实现类，将输出Arrays$ArrayList
        System.out.println(fixedList.getClass());
        // 使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        // 试图增加、删除元素都会引发UnsupportedOperationException异常
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");
    }
}