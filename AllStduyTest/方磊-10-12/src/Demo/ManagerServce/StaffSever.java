package Demo.ManagerServce;

import Demo.ManagerDao.StaffDao;
import Demo.Message.Manager;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author FF
 * @date 2021/10/12
 * @TIME:15:05
 */
public class StaffSever {
     StaffDao staffDao = new StaffDao();
    //判断员工信息
    public boolean StaffExist(String id, String name) throws IOException {
        HashMap<String, Manager> allStaff = FoundAllManager();

        if(allStaff.containsKey(id)){
            Manager staff = allStaff.get(id);
            if(name.equals(staff.getName())){
                return true;
            }
        }
        return false;
    }

    //获取所有员工集合
    public HashMap<String, Manager> FoundAllManager() throws IOException {
        HashMap<String, Manager> allStaff = staffDao.FoundAllManager();
        return allStaff;
    }


}
