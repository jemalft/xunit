package calculator;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.testng.Assert.*;

public class mulTest {

    @Test
    public void testMul() {

        assertThat("multiplication test",20,is(Calculator.mul(2,10)));
    }
}