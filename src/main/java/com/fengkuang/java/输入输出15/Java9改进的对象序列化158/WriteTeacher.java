package com.fengkuang.java.输入输出15.Java9改进的对象序列化158;
import java.io.*;
public class WriteTeacher {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输出流
                var oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            var per = new Person("孙悟空", 500);
            var t1 = new Teacher("唐僧", per);
            var t2 = new Teacher("菩提祖师", per);
            // 依次将四个对象写入输出流
            oos.writeObject(t1);
            oos.writeObject(t2);
            oos.writeObject(per);
            oos.writeObject(t2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}