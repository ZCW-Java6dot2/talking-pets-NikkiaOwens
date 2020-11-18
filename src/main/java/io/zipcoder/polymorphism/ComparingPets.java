package io.zipcoder.polymorphism;

import java.util.Comparator;

public class ComparingPets implements Comparator<Pet> {


    public int compare(Pet o1, Pet o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
