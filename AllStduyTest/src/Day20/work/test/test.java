package Day20.work.test;

import java.io.File;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:17:25
 */
public class test {
    public static void main(String[] args) {
        File file2 = new File("测试目录");
        File file = new File("TcpSend.txt");
        String s = file.getAbsolutePath();
        System.out.print("文件1的绝对路径是：");
        System.out.println(s);
        System.out.print("文件夹1的绝对路径是：");
        String jiapath = file2.getAbsolutePath();
        System.out.println(jiapath);
        System.out.print("文件1的名称是：");
        String filename = file.getName();
        System.out.println(filename);
        System.out.print("文件夹1的名称是：");
        String flodername = file2.getName();
        System.out.println(flodername);
        System.out.print("文件1的大小是：");
        long fileSpace = file.length();
        System.out.println(fileSpace);
        System.out.print("文件1表示的文件夹存在吗：");
        boolean fileresult = file.exists();
        System.out.println(fileresult);
        System.out.print("文件夹1表示的文件夹存在吗：");
        boolean floderresult = file2.exists();
        System.out.println(floderresult);
        System.out.print("文件1表示的是文件吗：");
        boolean isfile = file.isFile();
        System.out.println(isfile);
        System.out.print("文件2表示的是文件吗：");
        boolean isfloder = file2.isFile();
        System.out.println(isfloder);
    }
}
