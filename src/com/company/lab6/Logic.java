package com.company.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {
    // Tema ex. 1
    public  List<Integer> addNumberToList(List<Integer> myList, int number) {
        myList.add(number);
        return myList;

    }

    //Tema ex.2
    public void printList(List<Integer>myList) {
        for(int i = 0; i<myList.size(); i++);{
            System.out.println("My List ");
        }
    }
    //Tema ex.3 Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un
    // numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou,
    // pornind de la numarul intreg primit ca si parametru.
    public void printListFromNumber(List<Integer> myList, int number){
        for (int i=number;i<myList.size();i++){
            System.out.println(myList.get(i));
        }

    }
    //Tema ex.4 Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din
    // lista, dar invers(de la capat la inceput).
    public void printReverseOrder(List<Integer> myList, int number) {
        for(int i = number; i>(-1);i--){
            System.out.println(myList.get(i));
        }
    }
    //Tema ex. 6 Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    //iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.


    public void listChangeIndex(List<Integer> myList, int number) {
            List<Integer> l1 = new ArrayList<Integer>();
            int x =5;
            l1.add(0, x);
            System.out.println(l1);
        }
    // Tema ex. 7 Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce
    // pe ce pozitie.
    public static void main(String[] args)
    {
        // Size of ArrayList
        int n = 5;

        // Declaring the List with initial size n
        List<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new elements
        // at the end of the list
        for (int i = 1; i <= n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);
    }
    // Tema ex.8 Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public class MaxList {
        public void main(String[] args) {
            List l = new ArrayList();
            l.add(1);
            l.add(2);
            l.add(3);
            l.add(4);
            l.add(5);
            System.out.println(Collections.max(l)); // 5
        }
    }
}











