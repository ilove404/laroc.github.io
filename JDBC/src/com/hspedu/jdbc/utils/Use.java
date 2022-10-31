package com.hspedu.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Use {
    public static void main(String[] args) {
        //1.得到连接
            Connection connection = null;//扩大作用域，是的finally中的值能被关闭
        //2.组织一个sq1
            String sql = "update actor set name=? where id=?";
        //3.创建Preparedstatement对象
            PreparedStatement preparedstatement = null;//扩大作用域，是的finally中的值能被关闭
         try{
             connection = JDBCUtils.getConnection();
             preparedstatement = connection.prepareStatement(sql);
             preparedstatement.setString(1,"liuao");
             preparedstatement.setInt(2,2);
             preparedstatement.executeUpdate();

         } catch (SQLException e) {
                throw new RuntimeException(e);
         } finally{
            JDBCUtils.close(null,preparedstatement,connection);

         }
    }
}

