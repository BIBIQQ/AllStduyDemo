package Day20.work.test06;

import java.io.*;
import java.util.*;

/**
 * @author FF
 * @date 2021/10/2
 * @TIME:18:38
 */
/*文件读，升序写入*/
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("TcpSend.txt"));
        TreeSet<student> treeSet = new TreeSet<>();
        String len;
        while ((len = bufferedReader.readLine())!= null) {
//        bufferedReader.close();
            //分割字符串
            String[] arr = len.split(",");
            int age = Integer.parseInt(arr[1]);
            treeSet.add(new student(arr[0],age));
        }

        bufferedReader.close();
        //重新排序写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("TcpSend.txt"));
        for (student student : treeSet) {
            String name = student.getName();
            int age = student.getAge();
            bufferedWriter.write(name+","+age);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
class student{
    private String name;
    private int age;

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public int compareTo(student o) {
        int result = this.getAge()-o.getAge();
        result =  result == 0 ? this.getName().compareTo(o.getName()) :result;
        return result;
    }
}