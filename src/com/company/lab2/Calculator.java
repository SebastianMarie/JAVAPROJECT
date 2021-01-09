package com.company.lab2;


import java.util.Scanner;

 class InchesToMeters {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Input a value for inch: ");
            double inch = input.nextDouble();
            double meters = inch * 0.0254;
            System.out.println(inch + " inch is " + meters + " meters");
    //INCHES TO METERS CALC
        }
    }


        public class Calculator {


            public static void main(String[] args) {

                int a = sum(2, 3);
                System.out.println(a);

                float b = divide(5, 4);
                System.out.println(b);
                double c = (int) subtract(5, 2);
                System.out.println(c);
                double d = (double) multiply(5, 4);
                System.out.println(d);
                float e = divide(2, 1, 2);
                System.out.println(e);
            }

             static int sum(int firstNumber, double secondNumber) {
                return (int) (firstNumber + secondNumber);

            }

             static double subtract(int firstNumber, double secondNumber) {
                return (firstNumber - secondNumber);
            }

             static double multiply(double firstNumber, double secondNumber) {
                return (firstNumber * secondNumber);
            }

             static float divide(int firstNumber, float secondNumber) {
                return (firstNumber / secondNumber);
            }

             static float divide(int thirdNumber, int forthNumber, float fifthNumber) {

                return (thirdNumber / forthNumber / fifthNumber);
            }
        }
























