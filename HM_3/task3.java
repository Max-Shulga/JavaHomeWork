package HM_3;
import java.util.ArrayList;
import java.util.Arrays;


public class task3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>
                (Arrays.asList("one", "car", "bus", "3", "doll", "4"));
        System.out.println(digitCleaner(arr));
        System.out.println(digitCleaner2(arr));
    }
    // есть предположение что использовать try catch таким образом плохая идея, хотелось бы ваш коментарий по этому поводу
    public static ArrayList<String> digitCleaner(ArrayList<String> arr){
        arr.removeIf(el ->{
            try{
                Integer.parseInt(el);
                return true;
            }catch (Exception x){
                return false;
            }
        });
        return arr;
    }
    // второй вариант без try catch, но нормального инструмента на проверку является ли строка числом не смог найти, буду
    //благодарен за подсказку
    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<String> digitCleaner2(ArrayList<String> arr){
        arr.removeIf(task3::isNumeric);
        return arr;
    }

}
