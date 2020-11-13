
public enum Option {

    EXIT(0,"wyjście z programu"),
    ADD(1, "sumowanie liczb"),
    SUBTRACT(2, "odejmowanie liczb"),
    MULTIPLY(3, "mnożenie liczb"),
    DIVIDE(4, "dzielienie liczb");

    private int value;
    private String function;

    public int getValue() {
        return value;
    }

    public String getFunction() {
        return function;
    }

    Option(int value, String function) {
        this.value = value;
        this.function = function;
    }
    static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
