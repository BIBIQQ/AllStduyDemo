package Day20.Demo.IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author FF
 * @date 2021/9/29
 * @TIME:17:20
 */
public class IORead {
    public static void main(String[] args) throws IOException {
        FileInputStream fos = new FileInputStream("E:\\HEIMA\\HEIMA\\aaa.txt");
        // 遍历的元素，会覆盖旧的元素
        byte[] bytes = new byte[2];
        //长度，控制输出的长度，避免出现多出的输出元素
        int len;
        while ((len = fos.read(bytes)) != -1) {
            System.out.println(Arrays.toString(bytes));
        }
        fos.close();
    }
}
