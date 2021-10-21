package DAY23.Demo.Demo07;

import java.io.InputStream;

/**
 * @author FF
 * @date 2021/10/11
 * @TIME:15:15
 */
public class test {
    public static void main(String[] args) {
        //系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //平台加载器
        ClassLoader classLoder1 = systemClassLoader.getParent();
        //自定义加载器
        ClassLoader classLoder2 = systemClassLoader.getParent();
        //利用加载器加载灵石文件
//        参数：文件的路径
//                返回值。字节流
        InputStream ra = systemClassLoader.getResourceAsStream("file.txt");

        System.out.println(systemClassLoader);
        System.out.println(classLoder1);
        System.out.println(classLoder2);
    }
}
