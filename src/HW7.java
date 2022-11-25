import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        //Level1
        // Дано целое число, не меньшее
        //Выведите его НАИБОЛЬШИЙ делитель (число, на которое введенное число делится без остатка),
        // отличный от самого этого числа.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i <= number; i--) {
            if (number / i == 2) {
                System.out.println(i);
                break;
            }

        }
    }
}
