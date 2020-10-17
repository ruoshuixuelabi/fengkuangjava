package com.fengkuang.java.Java集合08.操作集合的工具类Collections88;
public class ArrayUtils {
    /**
     * 定义一个工具方法，工具方法从字符串数组中找到对应的字符串元素的位置
     * @param array  搜索的数组
     * @param target 搜索的字符串
     * @return 目标字符串出现的位置,-1表明找不到
     */
    public static int search(String[] array, String target) {
        for (var i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}