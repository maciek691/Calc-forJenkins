import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class MainTest_TestNG {

    private CalcMainMethods calcUnderTest;

    @BeforeTest  (groups = {"Smoke"})
    public void prepareCalc() {
        calcUnderTest = new CalcMainMethods();
    }

    @Test (groups = {"Smoke"})
    public void addTest() {
        double add = calcUnderTest.add(5, 5);
        assertEquals(10, add, 0);
    }

    @Test (groups = {"Smoke"})
    public void subtractTest() {
        double subtract = calcUnderTest.subtract(10, 5);
        assertEquals(5, subtract, 0);
    }

    @Test (groups = {"Smoke"})
    public void multiplyTest() {
        double multiply = calcUnderTest.multiply(5, 5);

        assertEquals(25, multiply, 0);
    }

    @Test (groups = {"Smoke"})
    public void divideTest() {
        double divide = calcUnderTest.divide(10, 4);
        assertEquals(2.5, divide, 0);
    }

    @Test (expectedExceptions = ArithmeticException.class,
            expectedExceptionsMessageRegExp = "Nie można dzielić przez 0. Wybierz 1 i ustaw nowe wartości liczb.")
    public void divideBy0 () {
        double divide = calcUnderTest.divide(2,0);
    }

    @Test (groups = {"Smoke"})
    public void powerTest() {
        double power = calcUnderTest.power(3, 4);
        assertEquals(81, power, 0);
    }

    @Test (groups = {"Smoke"})
    public void rootTest() {
        double root = calcUnderTest.root(16, 4);
        assertEquals(2, root, 0);
    }
}
