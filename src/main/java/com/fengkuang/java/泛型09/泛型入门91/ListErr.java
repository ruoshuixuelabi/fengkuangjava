package com.fengkuang.java.泛型09.泛型入门91;
import java.util.*;
public class ListErr {
    public static void main(String[] args) {
        // 创建一个只想保存字符串的List集合
        var strList = new ArrayList();
        strList.add("疯狂Java讲义");
        strList.add("疯狂Android讲义");
        // "不小心"把一个Integer对象"丢进"了集合
        strList.add(5);     // ①
        strList.forEach(str -> System.out.println(((String) str).length())); // ②
    }
}