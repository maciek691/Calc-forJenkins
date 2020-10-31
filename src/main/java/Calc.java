public class Calc {

    public int add (int numb1, int numb2){
        return numb1 + numb2;
    }

    public int subtract (int numb1, int numb2) {
        return numb1 - numb2;
    }

    public long multiply (int numb1, int numb2) {
        return (long) numb1 * numb2;
    }

    public double divide (int numb1, int numb2) {
        String nie = "nie dziel przez 0";
        if (numb2 ==0) {
            System.out.println("nie dziel przez 0");
            return 0.00000;
        }
        return (double) numb1 / numb2;

    }
}
