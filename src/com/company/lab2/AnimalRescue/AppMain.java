package com.company.lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        DogFood myDogFood = new DogFood();
        Girl myGirl = new Girl();
        Vet myVet = new Vet();
        Dog mySecondDog = new Dog();
        mySecondDog.name = "Sacha";
        DogFood mySecondDogFood = new DogFood();
        mySecondDogFood.name = "Purina";
        Vet mySecondVet = new Vet();
        mySecondVet.name = "Mr Doolittle";
        System.out.println(myDog.name);
        System.out.println(myDog.ageInYears);
        System.out.println(myDog.color);
        System.out.println(myDog.weightInKilograms);
        System.out.println(myDog.heightInMeters);
        System.out.println(myDog.race);
        System.out.println(myGirl.name);
        System.out.println(myGirl.ageInYears);
        System.out.println(myGirl.weightInKilograms);
        System.out.println(myDogFood.meatDogFood);
        System.out.println(myDogFood.typeDogFood);
        System.out.println(myDogFood.name);
        System.out.println(myDogFood.weightInKilograms);
        System.out.println(myVet.ageInYears);
        System.out.println(myVet.name);
        System.out.println(mySecondDog.name);
        System.out.println(mySecondDogFood.name);
        System.out.println(mySecondVet.name);





    }






















}
