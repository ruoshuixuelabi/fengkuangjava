package com.fengkuang.java.Java基础类库07.Java11改进的国际化与格式化77;
import java.util.*;
/**
 * 通过该程序就可获得Java所支持的国家/语言环境
 * @author mzk
 */
public class LocaleList {
    public static void main(String[] args) {
        // 返回Java所支持的全部国家和语言的数组
        Locale[] localeList = Locale.getAvailableLocales();
        // 遍历数组的每个元素，依次获取所支持的国家和语言
        for (var i = 0; i < localeList.length; i++) {
            // 输出出所支持的国家和语言
            System.out.println(localeList[i].getDisplayCountry()
                    + "=" + localeList[i].getCountry() + " "
                    + localeList[i].getDisplayLanguage()
                    + "=" + localeList[i].getLanguage());
        }
    }
}