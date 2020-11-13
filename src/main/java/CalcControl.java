
import java.util.Scanner;


public class CalcControl {

    private Scanner sc = new Scanner(System.in);

    // do komunikacji z użytkownikiem
    public int getInt (){
        int number = sc.nextInt();
        return number;
    }

    // główna pętla - menu

    public void controlLoop() {

        System.out.println("Podaj dwie liczby do obliczeń");
        CalcMain calcMain = new CalcMain();
        int numbers [] = calcMain.setNumbers();
        int a = numbers[0];
        int b = numbers[1];

        Option option;
        do {
            printOptions();
            option = Option.createFromInt(getInt());

            switch (option) {
                case ADD:
                    System.out.println(calcMain.add(a,b));
                    break;
                case SUBTRACT:
                    System.out.println(calcMain.subtract(a,b));
                    break;
                case MULTIPLY:
                    System.out.println(calcMain.multiply(a,b));
                    break;
                case DIVIDE:
                    System.out.println(calcMain.divide(a,b));
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }

        } while(option !=Option.EXIT);

    }

    private void printOptions() {
        System.out.println("Wybierz co chcesz zrobić: ");
        for(Option option : Option.values()){
            System.out.println(option);
        }
    }

    private void exit() {
        System.out.println("Miłego dnia - do zobaczenia!!");
        sc.close();
    }


    }




/*    CalcMain calc = new CalcMain();

        int sum = calc.add(a, b);
        int subtr = calc.subtract(a, b);
        long multi = calc.multiply(a, b);
        double div = calc.divide(a,b);

        System.out.println("Suma to: " + sum);
        System.out.println("Różnica to: " + subtr);
        System.out.println("Wymik mnożenia to: " + multi);
        System.out.println("Wymik mdzielenia to: " + div);*/



