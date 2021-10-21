package Day17.Demo.Demo01;

/**
 * @author FF
 * @date 2021/9/25
 * @TIME:10:19
 */
public class Demo01{
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setElement("给小丽的土味情话");
        String element01 = box1.getElement();
        System.out.println(element01);

        Box<Integer> box2 = new Box<>();
        box2.setElement(19);
        int element02 = box2.getElement();
        System.out.println(element02);
    }
}

