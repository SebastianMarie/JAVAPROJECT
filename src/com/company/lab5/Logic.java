package com.company.lab5;


import java.util.Scanner;

public class Logic {


    public static void main(String[] args) {


        //Populate an array with even numbers from 1 to 100

        //Write a Java program to test if an array contains a specific value.
        //int[] secondArrayLength = {3, 5, 7, 2, 3, 4};
        //int valueToFind = 4;



            // Java Program to Count Even Numbers in an Array using For Loop


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
        //Write a Java program to test if an array of 100 positions contains values from 1 to 100.
        


    }






    


