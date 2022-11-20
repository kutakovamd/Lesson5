import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        //  First level: Level1:
        //  1) В программу (в консоль) вводится строка.
        //  Найдите длину строки, если она больше 10, то выведите true, иначе false
        //  2) В программу (в консоль) вводится строка.
        //  Если первый и последний символ равны - выведите true, иначе false

        Scanner a = new Scanner(System.in);

        String h = a.nextLine();

        boolean result = h.length() > 10;
        System.out.println(result);

        String len = a.nextLine();
        int len1 = len.length();
        // boolean len1 = lineOne.charAt(len-1) == lineOne.charAt(0);
        System.out.println(len.charAt(len1 - 1) == len.charAt(0));

        //  Level2:
        //  В программу вводится строка из двух букв A и B,
        //  замените все буквы A на B, а все B на A. Например ABBA -> BAAB

      //  String new1 = a.nextLine();
      // if (new1 = new1.replace('A', 'B')) {
          //  System.out.println(new1);
       // }
        // System.out.println(new1.replace('A', 'B') + new1.replace('B', 'A'));
        //System.out.println(new1.replace('B','A'));
        //String new2 = new1.replace('A', 'B' );
        //String new3 = new1.replace( 'B', 'A');
        //System.out.println(new2 + new3);
    }
}
