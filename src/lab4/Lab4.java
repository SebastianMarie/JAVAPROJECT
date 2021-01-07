package lab4;

public class Lab4<finish, start, i, count> {


    public static void main(String[] args) {

//Given a number , print all the numbers from the given number to 100



        // Sum the numbers from 1 to 100

        int y = 1, sum = 0;

        while (y <= 100) {
            sum = sum + y;
            y++;
        }
        System.out.println("Summation: " + sum);

        int sum1 = 0;
        for (int j = 1; j <=100;j++){
            sum1 = j + sum1;
        }
        System.out.println(sum);
        // Count all the even numbers from 1 to 100
        // Apelare la metoda din Logic countEvenNumbers

Logic logic = new Logic();
logic.countEvenNumbers();

        // Count all the odd numbers from 1 to 100
// Apelare la metoda din Logic countOddNumbers
        logic.countOddNumbers();

        // Apelare la metoda printToHundred


        logic.printToHundred();
// Apelare la metoda getSum
        logic.getSum(1,100);

        // Apelare metoda printFromHighToLow

        logic.printFromHighToLow(100,10);

        //Apelare prinString

        logic.printString();





        // Apelare printCozaLozaWoza
logic.printLinesCozaLozaWoza();

// Apelare displayFibonacci primele 20 numere
logic.displayFibonacci();


    }












// Calculate the sum from 111 to 8899 with while loop


// Calculate the average of numbers from 111 to 8899 with while loop
    //n=8899-111=8788
    //sumF=395944




}






