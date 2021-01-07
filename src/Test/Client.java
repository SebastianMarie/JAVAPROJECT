package Test;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
    int a=20;
    int b=32;
    Scanner scan = new Scanner(System.in);

    System.out.print("Cel mai mare numar este:");
    int celMaiMareNumar = Metode.checkBiggerNumber(a,b);
    System.out.println(celMaiMareNumar);
    }
}
