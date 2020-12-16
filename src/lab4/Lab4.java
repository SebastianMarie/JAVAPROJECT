package lab4;

public class Lab4 {
    public static void main(String[] args) {

//Given a number

        int x = 25;
        for (int i = x; i < 100; i++) {
            System.out.println(i);
        }
    }

    public void printToHundredWhile(int startValue) {
        while (startValue <= 100) {
            System.out.println(startValue);
            startValue++;


        }
    }

    // Write a java program to count backwards from a given number to a lower given number
    int start = 100;
    int finish = 10;

    public void printFromHighToLow(int start, int finish) {

    }

    {
        for (int i = start; i >= finish; i--) {
            System.out.println(i);

        }

    }

    public void printToHudredWhile(int startValue) {
        while (startValue < 100) {
            System.out.println(startValue);
            startValue--;
        }
    }

    public void asda() {
        int x = 100;
        for (int i = x; i < 100; i--) {
            System.out.println(i);
        }
    }

    public void adasdasd() {
        int sum = 0;
        for (int i = 1; i <=100;i++){
            sum = i + sum;
        }
        System.out.println(sum);
    }
}



