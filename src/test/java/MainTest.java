

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void addTest() {
        CalcMain calcMain = new CalcMain();
        int add = calcMain.add(5, 5);
        assertEquals(10, add);
    }

    @Test
    public void subtractTest() {
        CalcMain s = new CalcMain();

        int subtract = s.subtract(10, 5);

        assertEquals(5, subtract);
    }

    @Test
    public void multiplyTest() {
        CalcMain m = new CalcMain();

        long multiply = m.multiply(5, 5);

        assertEquals(25, multiply);
    }

    @Test
    public void divideTest() {
        CalcMain d = new CalcMain();
        double divide = d.divide(10, 4);
        assertEquals(2.5, divide, 0);
    }

/*    @Test
    public void divide0Test() {
        CalcMain d = new CalcMain();
        double divideBy0 = d.divide(5, 0);
        assertEquals(2, divideBy0, 0);
    }*/

}
