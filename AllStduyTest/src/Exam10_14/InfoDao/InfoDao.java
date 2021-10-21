package Exam10_14.InfoDao;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:18:55
 */
public class InfoDao {
    //注册用户
    public boolean SignIn(String name, String password) throws IOException {
        //判断输入的用户名，集合里面是否存在
        HashMap<String, String> allUser = AllUser();
        if(!allUser.containsKey(name)){
            //存入到本地文件
            WriterUser(name,password);
            return true;
        }
        return false;
    }

    //获取文档里面的用户
    public HashMap<String, String> AllUser() throws IOException {
        //获取本地文件路径
        BufferedReader bf = new BufferedReader(new FileReader("src\\Exam10_14\\InfoDao\\InfoUser.txt"));
        //存入集合
        HashMap<String, String> UserMap = new HashMap<>();
        //逐行遍历
        String line;
        while ((line = bf.readLine()) != null) {
            String[] split = line.split(",");
            UserMap.put(split[0],split[1]);
        }
        bf.close();
      return UserMap;
    }

    //写入到本地文件
    public void WriterUser(String name,String password) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Exam10_14\\InfoDao\\InfoUser.txt",true));
        bw.write(new String( name+","+password));
        bw.newLine();
        bw.close();
    }
    //修改密码
    public void SetPassword(String username, String newpassword) throws IOException {
        HashMap<String, String> allUser = AllUser();
        BufferedReader bf = new BufferedReader(new FileReader("src\\Exam10_14\\InfoDao\\InfoUser.txt"));
        String line;
        while ((line = bf.readLine()) != null) {
            String[] split = line.split(",");

        }

    }
}