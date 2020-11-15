import java.util.Scanner;

public class CalcMain {

    Scanner scn = new Scanner(System.in);

    public int[] setNumbers () {
        int a = scn.nextInt();
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
        if (numb2 == 0) {
            while (numb2 == 0) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Nie można dzielić przez 0. Wybierz nową drugą liczbę");
                numb2 = scn.nextInt();
            }
        }
        return (double) numb1/numb2;
    }

    public double power (int numb1, int numb2) {
        return Math.pow(numb1, numb2);
    }

    public double root (int numb1, double numb2) {
        return Math.pow(numb1,1/numb2);
    }
}
