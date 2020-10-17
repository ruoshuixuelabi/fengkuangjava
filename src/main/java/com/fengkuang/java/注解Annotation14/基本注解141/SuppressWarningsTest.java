package com.fengkuang.java.注解Annotation14.基本注解141;
import java.util.*;
/**
 * 关闭整个类里的编译器警告
 * @author mzk
 */
@SuppressWarnings(value = "unchecked")
public class SuppressWarningsTest {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();     // ①
    }
}