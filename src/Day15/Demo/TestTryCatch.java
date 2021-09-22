package Day15.Demo;

import java.util.Scanner;

/**
 * @author FF
 * @date 2021/9/22
 * @TIME:17:00
 */
public class TestTryCatch {
    public static void main(String[] args) {
        TryStudent stu = new TryStudent();
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你的姓名");
        String name = sc.next();
        stu.setName(name);
        while (true) {
            System.out.println("输入你的年龄");
            String newage = sc.next();
            try {
                int age = Integer.parseInt(newage);
                stu.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输出一个整数");
                continue;
            }catch (AgeOutOfBoundsException e){
                System.out.println("输出一个范围内的数字");
                continue;
            }
        }
        System.out.println(stu);
    }
}
