package com.company.lab2.AnimalRescue;

public class Horse extends PetAnimal{

    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setHorseName = "Mia";
    private double setHorseAgeInYears = 2.5;
    private double setHorseWeightInKilograms = 200.5;
    private String setHorseColor = "Black";
    private double setHorseHeightInMeters = 2.3;
    private String setHorseRace = "Arabian";
    public void eat() {
        System.out.println("eating Horsefood!");
    }
    public void sleep() {
        System.out.println("Zzzz...*snore");
    }
    public void speak () {
        System.out.println("Yyyhaaa!");
    }
}
