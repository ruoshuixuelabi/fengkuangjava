package com.fengkuang.java.面向对象06.Java11增强的Lambda表达式68;
public class CommandTest {
    public static void main(String[] args) {
        var pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        // 处理数组，具体处理行为取决于匿名内部类
        pa.process(target, new Command() {
            @Override
			public void process(int element) {
                System.out.println("数组元素的平方是:" + element * element);
            }
        });
    }
}