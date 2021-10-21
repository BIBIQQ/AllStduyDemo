package Day21.Work.work02;


import java.io.*;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:18:43
 */

/*
* 将下列文件中的学生信息按照年龄升序排序后重新写回原文件;

要求:

1:使用字符缓冲流完成;

2:每次循环读取一行信息

3:写数据的时候换行使用newLine方法;

* */
public class test {
    public static void main(String[] args) throws IOException {
        //字符缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\Day21\\Work\\work02\\TcpSend.txt"));
        //使用TreeSet排序
        TreeSet<Student> treeSet = new TreeSet<Student>();
        // 读取文件
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(",");
            treeSet.add(new Student(split[0],Integer.parseInt(split[1])));
        }
        bufferedReader.close();
        // 写入到文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\Day21\\Work\\work02\\TcpSend.txt"));
        for (Student student : treeSet) {
            bufferedWriter.write(student.getName()+","+student.getAge());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
