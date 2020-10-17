package com.fengkuang.java.Java集合08.Java11增强的Collection和Iterator接口82;
import java.util.*;
import java.util.function.*;
public class CollectionStream {
    public static void main(String[] args) {
        // 创建books集合、为books集合添加元素的代码与8.2.5小节的程序相同。
        var books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂iOS讲义");
        books.add("疯狂Ajax讲义");
        books.add("疯狂Android讲义");
        // 统计书名包含“疯狂”子串的图书数量
        System.out.println(books.stream()
                .filter(ele -> ((String) ele).contains("疯狂"))
                .count()); // 输出4
        // 统计书名包含“Java”子串的图书数量
        System.out.println(books.stream()
                .filter(ele -> ((String) ele).contains("Java"))
                .count()); // 输出2
        // 统计书名字符串长度大于10的图书数量
        System.out.println(books.stream()
                .filter(ele -> ((String) ele).length() > 10)
                .count()); // 输出2
        // 先调用Collection对象的stream()方法将集合转换为Stream,
        // 再调用Stream的mapToInt()方法获取原有的Stream对应的IntStream
        books.stream().mapToInt(ele -> ((String) ele).length())
                // 调用forEach()方法遍历IntStream中每个元素
                .forEach(System.out::println);// 输出8 11 16 7 8
    }
}