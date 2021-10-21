package Day20.work.test04;

import java.io.File;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:18:22
 */
/*请使用代码计算出你电脑上的任意一个文件夹中的大小。

要求：

必须是一个多层文件夹;
*/
public class test {
    public static void main(String[] args) {
        File file = new File("E:\\HEIMA\\NOTE\\DAY20_File和IOl流\\");
        System.out.println("常用的文件夹的总大小是：" + method(file) + "字节");
    }

    public static long method(File file) {
        long bytesum = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                bytesum += file1.length();
            } else {
                method(file1);
            }
        }
        return bytesum;
    }
}
