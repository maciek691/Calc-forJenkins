
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void addTest() {
        Calc calc = new Calc();

        int add = calc.add(5,5);

        Assert.assertEquals(10,add);
    }

}
