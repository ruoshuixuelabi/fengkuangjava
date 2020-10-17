package com.fengkuang.java.泛型09.泛型方法94;
import java.util.*;
public class ErrorTest {
    // 声明一个泛型方法，该泛型方法中带一个T泛型形参
    static <T> void test(Collection<T> from, Collection<T> to) {
        for (var ele : from) {
            to.add(ele);
        }
    }
    public static void main(String[] args) {
        List<Object> as = new ArrayList<>();
        List<String> ao = new ArrayList<>();
        // 下面代码将产生编译错误
//        test(as, ao);
    }
}