package Day05;

public class DemoBoth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 1, 5, 0, 2};
        int[] c = getMaxMin(arr);
        System.out.println(c[0]+" "+c[1]);
    }

    public static int[] getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }


            for (int j = 0; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }
            }

        }

        int[] a = {max, min};
        return a;
    }
}

