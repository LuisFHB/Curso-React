package ejemplos;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main (String[]args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number of word: ");
     int numberWords = input.nextInt();
     ObjLongestCommonPrefix obj = new ObjLongestCommonPrefix();
     String[] prefix =  obj.Prefix(numberWords);
     System.out.print("Prefix: ");
     for(int i=0; i< prefix.length;i++){
         System.out.print(prefix[i]+"");
     }


    }
}
