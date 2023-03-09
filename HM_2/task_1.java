package HM_2;

public class task_1 {
    public static boolean isPolyndrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPolyndrome("volov"));
        System.out.println(isPolyndrome("volvo"));
        System.out.println(isPolyndrome("voov"));
        System.out.println(isPolyndrome("vovo"));
    }
}