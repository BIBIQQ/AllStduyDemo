package Day11.Test.test02;

/**
 * @author FF
 * @date 2021/9/15
 * @TIME:19:47
 */
/*18岁的演员景甜会吃饭(吃小龙虾)和跳舞
30岁的歌手薛之谦会吃饭(吃大闸蟹)和唱歌.
*/
public class test {
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setName("景甜");
        actor.setAge("19");
        actor.setDance("跳舞");
        actor.setOccupation("演员");

        System.out.println(actor.getEat());

    }
}
