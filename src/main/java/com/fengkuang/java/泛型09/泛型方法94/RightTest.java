package com.fengkuang.java.泛型09.泛型方法94;
import java.util.*;
public class RightTest {
    // 声明一个泛型方法，该泛型方法中带一个T形参
    static <T> void test(Collection<? extends T> from, Collection<T> to) {
        for (var ele : from) {
            to.add(ele);
        }
    }
    public static void main(String[] args) {
        List<Object> ao = new ArrayList<>();
        List<String> as = new ArrayList<>();
        // 下面代码完全正常
        test(as, ao);
    }
}