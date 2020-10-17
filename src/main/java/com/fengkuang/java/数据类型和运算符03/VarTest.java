package com.fengkuang.java.数据类型和运算符03;
public class VarTest {
    public static void main(String[] args) {
        var a = 20;  // 被赋的值为20，因此a的类型是int
        System.out.println(a);
        // a = 1.6; // 这行代码会报错：不兼容的类型
        var b = 3.4; // 被赋的值为3.4，因此b的类型是float
        System.out.println(b);
        var c = (byte) 13;
        System.out.println(c);
        // c = a; // 这行代码会报错：不兼容的类型
//		var d; // 这行代码报错：无法推断局部变量 d 的类型
        var st = "Hello"; // 被赋值为"Hello"，因此st的类型是String
//        st = 5; // 这行代码会报错：不兼容的类型
    }
}