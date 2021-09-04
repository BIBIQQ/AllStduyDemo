package homework;

public class DemoArray05 {
    public static void main(String[] args) {
        int sum = 0;
        int mean = 0;
        int[] arr = {72,89,65,87,91,82,71,93,76,68};
        for(int i = 0; i < arr.length;i++){
                sum +=arr[i];
        }
        mean = sum / arr.length;
        System.out.println("平均分数："+mean);
    }
}
