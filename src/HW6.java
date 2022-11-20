import java.util.Scanner;

public class HW6 {
    static public void main(String[] args) {
        // Level1:
        // Вводится число.
        // Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз, равное введенному числу.
        Scanner a = new Scanner(System.in);
        int level1 = a.nextInt();
        String condition = "Я начинаю разбираться с циклами";
        while ( level1 != 0 ){
            level1 --;
            System.out.println(condition);
        }

        //   Level2:
        //   Вводится строка, выведите первый ее символ на экран количество раз,
        //   равное длине всей строки. Например, строка "привет", значит результат будет такой:

        Scanner b = new Scanner(System.in);
        String level2 = b.nextLine();
        int amount =level2.length(); // количество символов
        while (amount != 0){
            amount --;
            System.out.println(level2.charAt(0));
        }



    }
}
