package com.fengkuang.java.输入输出15.Java9改进的对象序列化158;
import java.io.*;
public class SerializeMutable {
    public static void main(String[] args) {
        try (
                // 创建一个ObjectOutputStream输入流
                var oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("mutable.txt"))) {
            var per = new Person("孙悟空", 500);
            // 系统会per对象转换字节序列并输出
            oos.writeObject(per);
            // 改变per对象的name实例变量
            per.setName("猪八戒");
            // 系统只是输出序列化编号，所以改变后的name不会被序列化
            oos.writeObject(per);
            var p1 = (Person) ois.readObject();    // ①
            var p2 = (Person) ois.readObject();    // ②
            // 下面输出true，即反序列化后p1等于p2
            System.out.println(p1 == p2);
            // 下面依然看到输出"孙悟空"，即改变后的实例变量没有被序列化
            System.out.println(p2.getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}