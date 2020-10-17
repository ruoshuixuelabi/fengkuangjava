package com.fengkuang.java.Java基础类库07.Java11改进的国际化与格式化77;
import java.util.*;
/**
 * @author mzk
 */
public class Hello {
    public static void main(String[] args) {
        // 取得系统默认的国家/语言环境
        var myLocale = Locale.getDefault(Locale.Category.FORMAT);
        // 根据指定国家/语言环境加载资源文件
        var bundle = ResourceBundle.getBundle("mess", myLocale);
        // 打印从资源文件中取得的消息
        System.out.println(bundle.getString("hello"));
    }
}