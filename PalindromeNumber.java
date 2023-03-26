package ejemplos;


import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        do {
            System.out.println("Enter the number to analyze");
            int number = input.nextInt();
            int palindromNumber = 0, convertNumber = number;
            String numberString = String.valueOf(number);
            int a, b, c;
           // System.out.println("length: " + numberString.length());
            for (int i = 0; i < numberString.length(); i++) {
                c = palindromNumber;
                a = (convertNumber % 10);
                palindromNumber = (c * 10) + a;
                b = (convertNumber / 10);
                convertNumber = b;
             //   System.out.println("Convert number: " + convertNumber +
               //         "\n Palindrome number: " + palindromNumber);
            }
            System.out.println("Reverse number:" + palindromNumber + "\n Origin number: " + number);
            if (palindromNumber == number) {
                System.out.println("The number is a palindrome");
            } else {
                System.out.println("The number is not a palindrome");
            }
            System.out.println("To analyze other number write 1");
        }while(1==input2.nextInt());

    }
}
