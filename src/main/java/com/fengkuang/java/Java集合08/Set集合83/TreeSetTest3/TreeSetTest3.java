package com.fengkuang.java.Java集合08.Set集合83.TreeSetTest3;

import java.util.*;


class R implements Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
	public String toString() {
        return "R[count:" + count + "]";
    }

    // 重写equals方法，根据count来判断是否相等
    @Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            var r = (R) obj;
            return r.count == this.count;
        }
        return false;
    }

    // 重写compareTo方法，根据count来比较大小
    @Override
	public int compareTo(Object obj) {
        var r = (R) obj;
        return count > r.count ? 1 :
                count < r.count ? -1 : 0;
    }
}

public class TreeSetTest3 {
    public static void main(String[] args) {
        var ts = new TreeSet();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        // 打印TreeSet集合，集合元素是有序排列的
        System.out.println(ts);    // ①
        // 取出第一个元素
        var first = (R) ts.first();
        // 对第一个元素的count赋值
        first.count = 20;
        // 取出最后一个元素
        var last = (R) ts.last();
        // 对最后一个元素的count赋值，与第二个元素的count相同
        last.count = -2;
        // 再次输出将看到TreeSet里的元素处于无序状态，且有重复元素
        System.out.println(ts);   // ②
        // 删除实例变量被改变的元素，删除失败
        System.out.println(ts.remove(new R(-2)));   // ③
        System.out.println(ts);
        // 删除实例变量没有被改变的元素，删除成功
        System.out.println(ts.remove(new R(5)));    // ④
        System.out.println(ts);
    }
}
