package com.fengkuang.java.数据类型和运算符03;
public class UnderscoreTest {
    public static void main(String[] args) {
        // 定义一个32位的二进制数,最高位是符号位。
        int binVal = 0B1000_0000_0000_0000_0000_0000_0000_0011;
        double pi = 3.14_15_92_65_36;
        System.out.println("binVal="+binVal);
        System.out.println("pi="+pi);
        double height = 8_8_4_8.23;
        System.out.println("height="+height);
    }
}