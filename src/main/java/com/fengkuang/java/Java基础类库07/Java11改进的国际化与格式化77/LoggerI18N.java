package com.fengkuang.java.Java基础类库07.Java11改进的国际化与格式化77;
import java.util.logging.*;
import java.util.*;
public class LoggerI18N {
    public static void main(String[] args) throws Exception {
        // 加载国际化资源包
        var rb = ResourceBundle.getBundle("logMess", Locale.getDefault(Locale.Category.FORMAT));
        // 获取System.Logger对象
        var logger = System.getLogger("fkjava", rb);
        // 设置系统日志级别
        Logger.getLogger("fkjava").setLevel(Level.INFO);
        // 设置使用a.xml保存日志记录
        Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
        // 下面3个方法的第二个参数是国际化消息的key
        logger.log(System.Logger.Level.DEBUG, "debug");
        logger.log(System.Logger.Level.INFO, "info");
        logger.log(System.Logger.Level.ERROR, "error");
    }
}