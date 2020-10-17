package com.fengkuang.java.Java集合08.Set集合83;

import java.util.*;

class M {
    int age;

    public M(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "M [age:" + age + "]";
    }
}

public class TreeSetTest4 {
    public static void main(String[] args) {
        // 此处Lambda表达式的目标类型是Comparator
        var ts = new TreeSet((o1, o2) ->
        {
            var m1 = (M) o1;
            var m2 = (M) o2;
            // 根据M对象的age属性来决定大小，age越大，M对象反而越小
            return m1.age > m2.age ? -1
                    : m1.age < m2.age ? 1 : 0;
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);
    }
}

