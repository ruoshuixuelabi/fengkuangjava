package com.fengkuang.java.Java集合08.Java11增强的Collection和Iterator接口82;
import java.util.*;
import java.util.function.*;
public class PredicateTest2 {
    public static void main(String[] args) {
        // 创建books集合、为books集合添加元素的代码与前一个程序相同。
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");
        // 统计书名包含“疯狂”子串的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("疯狂")));
        // 统计书名包含“Java”子串的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).contains("Java")));
        // 统计书名字符串长度大于10的图书数量
        System.out.println(calAll(books, ele -> ((String) ele).length() > 10));
    }
    public static int calAll(Collection books, Predicate p) {
        int total = 0;
        for (var obj : books) {
            // 使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
            if (p.test(obj)) {
                total++;
            }
        }
        return total;
    }
}