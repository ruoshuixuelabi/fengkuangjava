package com.fengkuang.java.数据类型和运算符03;
public class ThreeTest {
    public static void main(String[] args) {
        String str = 5 > 3 ? "5大于3" : "5不大于3";
        System.out.println(str); // 输出"5大于3"
        String str2 = null;
        if (5 > 3) {
            str2 = "5大于3";
        } else {
            str2 = "5不大于3";
        }
        var a = 11;
        var b = 12;
        // 三目运算符支持嵌套
        System.out.println(a > b ? "a大于b" : (a < b ? "a小于b" : "a等于b"));
    }
}