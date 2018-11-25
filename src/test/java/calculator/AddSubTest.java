package calculator;

import org.junit.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

import static org.junit.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class AddSubTest {
    @Test(groups="Sub")
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        AssertJUnit.assertEquals("error in add()",  3, Calculator.add(1, 2));
        AssertJUnit.assertEquals("error in add()", -3, Calculator.add(-1, -2));
        AssertJUnit.assertEquals("error in add()",  9, Calculator.add(9, 0));
    }

    @Test(groups="Sub")
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        Assert.assertNotEquals("error in add()", 0, Calculator.add(1, 2));
    }

    @Test(groups="Sub")
    public void testSubPass() {
        AssertJUnit.assertEquals("error in sub()",  1, Calculator.sub(2, 1));
        AssertJUnit.assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
        AssertJUnit.assertEquals("error in sub()",  0, Calculator.sub(2, 2));
    }

    @Test(groups="Sub")
    public void testSubFail() {
        Assert.assertNotEquals("error in sub()", 0, Calculator.sub(2, 1));
    }
}