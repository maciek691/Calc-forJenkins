public class CalcApp {

    private static final String app = "v. Calculator 3";
    public static void main(String[] args) throws NoSuchOpctionException {

        CalcControl calcControl = new CalcControl();
        calcControl.controlLoop();
    }
}
