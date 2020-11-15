
public enum OptionMenu {

    EXIT(0,"wyjście z programu"),
    ADD(1, "sumowanie liczb"),
    SUBTRACT(2, "odejmowanie liczb"),
    MULTIPLY(3, "mnożenie liczb"),
    DIVIDE(4, "dzielienie liczb"),
    POWER(5, "podnieś pierwszą liczbę do potęgi drugiej liczby"),
    ROOT(6, "pierwiastek z pierwszej liczby stopnia drugiej liczby");

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
