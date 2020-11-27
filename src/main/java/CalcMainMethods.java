import java.util.Scanner;

public class CalcMainMethods {

    public double add (double numb1, double numb2){ return numb1 + numb2; }

    public double subtract (double numb1, double numb2) {
        return numb1 - numb2;
    }

    public double multiply (double numb1, double numb2) {
        return numb1 * numb2;
    }

    public double divide (double numb1, double numb2) {
        if(numb2==0){
            throw new ArithmeticException("Nie można dzielić przez 0. Wybierz 1 i ustaw nowe wartości liczb.");
        }
        return numb1 / numb2;
    }

    public double power (double numb1, double numb2) {
        return Math.pow(numb1, numb2);
    }

    public double root (double numb1, double numb2) {
        return Math.pow(numb1,1/numb2);
    }
}
