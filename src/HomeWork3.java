import java.util.Scanner;

public class HomeWork3
{public static void main(String[] args){
    //Считывается 2 числа, произвести все арифм. операции с ними
    //(поделить, умножить, сложить, вычесть)
    Scanner x = new Scanner( System.in);
    long number = x.nextLong();
    long number2 = x.nextLong();
    long a = number + number2;
    long b = a / 2;
    long s = b * 25;
    long d = s - 25;
    System.out.println(d);

    //Level2:
    //С консоли вводится трехзначное число.
    //Найдите в нем первую, вторую и третью цифры.
    // Используйте при этом / и (или) %

    Scanner i = new Scanner(System.in);
    int f = i.nextInt();
    long rightNumber = f % 10; // правое число
    long leftNumber = f / 100; // левое число
    long middleNumber = (f/10)%10;// среднее число!)
    System.out.println("Right number = " + rightNumber
            + " Left number = " + leftNumber
             + " Middle number = "+ middleNumber);


}
}
