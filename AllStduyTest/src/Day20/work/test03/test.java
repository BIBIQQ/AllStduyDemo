package Day20.work.test03;

import java.io.File;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:18:13
 */
/*请在D盘下创建一个目录“多级目录”，下面随意创建一些文件和目录。

        请编写main()方法，创建以下File对象：

        File file = new File(“D:\多级目录”);

        要求：

        遍历这个多级文件夹下的所有内容(包含子文件夹的内容)，判断每个File对象是否文件

        如果是文件，打印：【文件】+ 绝对路径

        如果是目录，打印：【目录】+ 绝对路径*/

public class test {
    public static void main(String[] args) {
        File file = new File("目录A");
        method(file);
    }

    public static void method(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("文件  "+file1.getAbsolutePath());
            }else if(file1.isDirectory()){
                System.out.println("目录  "+file1.getAbsolutePath());
                method(file1);
            }
        }
    }
}
