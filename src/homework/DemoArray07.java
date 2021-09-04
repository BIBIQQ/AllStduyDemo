package homework;

public class DemoArray07 {
    public static void main(String[] args) {
        int gain = 0;
        int pay = 0;
        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        for(int i = 0;i < arr.length ; i++){
            if(arr[i] < 0){
                gain ++;
            }else if(arr[i] > 0){
                pay ++;
            }
        }
        System.out.println(gain);
        System.out.println(pay);
    }
}
