package Day18.work.Test03;

import java.util.*;

/**
 * @author FF
 * @date 2021/9/26
 * @TIME:19:15
 */
/*2.改进天猫订单系统

当选择国家时，展示出对应的国家 - 省份。如图:

根据选择的国家展示，省份  	   键（String） -- 值 (集合 --- Set)

		多个国家   -- 集合

		一个国家拥有多个省份  --    国家和省份是一一对应     M
*/
public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        test03 o = new test03();
        HashMap<String, Set> map = new HashMap<>();
//        创建对象
        Set<String> china = o.addElement(new HashSet<>(), "浙江", "北京", "上海", "深圳", "新疆", "西藏");
        Set<String> Japan = o.addElement(new HashSet<>(), "北海道", "东京", "大阪");
        Set<String> Meiguo = o.addElement(new HashSet<>(), "洛杉矶", "旧金山", "纽约", "华盛顿");
        Set<String> Yingguo = o.addElement(new HashSet<>(), "伦敦", "因格朗", "巴基斯坦", "埃塞俄比亚");
//        存储对象
        map.put("中国", china);
        map.put("日本", Japan);
        map.put("美国", Meiguo);
        map.put("英国", Yingguo);
//      所有国家
        map.forEach((k, v) -> System.out.println(k + "---" + v));
        System.out.println("=============");
//        选择查看
        while (true){
        Set<String> keys = map.keySet();
            System.out.println("输入国家");
            String i = sc.next();
            if(!map.containsKey(i)){
                System.out.println("搞错了");
                break;
            }
            System.out.println(map.get(i));
        }}


    public <T> Set<T> addElement(HashSet<T> list, T... ti1) {
        for (T t : ti1) {
            list.add(t);
        }
        return list;
    }
}

