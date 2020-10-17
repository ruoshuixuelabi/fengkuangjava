package com.fengkuang.java.输入输出15.Java9改进的对象序列化158.transients;
import java.io.*;
public class TransientTest {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输出流
                var oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("transient.txt"))) {
            var per = new Person("孙悟空", 500);
            // 系统会per对象转换字节序列并输出
            oos.writeObject(per);
            var p = (Person) ois.readObject();
            System.out.println(p.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}