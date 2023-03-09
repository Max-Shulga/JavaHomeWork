package HM_2;

import java.io.FileWriter;

public class task_2 {
    public static void main(String[] args) {
        Test();

    }
    public static void Test() {
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try (FileWriter f1 = new FileWriter("test.txt")) {
            f1.write(String.valueOf(sb));
            f1.flush();
        } catch (Exception e) {
            System.out.println("FAIL");
        }
    }
}