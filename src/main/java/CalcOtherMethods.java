import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcOtherMethods {

    public static Scanner scn = new Scanner(System.in);

    static OptionMenu getOption() {
        boolean optionOk = false;
        OptionMenu optionMenu = null;
        while (!optionOk) {
            try {
                optionMenu = OptionMenu.createFromInt(getInt());
                optionOk = true;
            } catch (NoSuchOpctionException e) {
                print(e.getMessage() + " podaj ponownie.");
            } catch (InputMismatchException ignored) {
                print("Wprowadzono wartość, która nie jest liczbą, podaj ponownie");
            }
        }
        return optionMenu;
    }

    public static double setNumber() {
        double a = 0;
        boolean aIsInt = false;
        do {
            try {
                a = scn.nextDouble();
                aIsInt = true;
            } catch (InputMismatchException e) {
                print("Wydaje się że nie podałeś liczby...");
                scn.nextLine();
            }
        } while (!aIsInt);
        return a;
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static int getInt(){
        try {
            return scn.nextInt();
        } finally {
            scn.nextLine();
        }

    }


}
