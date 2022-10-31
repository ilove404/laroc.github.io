package com.hspedu.jdbc.preparedStatement;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class preparedStatement {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入名字: ");
//        String admin_name =scanner.nextLine();
//        System.out.println("输入密码: ");
//        String admin_pwd = scanner.nextLine();


        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        //得到连接
        Connection connection  = DriverManager.getConnection(url,user,password);

        //3.得到PreparedStatement
        //3.1组织SqL,Sq1语句的？就相当于占位符
        //3.2 preparedstatement对象实现了Preparedstatement接口的实现类的对象
        //3.3给？赋值
        String sql=" select name, pwd from admin where name =? and pwd = ? ";
        //得到prepareStatement
        String sql1=" insert into admin values(null,?,?) ";
        String sql2=" update  admin set name = ? where id = ? ";
        String sql3=" delete from admin  where name = ? ";


        PreparedStatement prepareStatement = connection.prepareStatement(sql1);
        prepareStatement.setString(1,"q");
        prepareStatement.setString(2,"123");
        int resultSet = prepareStatement.executeUpdate();

        try {
            connection.setAutoCommit(false);
            PreparedStatement prepareStatement1 = connection.prepareStatement(sql1);
            prepareStatement.setString(1,"w");
            prepareStatement.setString(2,"123");
            int resultSet1 = prepareStatement.executeUpdate();
            int i = 1/0;
            PreparedStatement prepareStatement2 = connection.prepareStatement(sql1);
            prepareStatement.setString(1,"e");
            prepareStatement.setString(2,"123");
            int resultSet2 = prepareStatement.executeUpdate();
            connection.commit();
        }catch (SQLException e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            if (resultSet > 0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }

            //关闭连接
            prepareStatement.close();
            connection.close();
        }



    }
}
