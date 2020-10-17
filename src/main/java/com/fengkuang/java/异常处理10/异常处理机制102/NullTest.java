package com.fengkuang.java.异常处理10.异常处理机制102;
import java.util.*;
public class NullTest {
    public static void main(String[] args) {
        Date d = null;
        try {
            System.out.println(d.after(new Date()));
        } catch (NullPointerException ne) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("未知异常");
        }
    }
}