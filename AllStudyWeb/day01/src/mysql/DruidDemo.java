package mysql;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author FF
 * @date 2021/10/18
 * @TIME:14:52
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 导入架包

        // 定义配置文件

        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("day01/src/druid.properties"));
        // 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        // 获取对应的数据库连接
        Connection conn = dataSource.getConnection();

        System.out.println(conn);

        // System.out.println(System.getProperty("user.dir"));
    }

}
