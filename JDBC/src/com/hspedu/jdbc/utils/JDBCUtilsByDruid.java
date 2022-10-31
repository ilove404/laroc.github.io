package com.hspedu.jdbc.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtilsByDruid {
    private  static Properties properties;
    private  static DataSource dataSource;


    static {
        try{
            properties = new Properties();
            properties.load(new FileInputStream("src/com/hspedu/mysql.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            //在实际开发中，我们可以这样处理
            //1.将编译异常转成运行异常
            //2。这是调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便
            throw new RuntimeException(e);
        }
    }
    //连接数据库，返回Connection
    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void  close(ResultSet set, Statement statement ,Connection connection){
        try {
            if(set != null){
                set.close();}
            if(statement !=null){
                statement.close();}
            if(connection !=null){
                connection.close();}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
