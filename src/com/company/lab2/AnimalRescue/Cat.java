package com.company.lab2.AnimalRescue;

public class Cat extends PetAnimal{

    public String name;
    public double ageInYears;
    public String color;
    public double weightInKilograms;
    public double heightInMeters;
    public String race;
    private String setCatName = "Moto";
    private double setCatAgeInYears = 0.5;
    private double setCatWeightInKilograms = 2.5;
    private String setCatColor = "Grey";
    private double setCatHeightInMeters = 0.3;
    private String setCatRace = "Siamese";
    void purr() { System.out.println("Puuurrr!"); }
    public void eat() {
        System.out.println("eating catfood!");
    }
    public void sleep() {
        System.out.println("Zzzz...*snore");
    }
    public void speak () {
        System.out.println("Miao!");
    }

}
