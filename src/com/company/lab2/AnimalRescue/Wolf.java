package com.company.lab2.AnimalRescue;

public class Wolf extends WildAnimal{

    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setWolfName = "Beowolf";
    private double setWolfAgeInYears = 12.5;
    private double setWolfWeightInKilograms = 32.5;
    private String setWolfColor = "White";
    private double setWolfHeightInMeters = 1.3;
    private String setWolfRace = "Alaskan";
    public void eat() {
        System.out.println("eating Wolffood!");
    }
    public void sleep() {
        System.out.println("Zzzz...*snore");
    }
    public void speak () {
        System.out.println("Auuh!");
    }
}
