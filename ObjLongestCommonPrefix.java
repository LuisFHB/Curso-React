package ejemplos;

import java.util.Scanner;

public class ObjLongestCommonPrefix {
    public String[] Prefix (int numberOfWords){
     Scanner input=new Scanner(System.in);
     String[] a= new String[numberOfWords];
     //for to save the words
     for(int i =0; i<numberOfWords;i++) {
         System.out.print("Enter word number " + (i+1) + ": ");
         a[i] = input.nextLine();
     }
     //for to print the words
    /* for(int i =0; i<numberOfWords;i++){
         System.out.print(a[i]);
     }*/
     int wordMaxLength=0;
     //for to count the longest word
     for(int i=0;i<numberOfWords;i++){
         if(i<numberOfWords-1){
            if(a[i].length()> a[i+1].length() ){
                wordMaxLength=a[i].length();
             }
             if(a[0].length()>wordMaxLength){
                 wordMaxLength=a[0].length();
             }
             if(a[numberOfWords-1].length()>wordMaxLength){
                 wordMaxLength=a[numberOfWords-1].length();
             }
         }
     }

     //for to count the smallest word
     int wordMinLength=1000;
        for(int i=0;i<numberOfWords;i++){
            if(i<numberOfWords-1){
                if(a[i].length()< a[i+1].length() ){
                    wordMinLength=a[i].length();
                }
                if(a[0].length()<wordMinLength){
                    wordMinLength=a[0].length();
                }
                if(a[numberOfWords-1].length()<wordMinLength){
                    wordMinLength=a[numberOfWords-1].length();
                }
            }
        }

    // System.out.println();
     //System.out.println("The longest word is: "+wordMaxLength);
     //System.out.println("The smallest word is: "+wordMinLength);
     String[] prefix=new String[wordMinLength];
     String[][]b=new String[numberOfWords][wordMaxLength];
     //fill matrix b
        for(int i=0;i<numberOfWords;i++){
            for(int j=0; j<wordMaxLength;j++){
                b[i][j]=  String.valueOf(Math.random()*1000);

            }
        }
     //fill array prefix
     for(int i=0; i<wordMinLength;i++){
         prefix[i]="";
     }


     //for para crear matriz doble
     for(int i=0; i<numberOfWords;i++){
         for(int j=0; j<a[i].length();j++){
             b[i][j] = a[i].substring(j, j + 1);
             }
     }

//print matrix
   /*  System.out.println("Imprimimos matriz");
     for(int i=0;i<numberOfWords;i++){
       for(int j=0; j<wordMaxLength;j++){
         System.out.print(b[i][j]+",");
            }
       System.out.println("");
       }*/


     for(int i=0; i<numberOfWords;i++) {
         for (int j = 0; j < wordMinLength-1; j++) {
             if ((i < numberOfWords - 1)) {
                 if(b[i][j].equals(b[i+1][j]) && b[0][j].equals(b[numberOfWords-1][j])){
                   prefix[j]=b[i][j];
                 }
                 if(!b[i][j].equals(b[i + 1][j])){
                     prefix[j]="";
                 }
             }
         }
     }

       return prefix;
    }

}
