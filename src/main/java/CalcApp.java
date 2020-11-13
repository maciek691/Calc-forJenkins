public class CalcApp {

    private static final String app = "v. Calculator 2.0";
    public static void main(String[] args) {

        CalcControl calcControl = new CalcControl();
        calcControl.controlLoop();
    }
}
