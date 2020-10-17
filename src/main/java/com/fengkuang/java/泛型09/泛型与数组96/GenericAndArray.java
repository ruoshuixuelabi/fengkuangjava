package com.fengkuang.java.泛型09.泛型与数组96;

import java.util.*;

public class GenericAndArray {
    public static void main(String[] args) {
//		// 下面代码编译时有“[unchecked] 未经检查的转换”警告
//		List<String>[] lsa = new ArrayList[10];
//		// 将lsa向上转型为Object[]类型的变量
//		Object[] oa = lsa;
//		List<Integer> li = new ArrayList<>();
//		li.add(3);
//		oa[1] = li;
//		// 下面代码引起ClassCastException异常
//		String s = lsa[1].get(0);              // ①

        List<?>[] lsa = new ArrayList<?>[10];
        Object[] oa = lsa;
        List<Integer> li = new ArrayList<>();
        li.add(3);
        oa[1] = li;
        Object target = lsa[1].get(0);
        if (target instanceof String) {
            // 下面代码安全了
            var s = (String) target;
        }
    }
}
