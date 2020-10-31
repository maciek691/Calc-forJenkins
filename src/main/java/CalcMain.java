import java.util.Scanner;
import java.util.SortedMap;

public class CalcMain {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        Calc calc = new Calc();

        int sum = calc.add(a,b);
        int subt = calc.subtract(a,b);
        long multi = calc.multiply(a,b);
        double div = calc.divide(a,b);

        System.out.println("Suma to: "+ sum);
        System.out.println("Różnica to: "+ subt);
        System.out.println("Wymik mnożenia to: "+ multi);
        System.out.println("Wynik dzielenia to: "+ div);
    }
}
