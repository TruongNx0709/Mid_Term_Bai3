import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        System.out.println("Câu 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương: ");
        String input = sc.next();
        int numberA = Integer.parseInt(input);
        if (numberA <= 0) {
            System.out.println("Không phải số nguyên dương , nhập lại");
        }
        if (numberA <= 12) {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            System.out.println("Là 1 tháng trong năm");
            System.out.println("Năm hiện tại là : " + year);
            boolean checkYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        checkYear = true;
                    }
                }
                checkYear = true;
            }
            if (numberA == 1 || numberA == 3 || numberA == 5 || numberA == 7 || numberA == 8 || numberA == 10 || numberA == 12) {
                System.out.println("Tháng " + numberA + " có 31 ngày");
            } else if (numberA == 2 && checkYear) {
                System.out.println("Tháng " + numberA + " có 29 ngày");
            } else if (numberA == 2 && !checkYear) {
                System.out.println("Tháng " + numberA + " có 28 ngày");
            } else {
                System.out.println("Tháng " + numberA + " có 30 ngày");
            }
        }
    }
}
