import java.util.Arrays;
import java.util.logging.Level;

public class HW8 {
    public static void main(String[] args) {
        // Создайте массив размером 100 символов,
        // заполните все ячейки значением 10.
        // 1 и 99 ячейки заполните значениями, равными 0

        int[] levelOne;
        levelOne = new int[100];
        //System.out.println(levelOne.length);
        for (int i = 0; i < levelOne.length; i++) {
            levelOne[1] = 0;
            levelOne[i] = 10;
            levelOne[99] = 0;
        }
        System.out.println(Arrays.toString(levelOne));

        //  Создайте массив размером 100 символов,
        //  заполните все ячейки согласно такому правилу:
        //  1 ячейка - 111(+110), 2ая - 222(+220), 3ая - 333(+330),4ая - 444(+440),5ая - 555, 6ая - 666 , 7ая - 777, 8- 888,9-999,10-1110(+1100)
        //  11ая - 111(+100), 12ая - 222(+110), 13ая - 333(+120).
        //  Найдите сумму значений всех ячеек

        int[] levelTwo;
        levelTwo = new int[100];
        levelTwo[0] = 111;
        for (int i = 1; i < levelTwo.length; i++) {
           // levelTwo[0] = 111;
          //  levelTwo[1] = 222;
            levelTwo[i] = levelTwo[i-1] + 111;
            if ( i % 10 == 0) {
                levelTwo[i]= 111;
            }

        }
        System.out.println(Arrays.toString(levelTwo));
    }
}
