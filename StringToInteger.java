package ejemplos;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to convert");
        String a= input.nextLine();
        StrToInt(a);
    }

    public static void StrToInt(String a){
        int a_Int = Integer.parseInt(a);
        System.out.println("Now the number is Int: "+a_Int);
    }
}
