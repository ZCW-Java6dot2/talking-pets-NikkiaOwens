package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {
        private Dog dog;

        @Before
        public void setup()  {
            this.dog = new Dog("Rex");
        }

        @Test
        public void setNameTest() {
            String expected = "Dogaise";

            dog.setName(expected);

            String actual = dog.getName();
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void speakTest() {
            // Given
            String expected = "Ruff!";

            // when
            String actual = dog.speak();

            // then
            Assert.assertEquals(expected, actual);
        }
    }



