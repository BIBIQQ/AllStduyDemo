package Day20.Demo.IODemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:15:59
 */
public class IOReadDemo {
    public static void main(String[] args) throws IOException {
        //如果文件不存在，报异常
        FileInputStream fos = new FileInputStream("E:\\HEIMA\\HEIMA\\aaa.txt");
//        方式一
        int b = 0;
        while ( (b =fos.read()) != -1) {
            System.out.print((char) b);
        }

        System.out.println( );
        System.out.println("-----------------");

//        方式二
        while (true){
            int read1 = fos.read();
            if(read1 == -1){
                break;
            }
            System.out.print((char) read1);
        }
        fos.close();
    }
}
