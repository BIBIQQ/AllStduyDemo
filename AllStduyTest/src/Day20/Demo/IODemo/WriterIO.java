package Day20.Demo.IODemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:15:01
 */
public class WriterIO {
    public static void main(String[] args) throws IOException {
//         创建输出流
        FileOutputStream fos = new FileOutputStream("E:\\HEIMA\\HEIMA\\aaa.txt",true);

//        写数据
        fos.write("ABC".getBytes());//如果是int，输入SCALL码表值

//        关闭流
        fos.close();
    }
}
