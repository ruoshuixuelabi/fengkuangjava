package com.fengkuang.java.异常处理10.Checked异常和Runtime异常体系103;

import java.io.*;

public class OverrideThrows {
    public void test() throws IOException {
        var fis = new FileInputStream("a.txt");
    }
}

class Sub extends OverrideThrows {
    // 子类方法声明抛出了比父类方法更大的异常
    // 所以下面方法出错
//    @Override
//    public void test() throws Exception {
//    }
}

