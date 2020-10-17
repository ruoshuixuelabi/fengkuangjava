package com.fengkuang.java.Java集合08.Java11增强的Collection和Iterator接口82;
import java.util.*;
public class ForeachTest {
    public static void main(String[] args) {
        // 创建集合、添加元素的代码与前一个程序相同
        var books = new HashSet();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Android讲义"));
        for (var obj : books) {
            // 此处的book变量也不是集合元素本身
            var book = (String) obj;
            System.out.println(book);
            if (book.equals("疯狂Android讲义")) {
                // 下面代码会引发ConcurrentModificationException异常
                books.remove(book);     // ①
            }
        }
        System.out.println(books);
    }
}