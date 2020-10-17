package com.fengkuang.java.泛型09.类型通配符93;
import java.util.*;
public class MyUtils {
    // 下面dest集合元素类型必须与src集合元素类型相同，或是其父类
    public static <T> T copy(List<? super T> dest, List<T> src) {
        T last = null;
        for (var ele : src) {
            last = ele;
            // 逆变的泛型集合添加元素是安全的
            dest.add(ele);
        }
        return last;
    }
    public static void main(String[] args) {
        // var声明的变量，后面必须具体指定泛型的类型
        var ln = new ArrayList<Number>();
        var li = new ArrayList<Integer>();
        li.add(5);
        // 此处可准确的知道最后一个被复制的元素是Integer类型
        // 与src集合元素的类型相同
        Integer last = copy(ln, li);    // ①
        System.out.println(ln);
    }
}