package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
public static  void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    ArrayList<Pet> pets = new ArrayList<Pet>();


    System.out.println("How many pets do you have?");
    int numberOfPets = scan.nextInt();

    System.out.println(numberOfPets);

    while (pets.size() < numberOfPets) {
        String name;

            System.out.println("Whats the name of your pet?");
            name = scan.next();

            System.out.println("What kind of pet do you have?");
            System.out.println("1) Bird");
            System.out.println("2) Cat");
            System.out.println("3) Dog");
            System.out.println("4) Other");


            int input = scan.nextInt();

            switch (input) {
                case 1:
                    pets.add(new Bird(name));
                    break;
                case 2:
                    pets.add(new Cat(name));
                    break;
                case 3:
                    pets.add(new Dog(name));
                    break;
                case 4:
                    pets.add(new Pet(name));
                    break;
                default: System.out.println("Invalid Selection");
            }
    }

    //Arrays.copyOf;
    System.out.println(pets.toString());


}


    /**
     * create a new array/array list that called petResults
     * ask the how many pets = numberOfPets
     * make a for loop <= numberOfPets that will go through getting the pet kind and name
     * return petResults as string
     */

/**
 * Create a program that asks the user how many pets they have.
 * Once you know how many pets they have,
 * ask them what kind of pet each one is,
 * along with each pet's name. For now your
 * program should just hold onto the user input and
 * print out the list at the end; we'll modify this in part 3.
 */

/** Modify your program from part 1 to use the Pet class and its subclasses.
 * Keep a list of the pets your user lists and at the end of the program
 * print out a list of their names and what they say when they speak.
 */

 }
