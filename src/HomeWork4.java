import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        //First level: level1
        //С консоли считывается число.
        //Если это число равно 0 - тогда напишите на экран "ошибок не обнаружено",
        //если число не равно 0, тогда выведите три сообщения "ERROR".

        Scanner i = new Scanner(System.in);
        int number = i.nextInt();
        if (number == 0 ) {
            System.out.println("NOT ERROR");
        }else if (number > 0){
            System.out.println("ERROR");
        }
        // Level 2.
        // Мартин играет в рулетку.
        // Он крутит ее два раза.
        // Если в первый раз выпадет 36 И во второй выпадет 17, то он выиграет джекпот.
        // Если в первый раз выпадет 36 ИЛИ во второй раз выпадет 17, то он выиграет маленький приз.
        // Если выпадет НЕ 36 И НЕ 17, то он все проиграет.
        // С консоли считывается два числа, первое число - сколько выпало на рулетке первый раз,
        // второе число - сколько выпало второй раз. Напишите, что выиграет Марин.

        Scanner q = new Scanner(System.in);
        int OneCircle = q.nextInt();
        int TwoCircle = q.nextInt();

        if ( OneCircle == 36 && TwoCircle == 17) {
            System.out.println("$ JACKPOT $");
        } else if ( OneCircle == 36 || TwoCircle == 17) {
            System.out.println( " CONSOLATION PRIZE :'( ");
        } else if ( OneCircle != 36 && TwoCircle != 17) {
            System.out.println( " YOUR LOSER :( ");
        }




    }
}
