package Day20.work.test05;

import java.io.*;
import java.util.Scanner;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:18:27
 */
/*使用键盘输入多个学生的信息,并将这些学生的信息保存到模块的1.txt文件中;

要求：

1:学生信息包含姓名、年龄(用一行字符串表示即可,无需创建学生对象);

2:每个学生信息占一行,学生信息之间使用逗号分隔;

3:至少输入3个学生信息;
*/
public class test {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("TcpSend.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(file);
        Scanner sc = new Scanner(System.in);
        while (true) {
            //输入学生信息
            System.out.println("输入第一个学生姓名和年龄，学生信息之间使用逗号分割（ok表示结束）");
            String Stumessage = sc.next();
            if (Stumessage.equals("ok")) {
                break;
            }
            bufferedWriter.write(Stumessage);
            bufferedWriter.newLine();

        }
        bufferedWriter.close();
    }
}
