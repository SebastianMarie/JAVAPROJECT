package lab4;


public class Logic {


    public void printToHundred(int startValue) {
        for (int i = startValue; i <= 100; i++) {
            System.out.println(i);

        }


    }

    public void  getSum(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;
        }

    }
    int start1 = 100;
    int finish1 = 10;

    public void printFromHighToLow(int start1, int finish1) {
        for (int i = start1; i >= finish1; i--) {
            System.out.println(i);

        }

    }
    // Count all the even numbers from 1 to 100
    public  void countEvenNumbers (){
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    // Count all the odd numbers from 1 to 100

    public  void countOddNumbers() {
        for (int i = 0; i <= 100; i = i + 1) {
            System.out.println(i);
        }
    }

    // Calculate the sum from 111 to 8899 with while loop


    public void printString() {
        final String[][] matrix = {
                { "*","*","*","*","*","*","*"},
                { "*","*","*","*","*","*"," "},
                { "*","*","*","*","*"," "," "},
                { "*","*","*","*"," "," "," "},
                { "*","*","*"," "," "," "," "},
                { "*","*"," "," "," "," "," "},
                { "*"," "," "," "," "," "," "}
        };
        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrix[Integer.parseInt(String.valueOf(i))].length; j++) { //this equals to the column in each row.
                System.out.print(matrix[Integer.parseInt(String.valueOf(i))][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }
    //Display the first 20 numbers of Fibonacci


    public void displayFibonacci() {

        int i = 1, n = 20, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
    // Print 10 lines from 1 to 110 , with 11 positions on each line with Coza,Loza,Woza, etc.

    public void displayCozaLozaWoza() {

            int i = 1;

            while (i <= 110) {
                boolean test = false;
                if (i % 3 == 0) {
                    System.out.print("coza");
                    test = true;
                }
                if (i % 5 == 0) {
                    System.out.print("loza");
                    test = true;
                }
                if (i % 7 == 0) {
                    System.out.print("woza");
                    test = true;
                }
                if (!test) {
                    System.out.print(i);
                }
                System.out.print(" ");
                if (i % 11 == 0) {
                    System.out.println();
                }
                i++;
            }
        }






    public void printToHundred() {

    }

    public void sumNatural(int i, int i1) {
    }


    public void print(String s) {
    }


}