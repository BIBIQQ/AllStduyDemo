package Demo.ManagerDao;

import Demo.Message.Subway;

import java.io.*;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:14:44
 */
public class SubwayDao {
    //提供地铁信息的集合
    public HashMap<String, Subway> FoundAllSubway() throws IOException {
        //创建输入流
        BufferedReader br= new BufferedReader(new FileReader("E:\\HEIMA\\Demo\\AllStduyTest\\方磊-10-12\\src\\Demo\\Message\\subways.txt"));
        //创建地铁信息集合- HashMap
        HashMap<String, Subway> allSubway = new HashMap<>();
        //读取文档内容
        String line;
        while ((line = br.readLine()) != null){
            String[] split = line.split(",");
            allSubway.put(split[0],new Subway(split[0],split[1],split[2]));
        }
        br.close();

        return allSubway;
    }

    public boolean addSubway(String id, String name, String line) throws IOException {
        //创建字符输入流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\HEIMA\\Demo\\AllStduyTest\\方磊-10-12\\src\\Demo\\Message\\subways.txt",true));
        HashMap<String, Subway> allSubway = FoundAllSubway();
        //判断是否存在  存在不录入
        if(!allSubway.containsKey(id)){
            bufferedWriter.newLine();
            bufferedWriter.write(new String(id+","+name+","+line));
            bufferedWriter.close();
            return true;
        }
       return  false;
    }
}
