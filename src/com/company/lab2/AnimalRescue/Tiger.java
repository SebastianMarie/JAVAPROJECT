package com.company.lab2.AnimalRescue;

public class Tiger extends WildAnimal{

    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setTigerName = "Shere Khan";
    private double setTigerAgeInYears = 12.5;
    private double setTigerWeightInKilograms = 100.5;
    private String setTigerColor = "Orange";
    private double setTigerHeightInMeters = 2.3;
    private String setTigerRace = "Bengali";
    void scream() {
        System.out.println("Roooaaar!");
    }
    void eat() {
        System.out.println("eating Tigerfood!");
    }
    void sleep() {
        System.out.println("Zzzz...*snore");
    }
}
