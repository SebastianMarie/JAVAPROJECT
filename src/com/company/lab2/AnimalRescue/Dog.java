package com.company.lab2.AnimalRescue;

public abstract class Dog extends PetAnimal {
    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setDogName = "Ami";
    private double setDogAgeInYears = 0.5;
    private double setDogWeightInKilograms = 2.5;
    private String setDogColor = "white";
    private double setDogHeightInMeters = 0.3;
    private String setDogRace = "Bichon";

    void bark() {
        System.out.println("Woof!");
    }


    public abstract void eat();

    public abstract void sleep();

    {
        System.out.println("Zzzz...*snore");
    }

    public abstract void speak();

    {
        System.out.println("Woof!");
    }
}




















