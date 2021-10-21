package Demo.ManagerServce;

import Demo.ManagerDao.SubwayDao;
import Demo.Message.Subway;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:15:06
 */
public class SubwayServer {
    SubwayDao subwayDao = new SubwayDao();
    //查看所有的地铁信息
    public void AllSubway() throws IOException {
        HashMap<String, Subway> allSubway = subwayDao.FoundAllSubway();
        System.out.println("地铁编号\t\t地铁名字\t\t地铁线路");
        Set<String> Kid = allSubway.keySet();
        for (String id : Kid) {
            Subway subway = allSubway.get(id);
            System.out.println(subway.getId()+"\t\t"+subway.getName()+"\t\t"+subway.getLine());
        }
    }
//添加地铁信息
    public void addSubway() throws IOException {
        Scanner sc = new Scanner(System.in);

        //输入内容
        System.out.println("请输入地铁的编号");
        String id = sc.next();
        System.out.println("输入地铁的名字");
        String name = sc.next();
        System.out.println("输入地铁的路线");
        String line = sc.next();

       boolean falg =  subwayDao.addSubway(id,name,line);
       if(falg){
           System.out.println("添加成功!!");
       }else{
           System.out.println("添加失败");
       }
    }
}
