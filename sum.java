/*
Name: Kimberly B. Octavo
  Course/Section/Year: BSIT NETSEC 1-1
  */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("10: ");
        int number1 = input.nextInt();

        System.out.print("20: ");
        int number2 = input.nextInt();

        
        int sum = number1 + number2;

        
        System.out.println("The sum is: " + sum);

        input.close();
    }
}
