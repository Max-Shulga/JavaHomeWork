import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Var 2
public class Task_1 {
    public static Map<String, Integer> MinAndMax(int[] arr) {
        Arrays.sort(arr);
        Map<String, Integer> result = new HashMap<>();
        result.put("min", arr[0]);
        result.put("max", arr[arr.length-1]);
        return result;
    }

    public static void main(String[] args) {

        int[] arr =  new int[]{1,2,3,4,5,6,7,8,-9,0,8,6,523,234,2,2};
        Map<String, Integer> minMax= MinAndMax(arr);
        System.out.println(minMax);
    }
}






//Var 1
/*


public class Task_1 {
    public static int findMix(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static Map<String, Integer> MinAndMax(int[] arr) {
        int min = findMix(arr);
        int max = findMax(arr);
        Map<String, Integer> result = new HashMap<>();
        result.put("min", min);
        result.put("max", max);
        return result;
    }

    public static void main(String[] args) {

        int[] arr =  new int[]{1,2,3,4,5,6,7,8,-9,0,8,6,523,234,2,2};
        Map<String, Integer> minMax= MinAndMax(arr);
        System.out.println(minMax);
    }

}
*/