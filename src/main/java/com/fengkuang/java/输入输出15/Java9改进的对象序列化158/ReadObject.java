package com.fengkuang.java.输入输出15.Java9改进的对象序列化158;
import java.io.*;
public class ReadObject {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
            // 从输入流中读取一个Java对象，并将其强制类型转换为Person类
            var p = (Person) ois.readObject();
            System.out.println("名字为：" + p.getName() + "\n年龄为：" + p.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}