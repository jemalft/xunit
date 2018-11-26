package fruit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppleTest {

    public Apple apple;

    @BeforeMethod
    public void setUp() {
        apple = new Apple();
    }

    @Test
    public void verifyAppleHasName() {
    //apple.getNAME();
    assertThat("Check your fruit name / fruit name is incorrect","Apple",is(apple.getNAME()));

    }

    @Test
    public void VerifyAppleHasColor() {
        assertThat("incorrect fruit color","yellowish",is(apple.getColor()));

    }

    @Test
    public void VerifyAppleHasColorLess() {
        assertThat("Apple has no color"," ",is((apple.getColorless())));

    }

    @Test
    public void VerifyAppleHasNoName() {
        assertThat("Apple has no name"," ",is(not(apple.getNAME())));

    }
}
