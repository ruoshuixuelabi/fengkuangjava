package com.fengkuang.java.输入输出15.Java9改进的对象序列化158.replace;
import java.io.*;
import java.util.*;
public class ReplaceTest {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输出流
                var oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("replace.txt"))) {
            var per = new Person("孙悟空", 500);
            // 系统将per对象转换字节序列并输出
            oos.writeObject(per);
            // 反序列化读取得到的是ArrayList
            var list = (ArrayList) ois.readObject();
            System.out.println(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}