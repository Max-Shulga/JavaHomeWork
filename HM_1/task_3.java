import java.util.Arrays;

// В JS одной строчкой решается но тут не придумал как сделать красиво
public class task_3 {
//var1 если не важно сохронять последовательность
    public static int[] moveElementsToEnd(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            } else {
                i++;
            }
        }
        return nums;
    }
// var 2 если важно что бы все остальные числа шли в том же порядке
//    public static int[] moveElementsToEnd(int[]arr, int digit) {
//        int[] result  = new int[arr.length];
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] == digit){
//                result[(result.length-1 - count)] = digit;
//                count++;
//            }else {
//                result[i-count] = arr[i];
//            }
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3, 2, 2, 3, 5, 6, 7, 9, 1, 0, 0, 3};
        int  dig = 2;
        System.out.println(Arrays.toString(moveElementsToEnd(arr, dig)));
    }
}
