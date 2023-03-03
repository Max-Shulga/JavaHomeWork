import java.util.Arrays;

// В JS одной строчкой решается но тут не придумал как сделать красиво
public class task_3 {
    public static int[] sort(int[]arr, int digit) {
        int[] result  = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == digit){
                result[(result.length-1 - count)] = digit;
                count++;
            }else {
                result[i-count] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3, 2, 2, 3, 5, 6, 7, 9, 1, 0, 0, 3};
        int  dig = 2;
        System.out.println(Arrays.toString(sort(arr, dig)));
    }
}
