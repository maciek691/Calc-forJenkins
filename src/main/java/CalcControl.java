public class CalcControl {


    // główna pętla - menu

    public void controlLoop() throws NoSuchOpctionException {
        CalcMainMethods calcMainMethods = new CalcMainMethods();
        CalcOtherMethods.print("Możesz wybrać dwie liczby do obliczeń");

        CalcOtherMethods.print("podaj pierwszą liczbę");
        double a = CalcOtherMethods.setNumber();
        CalcOtherMethods.print("podaj drugą liczbę");
        double b = CalcOtherMethods.setNumber();

        OptionMenu optionMenu;
        do {
            printOptions();
            optionMenu = CalcOtherMethods.getOption();
            switch (optionMenu) {
                case ADD:
                    System.out.println(calcMainMethods.add(a, b));
                    break;
                case SUBTRACT:
                    System.out.println(calcMainMethods.subtract(a, b));
                    break;
                case MULTIPLY:
                    System.out.println(calcMainMethods.multiply(a, b));
                    break;
                case DIVIDE:
                    try {
                        System.out.println(calcMainMethods.divide(a, b));
                    } catch (ArithmeticException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case POWER:
                    System.out.println(calcMainMethods.power(a, b));
                    break;
                case ROOT:
                    System.out.println(calcMainMethods.root(a, b));
                    break;
                case SETNEWNUMBRES:
                    System.out.println("podaj pierwszą nową liczbę");
                    a = CalcOtherMethods.setNumber();
                    System.out.println("podaj drugą nową liczbę");
                    b = CalcOtherMethods.setNumber();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }

        } while (optionMenu != OptionMenu.EXIT);


    }

    private void printOptions() {
        System.out.println("Wybierz co chcesz zrobić: ");
        for (OptionMenu optionMenu : OptionMenu.values()) {
            System.out.println(optionMenu);
        }
    }

    private void exit() {
        System.out.println("Miłego dnia - do zobaczenia!!");
        CalcOtherMethods.scn.close();
    }
}



