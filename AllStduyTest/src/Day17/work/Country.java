package Day17.work;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:19:40
 */
/*现用集合存储国家名称，请问怎么存储？

需求提示：
	1.可以使用对象存储一个国家。

    2.国家根据拼音排序
*/
public class Country {
    public static void main(String[] args) {
        TreeSet<Guo> list = new TreeSet<>(new Comparator<Guo>() {
            @Override
            public int compare(Guo o1, Guo o2) {
                int resule = o1.getName().compareTo(o2.getName());
                return resule;
            }
        });
        Guo g1 = new Guo("zhongguo", "中国");
        Guo g2 = new Guo("bajisitang", "巴基斯坦");
        Guo g3 = new Guo("aodaliya", "澳大利亚");
        Guo g4 = new Guo("yinggelang", "英格兰");
        Guo g5 = new Guo("eluosi", "俄罗斯");
        Guo g6 = new Guo("ribeng", "日本");

        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        list.add(g5);
        list.add(g6);

        System.out.println(list);
    }
}

class Guo {
    @Override
    public String toString() {
        return chain;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public Guo() {
    }

    public Guo(String name, String chain) {
        Name = name;
        this.chain = chain;
    }

    private String Name;
    private String chain;

}