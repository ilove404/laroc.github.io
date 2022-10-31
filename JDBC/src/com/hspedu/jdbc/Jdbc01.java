package com.hspedu.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //前置工作：在项目下创建一个文件夹比如1ibs
        //将mysql,jar拷贝到该目录下，点击add to project,,加入到项目中
        //1.注册驱动
        Driver driver = new Driver();
        ///12.得到连接
        //老师解读
        ///(1)jdbc:mysql:/规定好表示协议，通过jdbc的方式连接mysq
        ///(2)Localhost主机，可以是ip地址
        ///(3)3306表示nysql监听的端口
        //(4)hsp_db02连接到nysql dbms的哪个数据库
        //(5)mysql的连接本质就是前面学过的socket连接
        String url = "jdbc:mysql://localhost:3306/db01";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123");
        Connection connect = driver.connect(url, properties);
        ///3.执行sg1
//        String sql="insert into actor values(null,'刘德华','男','1970-1-1','110')";
//        String sql="update  actor set name='周星驰' where id = 1";
        String sql = "delete from  actor where id = 1";
        //statement用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);

        ///14。关闭连接资源
        statement.close();
        connect.close();




    }
}
