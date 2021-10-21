package Day19.BaiduSignIn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author FF
 * @date 2021/9/28
 * @TIME:12:26
 */
public class UserDao {
    Map<String, String> UserInfo = new HashMap<>();
// 临时存储的数据，便于测试
    {
        UserInfo.put("zhangsan", "123qqq");
        UserInfo.put("zhangsi", "123qqq");
        UserInfo.put("zhangwu", "123qqq");
        UserInfo.put("1", "1");
    }

    //  判断存入的用户信息是否正确存入了
    public boolean addUser(String name, String password) {

        Set<String> Username = UserInfo.keySet();
        for (String s : Username) {
            if (name.equals(s)) {
                return true;
            }
        }
        UserInfo.put(name, password);
        return false;
    }

    // 返回存储的集合信息
    public Map<String, String> ToSeeAll() {
        return UserInfo;
    }

    //  修改密码
    public void ChangePW(String name, String password) {
        UserInfo.put(name, password);
    }

    // 判断输入的账号密码是否正确
    public boolean exist(String name, String password) {
        Map<String, String> userinfo = ToSeeAll();
        Set<String> username = userinfo.keySet();
        for (String k : username) {
            if (name.equals(k) && password.equals(userinfo.get(k))) {
                return true;
            }
        }
        return false;
    }

    //    删除用户
    public void remove(String name) {
        UserInfo.remove(name);
    }
}
