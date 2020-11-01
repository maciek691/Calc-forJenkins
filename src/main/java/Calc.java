import java.util.Scanner;

public class Calc {

    public int add (int numb1, int numb2){return numb1 + numb2; }

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
                System.out.println("Cant divide by 0. Set new second number");
                numb2 = scn.nextInt();
            }
        }
        return (double) numb1/numb2;
    }
}
