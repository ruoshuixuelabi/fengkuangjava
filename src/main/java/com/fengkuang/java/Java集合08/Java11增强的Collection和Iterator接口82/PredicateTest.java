package com.fengkuang.java.Java集合08.Java11增强的Collection和Iterator接口82;
import java.util.*;
import java.util.function.*;
public class PredicateTest {
    public static void main(String[] args) {
        // 创建一个集合
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");
        // 使用Lambda表达式（目标类型是Predicate）过滤集合
        books.removeIf(ele -> ((String) ele).length() < 10);
        System.out.println(books);
    }
}