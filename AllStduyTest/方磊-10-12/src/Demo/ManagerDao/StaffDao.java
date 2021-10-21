package Demo.ManagerDao;

import Demo.Message.Manager;
import Demo.Message.Subway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:14:43
 */
public class StaffDao {
    //所有员工信息
    public HashMap<String, Manager> FoundAllManager() throws IOException {
        //创建输入流
        BufferedReader br= new BufferedReader(new FileReader("E:\\HEIMA\\Demo\\AllStduyTest\\方磊-10-12\\src\\Demo\\Message\\managers.txt"));
        //创建地铁信息集合- HashMap
        HashMap<String, Manager> allManager = new HashMap<>();
        //读取文档内容
        String line;
        while ((line = br.readLine()) != null){
            String[] split = line.split(",");
            allManager.put(split[0],new Manager(split[0],split[1],split[2],split[3]));
        }
        br.close();
        return allManager;
    }

}
