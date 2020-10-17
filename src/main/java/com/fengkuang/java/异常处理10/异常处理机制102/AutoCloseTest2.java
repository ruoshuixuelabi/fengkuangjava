package com.fengkuang.java.异常处理10.异常处理机制102;

import java.io.*;

public class AutoCloseTest2 {
    public static void main(String[] args)
            throws IOException {
        // 有final修饰的资源
        final var br = new BufferedReader(new FileReader("AutoCloseTest.java"));
        // 没有显式使用final修饰，但只要不对该变量重新赋值，按该变量就是有效的final
        var ps = new PrintStream(new FileOutputStream("a.txt"));
        // 只要将两个资源放在try后的圆括号内即可
        try (br; ps) {
            // 使用两个资源
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }
    }
}
