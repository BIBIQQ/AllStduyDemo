package Day08.work;

import java.util.Random;

/**
 * @author FF
 * @date 2021/9/9
 * @TIME:21:18
 */
/*2.已知一个字符数组arr,
		其中里面有{'a','s','d','f','a','d','2','3','8'},
		根据里面的元素随机生成一个长度为5的字符串，然后将该字符串反序输出。

		打印格式：
		随机生成一个长度为5的字符串:s2aas
		倒序后：saa2s
	*/
public class DemoRever {
    public static void main(String[] args) {
        char[] arr = {'a','s','d','f','a','d','2','3','8'};
        Random i = new Random();
        String a = "";
        for (int j = 0; j< 5 ;j++) {
            int numRandom = i.nextInt(arr.length);
            a+= arr[numRandom];

        }
        StringBuilder newA = new StringBuilder(a);
        System.out.println(newA.reverse().toString());
    }

}
