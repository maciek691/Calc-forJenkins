
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void addTest() {
        Calc calc = new Calc();
        int add = calc.add(5,5);
        assertEquals(10,add);
    }

    @Test
    public void subtractTest() {
        Calc s = new Calc();

        int subtract = s.subtract(10, 5);

        assertEquals(5,subtract);
    }

    @Test
    public void multiplyTest() {
        Calc m = new Calc();

        long multiply = m.multiply(5,5);

        assertEquals(25,multiply);
    }

    @Test
    public void divideTest() {
        Calc d = new Calc();
        double divide = d.divide(10,4);
        assertEquals(2.5,divide,0);
    }

    @Test
    public void divide0Test() {
        Calc d = new Calc();
        double divideBy0 = d.divide(5,0);

        assertEquals(0.00000,divideBy0,0);
    }

    @Test
    public void testToFail() {
        Calc f = new Calc();
        int w = f.add(5,5);
        assertEquals(3,w);
    }

}
