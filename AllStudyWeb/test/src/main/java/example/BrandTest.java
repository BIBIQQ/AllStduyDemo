package example;


import com.alibaba.druid.pool.DruidDataSourceFactory;


import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author FF
 * @date 2021/10/18
 * @TIME:16:55
 */

/*
* 品牌的增删改查
* */
public class BrandTest {
    /*
     * 查询所有
     * SELECT * FROM tb_brand;
     * 参数：不需要
     *
     * INSERT INTO tb_brand(brand_name,company_name,ordered,description status) VALUES(?,?,?,?,?)
     * */

    public void testSeletAll() throws Exception {
//        获取Connection
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("druid.properties"));

//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);


//         获取对应的数据库连接
        Connection conn = dataSource.getConnection();

//        定义SQL语句
        String sql = "SELECT * FROM tb_brand";

//        获取对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

//        设置参数

//        执行sql
        ResultSet rs = pstmt.executeQuery();

//        封装输出对象
        ArrayList<Brand> brands = new ArrayList<>();
        while (rs.next()) {

            //获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
//            封装Brand对象
            Brand brand = new Brand(id, brandName, companyName, ordered, description, status);
            //添加到集合
            brands.add(brand);
        }

        System.out.println(brands);
//        释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }


    /*
     * 添加
     * INSERT INTO tb_brand(brand_name,company_name,ordered,description status) VALUES(?,?,?,?,?)
     * 参数：除id外的
     * 返回
     * */
    public void testInsert() throws Exception {
        // 接受页面提交的参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "让地球三圈";
        int status = 1;
        //先配置连接池
        //导入配置文件
        Properties pro = new Properties();
        pro.load(new FileInputStream("druid.properties"));
//        连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        数据库连接
        Connection conn = dataSource.getConnection();
//        sql语句
        String sql = "INSERT INTO tb_brand(brand_name,company_name,ordered,description,status) VALUES(?,?,?,?,?)";
//        创建执行对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);

//        执行sql
       int rs = pstmt.executeUpdate();

//       处理结果
        System.out.println(rs > 0);
//        结束资源
        pstmt.close();
        conn.close();
    }


    /*
     * 添加
     * UPDATE tb_brand  SET brand_name = ?, company_name = ? , ordered = ?,description = ?  status WHERE id = ?
     * 参数：ID   需要修改的数据
     * 返回
     * */

    public void testUpdata() throws Exception{

        // 接受页面提交的参数
        int id = 4;
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String description = "让地球三十圈";
        int status = 1;

    // 创建连接池
        Properties pro = new Properties();
        pro.load(new FileInputStream("druid.properties"));
//        创建对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
//        数据库连接
        Connection conn = dataSource.getConnection();
//        sql语句
        String  sql = "UPDATE tb_brand  SET brand_name = ?, company_name = ? , ordered = ?,description = ?,status = ? WHERE id = ?";
//        获取pstmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);

//        设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered );
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);

        int i = pstmt.executeUpdate();

        System.out.println(i > 0);

        pstmt.close();
        conn.close();
    }


    /*
     * 删除
     * DELETE FROM tb_brand WHERE id = 4;
     * 参数： id
     * 返回
     * */

    public void testDrop() throws Exception{

       int id = 4;

    //创建 连接池
        Properties pro = new Properties();
        pro.load(new FileInputStream("druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = dataSource.getConnection();

        //sql语句
        String sql = "DELETE FROM tb_brand WHERE id = ?;";

        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        pstmt.setInt(1,id);

        int i = pstmt.executeUpdate();

        System.out.println(i > 0);

        pstmt.close();
        conn.close();
    }
}
