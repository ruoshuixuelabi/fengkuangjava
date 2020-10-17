package com.fengkuang.java.MySQL数据库与JDBC编程13.SQL语法132;
import java.util.*;
import java.io.*;
import java.sql.*;
public class ExecuteDML {
    private String driver;
    private String url;
    private String user;
    private String pass;
    public void initParam(String paramFile) throws Exception {
        // 使用Properties类来加载属性文件
        var props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }
    public int insertData(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                // 使用Connection来创建一个Statment对象
                Statement stmt = conn.createStatement()) {
            // 执行DML,返回受影响的记录条数
            return stmt.executeUpdate(sql);
        }
    }
    public static void main(String[] args) throws Exception {
        var ed = new ExecuteDML();
        ed.initParam("mysql.ini");
        int result = ed.insertData("insert into jdbc_test(jdbc_name, jdbc_desc)"
                + "select s.student_name, t.teacher_name "
                + "from student_table s, teacher_table t "
                + "where s.java_teacher = t.teacher_id;");
        System.out.println("--系统中共有" + result + "条记录受影响--");
    }
}