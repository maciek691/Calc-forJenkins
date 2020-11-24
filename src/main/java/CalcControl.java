public class CalcControl {

    // do komunikacji z użytkownikiem
    public int getInt (){
        int number = CalcOtherMethods.scn.nextInt();
        return number;
    }

    // główna pętla - menu

    public void controlLoop() {
        CalcMainMethods calcMainMethods = new CalcMainMethods();
            System.out.println("Podaj dwie liczby do obliczeń");

            int numbers[] = CalcOtherMethods.setNumbers();
            int a = numbers[0];
            int b = numbers[1];

            OptionMenu optionMenu;
            do {
                printOptions();
                optionMenu = OptionMenu.createFromInt(getInt());
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
                        a = CalcOtherMethods.scn.nextInt();
                        System.out.println("podaj drugą nową liczbę");
                        b = CalcOtherMethods.scn.nextInt();
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
        for(OptionMenu optionMenu : OptionMenu.values()){
            System.out.println(optionMenu);
        }
    }

    private void exit() {
        System.out.println("Miłego dnia - do zobaczenia!!");
        CalcOtherMethods.scn.close();
    }
}



