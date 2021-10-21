package Day21.Demo.Demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:20
 */
public class test {
    public static void main(String[] args) throws IOException {
        /*
        * 注意事项：
        * 1.文件不存在，会生成，保证父级路径存在
        * 2.如果文件存在，会清空文件内容
        * */
        FileWriter fileWriter = new FileWriter("src\\Day21\\TcpSend.txt");
//      写的是ASCll的码表值
        fileWriter.write(98);
        fileWriter.write("\r\n");

        char[] chars = {11,12,19};
        fileWriter.write(chars);
        fileWriter.write(chars,0,2);
        fileWriter.write("\r\n");
//      写的是字符串
        String line = "黑马程序员";
        fileWriter.write(line);
        fileWriter.write(line,0,2);
        fileWriter.write("\r\n");
//        结束必须关流
        fileWriter.close();
    }
}
