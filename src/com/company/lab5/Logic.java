package com.company.lab5;



public class Logic {
    //Write a Java program to test if an array of 100 positions contains values from 1 to 100.

    public static int[] main(String[] args){
        public int[] setValuesToArray(int maxValue){
            int[] array = new int[100];
            for (int i = 0; i<maxValue; i++){
                array[i] = i+1;
            }
            return array;
        }
    }

}
