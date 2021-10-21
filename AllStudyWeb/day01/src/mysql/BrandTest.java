package mysql;

import DruidDemo.pojo.Brand;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/19
 * @TIME:19:13
 */
public class BrandTest {
    public static void main(String[] args) throws Exception {
//        add();
//        Drop();
//        set();
//        select();

    }


    /*
    * 增加
    * insert into tb_brand (brand_name, company_name, ordered, description, status)
        values ('王老吉', '王老吉股份有限公司', 5, '怕上火喝王老吉', 2);
    * */
    public static void add() throws Exception {
        Scanner sc = new Scanner(System.in);

        //连接数据库
        Properties pro = new Properties();
        pro.load(new FileInputStream("day01/src/druid.properties"));
        // 数据池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        连接数据库
        Connection conn = dataSource.getConnection();
//        sql语句
        String sql = "insert into tb_brand (brand_name, company_name, ordered, description, status)\n" +
                "        values (?,?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        System.out.println("输入品牌");
        String brandNanme = sc.next();
        System.out.println("输入公司");
        String companyName = sc.next();
        System.out.println("排序");
        int ordred = sc.nextInt();
        System.out.println("描述信息");
        String decription = sc.next();
        System.out.println("商品状态");
        int status = sc.nextInt();

        pstmt.setString(1,brandNanme);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordred);
        pstmt.setString(4,decription);
        pstmt.setInt(5,status);

        try {
//            开启事务
            conn.setAutoCommit(false);
//        执行语句
            int i = pstmt.executeUpdate();
//        释放资源
           if(i>0){
               System.out.println("添加成功");
           }
//            结束事务
            conn.commit();
        } catch (Exception e) {
            System.out.println("添加失败");
//            回滚事务
            conn.rollback();
            e.printStackTrace();
        }


        pstmt.close();
        conn.close();
    }

    /*
     * 删除
     *DELETE FROM tb_brand WHERE id = 4;
     * DELETE FROM tb_brand WHERE brand_name like "%?%";
     *
     * */
    public static void Drop() throws Exception {
    // 创建连接
        Properties pro = new Properties();
        pro.load(new FileInputStream("day01/src/druid.properties"));
//        创建连接对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        连接数据库
        Connection conn = dataSource.getConnection();
        String sql = "DELETE FROM tb_brand WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

//        设置参数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要删除的id");
        int id = sc.nextInt();

        pstmt.setInt(1,id);
        try {
//        开启事务
            conn.setAutoCommit(false);
//      执行语句
            int i = pstmt.executeUpdate();

            if (0 < i) {
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
//        结束事务
            conn.commit();
        } catch (SQLException e) {
//            回滚事务
            conn.rollback();
            e.printStackTrace();
        }


//        释放资源
        pstmt.close();
        conn.close();

    }

    /*
     * 修改
     *UPDATE tb_brand  SET brand_name = ?, company_name = ? , ordered = ?,description = ?  status WHERE id = ?;
     *
     * */
    public static void set() throws Exception{
        Scanner sc = new Scanner(System.in);
//         创建连接
        Properties pro = new Properties();
        pro.load(new FileInputStream("day01/src/druid.properties"));
//        创建连接对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        连接数据库
        Connection conn = dataSource.getConnection();
//        sql语句
        String sql = "UPDATE tb_brand  SET brand_name = ?, company_name = ? , ordered = ?,description = ? ,status =? WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

//        设置参数
//                设置参数
        System.out.println("输入需要修改的id");
        int id = sc.nextInt();
        System.out.println("输入品牌");
        String brandNanme = sc.next();
        System.out.println("输入公司");
        String companyName = sc.next();
        System.out.println("排序");
        int ordred = sc.nextInt();
        System.out.println("描述信息");
        String decription = sc.next();
        System.out.println("商品状态");
        int status = sc.nextInt();

        pstmt.setString(1,brandNanme);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordred);
        pstmt.setString(4,decription);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);


        try {
//          开启事务
            conn.setAutoCommit(false);
//          执行语句
            int i = pstmt.executeUpdate();
//        处理结果
            if (0 < i) {
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }
//        结束事务
            conn.commit();
        } catch (SQLException e) {
//            回滚事务
            conn.rollback();
            e.printStackTrace();
        }

        pstmt.close();
        conn.close();

    }

    /*
     * 精确查询
     *UPDATE tb_brand  SET brand_name = ?, company_name = ? , ordered = ?,description = ?  status WHERE id = ?;
     *
     * */
    public static void select() throws Exception{
        Scanner sc = new Scanner(System.in);
//         创建连接
        Properties pro = new Properties();
        pro.load(new FileInputStream("day01/src/druid.properties"));
//        创建连接对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        连接数据库
        Connection conn = dataSource.getConnection();
//        全部
        String sql = "SELECT * FROM tb_brand";
//      指定
        String sql1 = "SELECT * FROM tb_brand WHERE id = ?";
//        模糊
        String sql2 = "SELECT * FROM tb_brand WHERE brand_name like  ? ";


//        创建对象
        PreparedStatement pstmt = conn.prepareStatement(sql2);
//        设置参数
//        System.out.println("输入需要查询的id");
//        int sid = sc.nextInt();
//        pstmt.setInt(1,sid);

        System.out.println("输入想要查询的公司");
        String next = sc.next();
        pstmt.setString(1,"%"+next+"%");

//      执行语句
        ResultSet rs = pstmt.executeQuery();
//        存储到集合
        ArrayList<Brand> list = new ArrayList<>();
//        输出结果
        while (rs.next()) {
            //获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
//          存到集合
            Brand brand = new Brand(id,brandName,companyName,ordered,description,status);

           list.add(brand);
        }

        for (Brand brand : list) {
            System.out.println(brand);
        }
        pstmt.close();
        conn.close();
    }
}
