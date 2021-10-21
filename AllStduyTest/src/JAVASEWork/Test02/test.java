package JAVASEWork.Test02;

import java.io.*;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:19:35
 */
public class test {
    public static void main(String[] args) throws IOException {
//        创建输出字节流
        FileInputStream fis = new FileInputStream("E:\\aaa.avi");
        FileOutputStream fos = new FileOutputStream("E:\\aaa-123.avi");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
