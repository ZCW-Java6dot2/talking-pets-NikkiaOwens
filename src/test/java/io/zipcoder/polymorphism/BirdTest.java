package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BirdTest {
    private Bird bird;

    @Before
    public void setup()  {
        this.bird = new Bird("Guyeoei");
    }

    @Test
    public void setNameTest() {
        String expected = "Birdaise";

        bird.setName(expected);

        String actual = bird.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        // Given
        String expected = "Squack!";

        // when
        String actual = bird.speak();

        // then
        Assert.assertEquals(expected, actual);
    }
}
