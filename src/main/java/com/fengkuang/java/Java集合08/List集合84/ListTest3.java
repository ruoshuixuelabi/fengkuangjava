package com.fengkuang.java.Java集合08.List集合84;
import java.util.*;
public class ListTest3 {
    public static void main(String[] args) {
        var books = new ArrayList();
        // 向books集合中添加4个元素
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        books.add("疯狂iOS讲义");
        // 使用目标类型为Comparator的Lambda表达式对List集合排序
        books.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(books);
        // 使用目标类型为UnaryOperator的Lambda表达式来替换集合中所有元素
        // 该Lambda表达式控制使用每个字符串的长度作为新的集合元素
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books); // 输出[7, 8, 11, 16]
    }
}