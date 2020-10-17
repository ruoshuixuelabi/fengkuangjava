package com.fengkuang.java.面向对象06.内部类67;

class Out {
    // 定义一个内部类，不使用访问控制符，
    // 即只有同一个包中其他类可访问该内部类
    class In {
        public In(String msg) {
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("测试信息");
		/*
		上面代码可改为如下三行代码：
		使用OuterClass.InnerClass的形式定义内部类变量
		Out.In in;
		创建外部类实例，非静态内部类实例将寄存在该实例中
		Out out = new Out();
		通过外部类实例和new来调用内部类构造器创建非静态内部类实例
		in = out.new In("测试信息");
		*/
    }
}
