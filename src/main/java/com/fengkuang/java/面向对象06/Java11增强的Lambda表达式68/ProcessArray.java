package com.fengkuang.java.面向对象06.Java11增强的Lambda表达式68;
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (var t : target) {
            cmd.process(t);
        }
    }
}