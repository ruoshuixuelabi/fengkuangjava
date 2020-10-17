package com.fengkuang.java.输入输出15.NIO159;
import java.nio.charset.*;
import java.util.*;
public class CharsetTest {
    public static void main(String[] args) {
        // 获取Java支持的全部字符集
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (var alias : map.keySet()) {
            // 输出字符集的别名和对应的Charset对象
            System.out.println(alias + "----->" + map.get(alias));
        }
    }
}