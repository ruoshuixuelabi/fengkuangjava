package com.fengkuang.java.Java集合08.操作集合的工具类Collections88;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {
        var nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums); // 输出:[2, -5, 3, 0]
        Collections.reverse(nums); // 将List集合元素的次序反转
        System.out.println(nums); // 输出:[0, 3, -5, 2]
        Collections.sort(nums); // 将List集合元素的按自然顺序排序
        System.out.println(nums); // 输出:[-5, 0, 2, 3]
        Collections.shuffle(nums); // 将List集合元素的按随机顺序排序
        System.out.println(nums); // 每次输出的次序不固定
    }
}
