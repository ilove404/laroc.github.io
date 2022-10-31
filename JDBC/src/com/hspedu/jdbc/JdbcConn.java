package com.hspedu.jdbc;

import com.mysql.jdbc.Driver;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/*
java连接mysql 的5种方式
 */
public class JdbcConn {
    @Test
    public void connect01 () throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123");
        Connection connect = driver.connect(url, properties);

    }
    public void connect02 () throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //使用反射加载Driver类，动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver =(Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123");

        Connection connect = driver.connect(url, properties);

    }

    public void connect03 () throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //使用反射加载Driver类，动态加载，更加的灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver =(Driver) aClass.newInstance();

        //创建urL和User和password
        String url = "jdbc:mysql://Localhost:3306/hsp_db02";
        String user ="root";
        String password ="hsp";
        DriverManager.registerDriver(driver);//注册Driver驱动
        Connection connection  = DriverManager.getConnection(url,user,password);
        System.out.println("第三种方式="+connection);

    }

    public void connect04 () throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //使用反射加载Driver类，动态加载，更加的灵活，减少依赖性

        /*
        源码：1，静态代码块，在类加载时，会执行一次。
        2.DriverManager.registerDriver(new Driver());
        static
            try
                DriverManager.registerDriver(new Driver);
            catch (SQLException var1){
                throw new RuntimeException("Can't register driver!");
        }
    }
    */
        Class.forName("com.mysql.jdbc.Driver");

        //创建urL和User和password
        String url = "jdbc:mysql://Localhost:3306/hsp_db02";
        String user ="root";
        String password ="hsp";

        Connection connection  = DriverManager.getConnection(url,user,password);
    }
    @Test
    public void connect05 () throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        //使用反射加载Driver类，动态加载，更加的灵活，减少依赖性
        Class.forName("com.mysql.jdbc.Driver");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Connection connection  = DriverManager.getConnection(url,user,password);
        System.out.println(connection);


    }
}
