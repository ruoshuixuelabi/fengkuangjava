package com.fengkuang.java.MySQL数据库与JDBC编程13.事务处理137;
import java.sql.*;
import java.io.*;
import java.util.*;
public class BatchTest {
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
    public void insertBatch(String[] sqls) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                Connection conn = DriverManager.getConnection(url, user, pass)) {
            // 关闭自动提交，开启事务
            conn.setAutoCommit(false);
            // 保存当前的自动的提交模式
            boolean autoCommit = conn.getAutoCommit();
            // 关闭自动提交
            conn.setAutoCommit(false);
            try (
                    // 使用Connection来创建一个Statement对象
                    Statement stmt = conn.createStatement()) {
                // 循环多次执行SQL语句
                for (var sql : sqls) {
                    stmt.addBatch(sql);
                }
                // 同时提交所有的SQL语句
                stmt.executeLargeBatch();
                // 提交修改
                conn.commit();
                // 恢复原有的自动提交模式
                conn.setAutoCommit(autoCommit);
            }
            // 提交事务
            conn.commit();
        }
    }
    public static void main(String[] args) throws Exception {
        var tt = new TransactionTest();
        tt.initParam("mysql.ini");
        var sqls = new String[]{
                "insert into student_table values(null, 'aaa', 1)",
                "insert into student_table values(null, 'bbb', 1)",
                "insert into student_table values(null, 'ccc', 1)",
        };
        tt.insertInTransaction(sqls);
    }
}