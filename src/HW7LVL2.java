import java.util.Scanner;

public class HW7LVL2 {
    public static void main(String[] args) {
        //  Level2
        //  Вклад в банке составляет x рублей.
        //  Ежегодно он увеличивается на p процентов, после чего дробная часть копеек отбрасывается.
        //  Каждый год сумма вклада становится больше.
        //  Определите, сколько будет на счету через k лет.
        //  До начала программирования решите эту задачу на бумаге - возьмите p=10, k=2, x = 1000

        int x = 500;//вклад в банке
        int p = 36;//проценты
        int k = 7;//годы

        int p2 = (p * x) / 100;//перевели в %

        for (int i = p2; i > -1; i *= k) {
            if (p2 * k == i) {
                System.out.println(i + x);
            }
        }

    }
}