import java.util.Scanner;

public class HW9 {
    public static void main(String[] agrs) {
        printSum();

    }

    public static int getmyScanner() {
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        //  long sum = ((number / number2) * number2) - number;
        //  System.out.println(sum);
        return number;
    }

    public static int getMySumScanner() {
        int a = getmyScanner();
        int b = getmyScanner();
        int sum = ((a / b) * a) - b;
        return a;
    }

    public static void printSum() {
        System.out.println(getMySumScanner());
    }
}
