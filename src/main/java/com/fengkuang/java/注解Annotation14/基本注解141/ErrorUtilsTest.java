package com.fengkuang.java.注解Annotation14.基本注解141;
import java.util.*;
public class ErrorUtilsTest {
    public static void main(String[] args) {
        ErrorUtils.faultyMethod(Arrays.asList("Hello!"),
                Arrays.asList("World!"));        // ①
    }
}