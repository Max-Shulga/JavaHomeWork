public class task_2 {
    public static boolean isHighYear(int year){
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }
    public static void main(String[] args) {
        int year = 2400;
        System.out.println(isHighYear(year));
    }
}
