package Day21.Work.work01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:18:43
 */
/*
* 请使用“便捷字符流”配合数组将文件"窗里窗外"的内容打印到控制台,并统计出读文本共使用的时间;
* */
public class test {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\HEIMA\\NOTE\\DAY20_File和IOl流\\2021-10-06\\作业\\窗里窗外.txt"));

        char[] chars = new char[8192];
        int len;
        while ((len = bufferedReader.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        bufferedReader.close();
        long end = System.currentTimeMillis();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("读取文件共使用了："+(end - start)+"毫秒");
    }
}
