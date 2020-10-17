package com.fengkuang.java.输入输出15.输入输出流体系154;
import java.io.*;
public class StringNodeTest {
    public static void main(String[] args) {
        var src = "从明天起，做一个幸福的人\n"
                + "喂马，劈柴，周游世界\n"
                + "从明天起，关心粮食和蔬菜\n"
                + "我有一所房子，面朝大海，春暖花开\n"
                + "从明天起，和每一个亲人通信\n"
                + "告诉他们我的幸福\n";
        var buffer = new char[32];
        var hasRead = 0;
        try (
                var sr = new StringReader(src)) {
            // 采用循环读取的访问读取字符串
            while ((hasRead = sr.read(buffer)) > 0) {
                System.out.print(new String(buffer, 0, hasRead));
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        try (
                // 创建StringWriter时，实际上以一个StringBuffer作为输出节点
                // 下面指定的20就是StringBuffer的初始长度
                var sw = new StringWriter(20)) {
            // 调用StringWriter的方法执行输出
            sw.write("有一个美丽的新世界，\n");
            sw.write("她在远方等我,\n");
            sw.write("那里有天真的孩子，\n");
            sw.write("还有姑娘的酒窝\n");
            System.out.println("----下面是sw的字符串节点里的内容----");
            // 使用toString()方法返回StringWriter的字符串节点的内容
            System.out.println(sw.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}