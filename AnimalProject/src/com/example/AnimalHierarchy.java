package com.example;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating");
    }
}

class Mammal extends Animal {
    protected int numOfLegs;

    public Mammal(String species, int numOfLegs) {
        super(species);
        this.numOfLegs = numOfLegs;
    }

    public void walk() {
        System.out.println(species + " is walking on " + numOfLegs + " legs");
    }
}

class Dog extends Mammal {
    protected String breed;

    public Dog(String species, int numOfLegs, String breed) {
        super(species, numOfLegs);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(species + " is barking");
    }
}

class Cat extends Mammal {
    protected String furColor;

    public Cat(String species, int numOfLegs, String furColor) {
        super(species, numOfLegs);
        this.furColor = furColor;
    }

    public void meow() {
        System.out.println(species + " is meowing");
    }
}

public class AnimalHierarchy {
    public static void main(String args[]) {
        Dog dog = new Dog("Dog", 4, "Labrador");
        Cat cat = new Cat("Cat", 4, "Black");

        dog.eat();
        dog.walk();
        dog.bark();

        cat.eat();
        cat.walk();
        cat.meow();
    }
}

