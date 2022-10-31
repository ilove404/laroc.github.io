package com.hspedu.jdbc.statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Statement_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字");
        String admin_name =scanner.nextLine();
        System.out.println("输入密码");
        String admin_pwd = scanner.nextLine();

        Class.forName("com.mysql.jdbc.Driver");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        Connection connection  = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        /*                    注入
        输入名字
        1' or
        输入密码
        or '1'= '1
        成功*/
        String sql=" select name, pwd from admin where name ='"+admin_name+"' and pwd = '"+admin_pwd+"' ";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }


    }
}
