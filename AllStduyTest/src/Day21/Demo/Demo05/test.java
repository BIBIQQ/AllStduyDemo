package Day21.Demo.Demo05;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/10/6
 * @TIME:11:32
 */
/*
 * 读取排序后再次写入
 * */
public class test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src\\Day21\\TcpSend.txt"));
        //查看整行
        String line = br.readLine();
        //关流
        br.close();
        //空格切割
        String[] split = line.split(" ");
        //存入数组
        int[] arr = new int[split.length];
        //存入集合
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //遍历  字符串转换整数类型
        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            arr[i] = num;
            treeSet.add(num);
        }
        //数组排序 Arrays
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //字符缓冲流   请勿将写入书写在第一行，在使用的时候创建即可
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Day21\\TcpSend.txt"));
        //遍历数组
        for (int i : arr) {
            bw.write(i + " ");
            bw.flush();
        }
        /*//遍历集合
        for (Integer integer : treeSet) {
            bw.write(integer + " ");
            bw.flush();
        }*/
        bw.close();
    }
}
