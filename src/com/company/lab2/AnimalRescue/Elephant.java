package com.company.lab2.AnimalRescue;

public class Elephant extends WildAnimal{

    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setElephantName = "Ella";
    private double setElephantAgeInYears = 50.5;
    private double setElephantWeightInKilograms = 2000.5;
    private String setElephantColor = "Grey";
    private double setElephantHeightInMeters = 3.3;
    private String setElephantRace = "African";
    public void eat() {
        System.out.println("eating elephantfood!");
    }
    public void sleep() {
        System.out.println("Zzzz...*snore");
    }
    public void speak () {
        System.out.println("Hellyeah!");
    }
}
