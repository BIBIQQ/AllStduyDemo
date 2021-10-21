package Day04;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//控制行数
            for (int k = 1; k <= 5 - i; k++) {//控制空格的个数
                System.out.print(" ");
            }
            //控制打印的图形
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();//控制换行

        }
        int c = 1;
        System.out.println("a");
    }
}


