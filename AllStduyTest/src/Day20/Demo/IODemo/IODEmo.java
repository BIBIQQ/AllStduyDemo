package Day20.Demo.IODemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:16:41
 */
public class IODEmo {
    public static void main(String[] args) throws IOException {
//       创建字节输入流
        FileInputStream fis = new FileInputStream("E:\\HEIMA\\HEIMA\\新建 Microsoft Access 数据库.accdb");
//        创建字节输出流
        FileOutputStream fos = new FileOutputStream("E:\\HEIMA\\HEIMA\\j数据库.accdb");
//        遍历复制
//        注意复制，写入
        /* long start = System.currentTimeMillis();
        int b = 0;
        while ((b = fis.read())!= -1){
            fos.write(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);*/

//        创建字节数组批量写入
       long start = System.currentTimeMillis();
        byte[] bytes = new byte[2048];
        int len;
        while((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        关闭字节流
        fis.close();
        fos.close();
    }
}
