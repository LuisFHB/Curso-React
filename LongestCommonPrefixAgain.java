package ejemplos;
import java.util.Scanner;

public class LongestCommonPrefixAgain {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter number of words:");
        int numberWords = input.nextInt();
        String[] array = new String[numberWords];
        for(int i=0; i<numberWords;i++){
            System.out.print(("Enter word number "+(i+1)+": "));
            array[i]= input2.nextLine();
        }
        String[]a=prefix(array,numberWords);
        System.out.println("The common prefix is:");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    public static String[] prefix(String []array,int numberWords){
        int minWord = 0, maxWord = 0;
        for(int i=0;i<numberWords;i++){
            if(i<numberWords-1){
                if(array[0].length()<array[numberWords-1].length()){
                    minWord= array[0].length();
                } if(array[i].length()<array[i+1].length()){
                    minWord=array[i].length();
                }else{
                    minWord = array[numberWords-1].length();
                }
            }
        }
        for(int i=0;i<numberWords;i++){
            if(i<numberWords-1){
                if(array[0].length()>array[numberWords-1].length()){
                    maxWord= array[0].length();
                }else if(array[i].length()>array[i+1].length()){
                    maxWord=array[i].length();
                }
            }
        }

        String[][]matrix= new String [numberWords][maxWord];

        for(int i=0;i< numberWords;i++){
            for(int j=0; j< maxWord;j++){
                matrix[i][j]="0";
            }
        }
        for(int i=0;i< numberWords;i++){
            for(int j=0; j< minWord;j++){
                String s= array[i].substring(j,j+1);
                matrix[i][j]=s;
            }
        }

        /*for(int i=0; i< numWords;i++){
            for(int j=0; j< maxWord; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }*/
        String[] a = new String[minWord];

        for(int i=0; i<numberWords;i++){
            a[i]="";
        }


        for(int i=0; i< numberWords;i++){
            for(int j=0; j< minWord-1; j++) {
               if(i<numberWords-1){
                 if(matrix[i][j].equals(matrix[i + 1][j]) && matrix[0][j].equals(matrix[numberWords - 1][j]) ){
                     a[j]=matrix[i][j];
                 }
                 if(!matrix[i][j].equals(matrix[i + 1][j])){
                     a[j]="";
                 }
             }
            }
        }
       return a;
    }
}
