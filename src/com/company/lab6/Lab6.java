package com.company.lab6;
import java.util.ArrayList;
import java.util.List;


public class Lab6 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();


        Integer index = 3;
        int size = 0;
        myList.add(index,5);

        myList.remove(Integer.valueOf(1));

        Logic logic = new Logic();
        System.out.println(logic.addNumberToList(myList,3));
        logic.printListFromNumber(myList,2);

        logic.printReverseOrder(myList, 4);
     }


}
