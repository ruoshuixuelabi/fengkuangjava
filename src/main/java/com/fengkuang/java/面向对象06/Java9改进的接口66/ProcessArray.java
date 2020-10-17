package com.fengkuang.java.面向对象06.Java9改进的接口66;
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        for (var t : target) {
            cmd.process(t);
        }
    }
}