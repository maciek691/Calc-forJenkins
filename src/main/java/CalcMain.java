import java.util.Scanner;

public class CalcMain {

    public static Scanner scn = new Scanner(System.in);

    public int[] setNumbers () {
        System.out.println("podaj pierwszą liczbę");
        int a = scn.nextInt();
        System.out.println("podaj drugą liczbę");
        int b = scn.nextInt();

        int[] numbers;
        numbers = new int[]{a,b};
        return numbers;
    }

    public int add (int numb1, int numb2){ return numb1 + numb2; }

    public int subtract (int numb1, int numb2) {
        return numb1 - numb2;
    }

    public long multiply (int numb1, int numb2) {
        return (long) numb1 * numb2;
    }

    public double divide (int numb1, int numb2) {
        if(numb2==0){
            throw new ArithmeticException("Nie można dzielić przez 0. Wybierz 1 i ustaw nowe wartości liczb.");
        }
        return (double) numb1 / numb2;
    }

    public double power (int numb1, int numb2) {
        return Math.pow(numb1, numb2);
    }

    public double root (int numb1, double numb2) {
        return Math.pow(numb1,1/numb2);
    }
}
