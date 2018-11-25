package calculator;

import org.testng.annotations.*;

import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;


public class DivTest {
    @Test(groups="Div")
    public void testDivIntPass() {
        assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
        assertEquals("error in divInt()", 0, Calculator.divInt(1, 9));
    }

    @Test(groups="Div")
    public void testDivIntFail() {
        assertNotEquals("error in divInt()", 1, Calculator.divInt(9, 3));
    }

    @Test(expectedExceptions = IllegalArgumentException.class,groups="Div")
    public void testDivIntByZero() {

        Calculator.divInt(9, 0); // expect an IllegalArgumentException
    }

    @Test(groups="Div")
    public void testDivRealPass() {
        assertEquals("error in divInt()", 0.333333, Calculator.divReal(1, 3), 1e-6);
        assertEquals("error in divInt()", 0.111111, Calculator.divReal(1, 9), 1e-6);
    }
    @Test(expectedExceptions = IllegalArgumentException.class,groups="Div")
    public void testDivRealByZero() {
        Calculator.divReal(9, 0); // expect an IllegalArgumentException
    }
}