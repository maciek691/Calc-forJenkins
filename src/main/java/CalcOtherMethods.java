import java.util.Scanner;

public class CalcOtherMethods {

    public static Scanner scn = new Scanner(System.in);

    public static int[] setNumbers () {
        System.out.println("podaj pierwszą liczbę");
        int a = scn.nextInt();
        System.out.println("podaj drugą liczbę");
        int b = scn.nextInt();

        int[] numbers;
        numbers = new int[]{a,b};
        return numbers;
    }
}
