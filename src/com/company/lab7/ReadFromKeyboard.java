package com.company.lab7;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ReadFromKeyboard {


    private static Object Student;

    //Tema ex.1
    public float readFloat() throws InputMismatchException {

        float x = 0.5f;
         boolean read =true;
         while (read) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("Introdu o valoare");
             try { x = scanner.nextFloat();
                 read = false;

             }catch (InputMismatchException e) {
                 System.out.println("Tipul valorii introduse nu este corect.");
             }
         }

        return x;

    }
    //Tema ex.2
    public static void displayDetails() {
    class Student{
        String name;
        int age;
        float percent;
        boolean isLocal;
        char grade;
        Student(String name, double age, float percent, boolean isLocal, char grade){
            this.name = name;
            this.age = (int) age;
            this.percent = percent;
            this.isLocal = isLocal;
            this.grade = grade;
        }
        public void displayDetails(){
            System.out.println("Details..............");
            System.out.println("Name: "+this.name);
            System.out.println("Age: "+this.age);
            System.out.println("Percent: "+this.percent);
            if(this.isLocal) {
                System.out.println("Nationality: Romanian");
            }else {
                System.out.println("Nationality: Foreigner");
            }
            System.out.println("Grade: "+this.grade);




            Scanner sc =new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Enter your percent: ");
            int percent = sc.nextInt();
            System.out.println("Are you local (enter true or false): ");
            boolean isLocal = sc.nextBoolean();
            System.out.println("Enter your grade(enter A, or, B or, C or, D): ");
            char grade = sc.next().toCharArray()[0];
            Student std = new Student(name, age, percent, isLocal, grade);
            std.displayDetails();


        }

}
    }

    //Tema ex.3
    public static <Student> void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your age: ");
        double age = sc.nextDouble();
        System.out.println("Enter your percent: ");
        float percent = sc.nextFloat();
        System.out.println("Are you local (enter true or false): ");
        boolean isLocal = sc.nextBoolean();
        System.out.println("Enter your grade(enter A, or, B or, C or, D): ");
        char grade = sc.next().toCharArray()[0];

    }



    //Tema ex.4
    public static class PopulatingAnArray {
        public static void main(String args[]) {
            System.out.println("Enter the required size of the array :: ");
            Scanner s = new Scanner(System.in);
            int size = s.nextInt();
            int myArray[] = new int [size];
            System.out.println("Enter the elements of the array one by one ");
            for(int i=0; i<size; i++) {
                myArray[i] = s.nextInt();
            }
            System.out.println("Contents of the array are: "+Arrays.toString(myArray));
        }
    }

    public String readArrayList() throws InputMismatchException {
        ArrayList<String> arrayList = new ArrayList<>();

        boolean read =true;
        String x = null;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try { x = scanner.next();
                read = false;

            }catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }

        return x;








    }



}
