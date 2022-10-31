package Properties;

import java.io.*;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
//使用Properties类来读取nysql.properties文件
//1. 创建Properties对象
        Properties properties = new Properties();
//2。加载指定配置文件
        properties.load(new FileReader("./src/mysql.properties"));
//3.把k-V显示控制台
        properties.list(System.out);
        //4。根据key获取对应的值
        String user  = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名=" + user);
        System.out.println("密码是=" + pwd);


        //使用Properties类来创建配置文件，修改配置文件内容
        Properties properties1 =new Properties();
        //创建
        //1,如果该文件没有key就是创建
        //2.如果该文件有key,就是修改
        //底层是hashtable

        properties1.setProperty("charset","utf8");
        properties1.setProperty("user","汤姆");//保存时候是保存的Unicode码
        properties1.setProperty("pwd","abc111666");
//将k-V存储文件中即可
        FileOutputStream fileWriter = new FileOutputStream("src/mysql2.properties") ;
        properties1.store(fileWriter,null);
    }
}