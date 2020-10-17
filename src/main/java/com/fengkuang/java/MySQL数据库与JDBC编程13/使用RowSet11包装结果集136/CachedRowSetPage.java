package com.fengkuang.java.MySQL数据库与JDBC编程13.使用RowSet11包装结果集136;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;
public class CachedRowSetPage {
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
    public CachedRowSet query(String sql, int pageSize, int page) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            // 使用RowSetProvider创建RowSetFactory
            RowSetFactory factory = RowSetProvider.newFactory();
            // 创建默认的CachedRowSet实例
            CachedRowSet cachedRs = factory.createCachedRowSet();
            // 设置每页显示pageSize条记录
            cachedRs.setPageSize(pageSize);
            // 使用ResultSet装填RowSet，设置从第几条记录开始
            cachedRs.populate(rs, (page - 1) * pageSize + 1);
            return cachedRs;
        }
    }
    public static void main(String[] args) throws Exception {
        var cp = new CachedRowSetPage();
        cp.initParam("mysql.ini");
        CachedRowSet rs = cp.query("select * from student_table", 3, 2);   // ①
        // 向后滚动结果集
        while (rs.next()) {
            System.out.println(rs.getString(1)
                    + "\t" + rs.getString(2)
                    + "\t" + rs.getString(3));
        }
    }
}