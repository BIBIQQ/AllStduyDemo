package Day20.work.test02;

import java.io.File;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:18:06
 */
/*File file1 = new File(“TcpSend.txt”);//相对路径

        File file2 = new File(“一级目录”);

        File file3 = new File(“目录A/目录B/目录C”);*/

public class test {
    public static void main(String[] args) throws IOException {
        File file1 = new File("TcpSend.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        File file2 = new File("一级目录");
        if(!file2.exists()){
            file2.mkdir();
        }
        File file3 = new File("目录A\\目录B\\目录C");
        if(!file3.exists()){
            file3.mkdirs();
        }
    }
}
