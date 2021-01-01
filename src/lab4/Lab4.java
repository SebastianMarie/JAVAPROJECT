package lab4;

public class Lab4<finish, start, i, count> {
    public static void main(String[] args) {

//Given a number , print all the numbers from the given number to 100


        int count = 1;
        while(count <= 100) {
            System.out.println(count);
            count = count + 1;
        }


        int x = 25;
        for (int i = x; i < 100; i++) {
            System.out.println(i);

        }
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


    }

    // Count all the even numbers from 1 to 100
    public static class Main {
        public static void main(String[] args) {
            for (int i = 0; i <= 100; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    // Count all the odd numbers from 1 to 100
    public static class Main1 {
        public static void main(String[] args) {
            for (int i = 0; i <= 100; i = i + 1) {
                System.out.println(i);
            }
        }
    }
    public static class Print2DArray {
        public static void main(String[] args) {
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
    }


}





