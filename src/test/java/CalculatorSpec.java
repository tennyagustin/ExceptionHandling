import com.sun.tools.corba.se.idl.constExpr.Divide;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Tenny on 2/21/16.
 */
public class CalculatorSpec {

    Calculator testCalculator = new Calculator();

    @Test
    public void testAdd() {
        int expected1 = 20;
        int actual1 = testCalculator.add(10,10);
        assertEquals("fails if does not add properly", expected1, actual1);
    }

    @Test
    public void testSubtract() {
        int expected2 = 0;
        int actual2 = testCalculator.subtract(10,10);
        assertEquals("fails if does not subtract properly", expected2, actual2);
    }

    @Test
    public void testMultiply() {
        int expected3 = 100;
        int actual3 = testCalculator.multiply(10,10);
        assertEquals("fails if does not find product", expected3, actual3);
    }

    @Test
    public void testDivideErrorWithError() {
        try {
            testCalculator.divide(10,0);
            fail("Fails if does not throw exception.");
        } catch (Exception zero) {
            final String message = "You can't divide by 0.";
            assertEquals(message, zero.getMessage());
        }
    }
}
