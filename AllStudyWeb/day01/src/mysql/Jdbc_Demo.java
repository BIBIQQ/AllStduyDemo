package mysql;

import java.sql.*;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/19
 * @TIME:18:42
 */
public class Jdbc_Demo {
    public static void main(String[] args) throws Exception {
        //创建连接
        Class.forName("com.mysql.jdbc.Driver");
        String url ="jdbc:mysql:///day03_jdbc?useServerPrepStmts=true";
        String user = "root";
        String password = "root";
//        连接数据库
        Connection conn = DriverManager.getConnection(url,user,password);
//        sql语句
        String sql = "SELECT * FROM tb_user WHERE user = ?AND password = ?";
        //创建执行对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数

            Scanner sc = new Scanner(System.in);
            System.out.println("输入用户名");
            String username = sc.next();
            System.out.println("输入密码");
            String pwd = sc.next();

            pstmt.setString(1,username);
            pstmt.setString(2,pwd);
//        执行语句
            ResultSet rs = pstmt.executeQuery();
             boolean next = rs.next();
             if(next){
                 System.out.println("登录成功");
             }else{
                 System.out.println("失败");
             }


//        关闭资源
        pstmt.close();
        conn.close();
    }
}
