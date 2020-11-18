package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
    private Cat cat;

    @Before
    public void setup()  {
        this.cat = new Cat("Shelly");
    }

    @Test
    public void setNameTest() {
        String expected = "Blaise";

        cat.setName(expected);

        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        String expected = "Meow!";

        // when
        String actual = cat.speak();

        // then
        Assert.assertEquals(expected, actual);
    }
}
