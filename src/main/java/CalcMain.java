import java.util.Scanner;
import java.util.SortedMap;

public class CalcMain {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        Calc calc = new Calc();

        int sum = calc.add(a,b);

        System.out.println(sum);

    }
}
