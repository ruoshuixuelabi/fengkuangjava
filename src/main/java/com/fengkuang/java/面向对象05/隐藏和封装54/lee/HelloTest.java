package com.fengkuang.java.面向对象05.隐藏和封装54.lee;
import com.fengkuang.java.面向对象05.隐藏和封装54.lee.sub.Apple;
public class HelloTest {
    public static void main(String[] args) {
        var h = new Hello();
        // 使用类全名的写法
        var a = new Apple();
        // 如果使用import语句来导入Apple类后，就可以不再使用类全名
        var aa = new Apple();
    }
}