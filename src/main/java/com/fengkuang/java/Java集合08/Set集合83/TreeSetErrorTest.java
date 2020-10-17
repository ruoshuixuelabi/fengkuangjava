package com.fengkuang.java.Java集合08.Set集合83;
import java.util.*;
class Err {
}
public class TreeSetErrorTest {
    public static void main(String[] args) {
        var ts = new TreeSet();
        // 向TreeSet集合中添加Err对象
        // 自然排序时，Err没实现Comparable接口将会引发错误
        ts.add(new Err());
    }
}