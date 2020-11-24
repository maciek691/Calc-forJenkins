
public enum OptionMenu {

    EXIT(0,"wyjście z programu"),
    SETNEWNUMBRES(1, "ustaw nowe wartości liczb"),
    ADD(2, "sumowanie liczb"),
    SUBTRACT(3, "odejmowanie liczb"),
    MULTIPLY(4, "mnożenie liczb"),
    DIVIDE(5, "dzielienie liczb"),
    POWER(6, "podnieś pierwszą liczbę do potęgi drugiej liczby"),
    ROOT(7, "pierwiastek z pierwszej liczby stopnia drugiej liczby");


    private int value;
    private String function;

    public int getValue() {
        return value;
    }

    public String getFunction() {
        return function;
    }

    OptionMenu(int value, String function) {
        this.value = value;
        this.function = function;
    }
    static OptionMenu createFromInt(int option) {
        return OptionMenu.values()[option];
    }

    @Override
    public String toString() {
        return value + " " + function;
    }
}
