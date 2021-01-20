package com.company.lab5;


import java.util.Scanner;

public class Logic {


    public static void main(String[] args) {

            // Array exercises
        // 1. Java Program to Count Even Numbers in an Array using For Loop

            class CountEven1 {
                private Scanner sc;

                public void main(String[] args) {
                    int[] a = new int[100];
                    for (int i = 0; i < 100; ++i) {
                        a[i] = i;
                    }
                    int Size, i, evenCount = 0;
                    sc = new Scanner(System.in);

                    System.out.print(" Please Enter Number of elements in an array : ");
                    Size = sc.nextInt();


                    System.out.print(" Please Enter " + Size + " elements of an Array  : ");
                    for (i = 0; i < Size; i++) {
                        a[i] = sc.nextInt();
                    }
                    System.out.print("\n List of Even Numbers in this Array are :");
                    for (i = 0; i < Size; i++) {
                        if (a[i] % 2 == 0) {
                            System.out.print(a[i] + " ");
                            evenCount++;
                        }
                    }
                    System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
                }
            }

        }
        // 2. Write a Java program to test if an array of 100 positions contains values from 1 to 100.

    public int[] getArrayToHundred() {

        int[] myArray = new int[100];



        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;

            System.out.println(myArray[i-1]);

        }

        return myArray;

    }
    // 3. Create a method with a parameter of an array type empty and then populate the array with values of
    // even numbers from 1 to 100

    public int[] getEvenArrayToHundred(int[] evenArray) {

        int j = 0;



        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenArray[j] = i;

                j++;

            }

        }

        return evenArray;

    }
    // 4. Create a method with a parameter of an array type populated with numbers, and the method to calculate
    // and return the average sum of numbers from the array

    public float getAverageArray(int[] myArray) {

        float sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

        }

        return (sum / myArray.length);

    }

// 5. Create a method with a parameter of an array type of strings populated with values and a parameter of string type.
// The method should verify if the value of the given string is same with the value in the array,if yes to return true
// and if not to return false

    public boolean checkInArray(String[] arrString, String input) {



        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }

    // 6.Create a method with  parameter of the type array of integer numbers populated, and a parameter of integer type
    // and the method to verify if the integer given number is in the array of integer numbers, and if yes to return
    // the position in the array the integer number is

    public int getPositionInArray(int[] Numbers, int nr) {

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == nr) {

                return i;

            }

        }

        return 0;

    }

// 7. Create a method to print the following grill using an array :
// - - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -
//
//- - - - - - - - - -

    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};



        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }
    // 8. Create a method with  parameter of the type array of integer numbers populated,and a parameter of integer type
    // The method to verify if the integer number exists in the array and if yes to return the array without that number

    public int[] removeNrFromArray(int[] myArray, int nr) {

        int[] secondArray = new int[myArray.length];

        int j = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == nr)

                continue;

            secondArray[j++] = myArray[i];

        }

        int[] finArray = new int[j];



        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }

// 9. Create a method of an array and the method to return the second smallest integer number from the array

    public int getSecondSmallestNrInArray(int[] myArray) {



        int temporary = 0;
        for(int i = 0; i< myArray.length;i++){
            for(int j = i + 1;j<myArray.length;j++){
                if(myArray[i] > myArray[j]){
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }

    // 10. Create a method with 2 parameters: a populated array and an empty array. The method will copy all the values
    // from the populated array and run them through the empty array

    public int[] copyArray(int[] firstArray, int[] emptyArray) {



        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;

        }

        return emptyArray;

    }




}






    


