package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet>{
private String name;
private String speak = "Moo";
    public Pet(String name) {
    this.name = name;
    }
    public Pet(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return this.speak;
    }

    @Override
    public String toString(){
        //for(int i = 1; i < numberOfPets; i++)
        return //"Pet No: " + i +
                "Name: " + name +
                ", Speak: " + speak;
    }


    public int compareTo(Pet pet1, Pet pet2) {

        return pet1.name.compareTo(pet2.name);

        }


    public int compareTo(Pet o) {
        return this.name.compareTo(o.getName());
    }
}
