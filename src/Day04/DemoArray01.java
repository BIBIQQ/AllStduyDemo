package Day04;

import java.util.Scanner;

public class DemoArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = {9,1,3,4,1,6,7,5,9,0};
        // 定义索引变量，初始值为-1   假设搜索的不存在
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(a == arr[i]){
               index = i;
               break;
            }

        }
        System.out.println(index);
        //System.out.println(max);


    }
}
