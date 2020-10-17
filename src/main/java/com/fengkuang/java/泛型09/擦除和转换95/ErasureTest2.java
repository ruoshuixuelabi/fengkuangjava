package com.fengkuang.java.泛型09.擦除和转换95;
import java.util.*;
public class ErasureTest2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        List list = li;
        // 下面代码引起“未经检查的转换”的警告，编译、运行时完全正常
        List<String> ls = list;     // ①
        // 但只要访问ls里的元素，如下面代码将引起运行时异常。
        System.out.println(ls.get(0));
    }
}