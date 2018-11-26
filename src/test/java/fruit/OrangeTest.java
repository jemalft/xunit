package fruit;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OrangeTest {

    @Test
    public void testGetNAME() {
        assertThat("Name of fruit is incorrect","Orange",is(Orange.getNAME()));
    }

    @Test
    public void testGetCOLOR() {
        assertThat("Color of fruit is incorrect","Yellow",is(Orange.getCOLOR()));

    }
}