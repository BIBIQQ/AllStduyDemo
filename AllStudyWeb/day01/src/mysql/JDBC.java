package mysql;

import org.junit.Test;

import java.sql.*;

/**
 * @author FF
 * @date 2021/10/18
 * @TIME:10:58
 */
public class JDBC {
    public static void main(String[] args) throws Exception {
        jdbc01();
//                 jdbcDQL();

    }

    private static void jdbcDQL() throws ClassNotFoundException, SQLException {

//        注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/demotest";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);
//        定义SQL语句  DML
        String sql = "UPDATE stu set age = 44 WHERE id =1 ";
//        DQL
        String sql1 = "SELECT * FROM stu";
//        创建对象
        Statement stmt = conn.createStatement();
//        执行语句
        int i = stmt.executeUpdate(sql);
        ResultSet resultSet = stmt.executeQuery(sql1);
//        处理结果
        while (resultSet.next()) {
//            设置参数
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String age = resultSet.getString(3);
            String sex = resultSet.getString(4);
            String address = resultSet.getString(5);

            System.out.println(id);
            System.out.println(name);
            System.out.println(age);
            System.out.println(sex);
            System.out.println(address);

            System.out.println("------------------------");
        }
        System.out.println(i);
//        关闭资源
        resultSet.close();
        stmt.close();
        conn.close();
    }


    private static void jdbc01() throws ClassNotFoundException, SQLException {
        //        注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
        String url = "jdbc:mysql://192.168.31.87:3308/day03_1019_jdbc";
        String username = "root";
        String passwored = "1234";
        Connection conn = DriverManager.getConnection(url, username, passwored);
//        定义SQL语句
        String sql = "UPDATE tb_brand set ordered = 1001 WHERE id =1 ";
//        获取执行SQL对象
        Statement stmt = conn.createStatement();

        try {
//            开启事务  手动开启
            conn.setAutoCommit(false);
//        执行SQL
            int count = stmt.executeUpdate(sql);
//        返回结果
            System.out.println(count > 0);
//            提交事务
            conn.commit();
        } catch (SQLException e) {
//            回滚事务
            conn.rollback();
            e.printStackTrace();
        }

//        结束资源
        stmt.close();
        conn.close();
    }
}
