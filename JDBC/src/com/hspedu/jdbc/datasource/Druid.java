package com.hspedu.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class Druid {
    //1.加入Druid jar包
    //2.加入配置文件druid.properties,将该文件拷贝项目的src目录●
    //3,创建Properties对象，读取配置文件
    @Test
    public void testDruid() throws Exception {
        long start = System.currentTimeMillis();
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/druid.properties"));

        //4.创建一个指定参数的数据库连接池，Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
//        Connection connection = dataSource.getConnection();
//        connection.close();

        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }
}
