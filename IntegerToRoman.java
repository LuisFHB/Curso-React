package ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String numberStr="";
        System.out.println("Pleas enter the number to convert in roman number:");
        numberStr=input.nextLine();
        IntegToRoman(numberStr);
    }
    public static void IntegToRoman(String numberStr){
        int size = numberStr.length();
        int []a=new int[size];
        int []b=new int[size];
        for(int i=0; i<size;i++){
            if(i<size-1) {
                a[0] = Integer.valueOf(numberStr.substring(0, 1));
                a[numberStr.length() - 1] = Integer.valueOf(numberStr.substring(size - 1,size));
                a[i] = Integer.valueOf(numberStr.substring(i, i + 1));
            }
        }

        ArrayList<String> Roman = new ArrayList<>();

        for(int i=0; i<size;i++){
           int potencia=(size-1-i);
            b[i]= (int) (a[i]*Math.pow(10,potencia));
            if(b[i]==900){
                Roman.add("CM");
            }if(b[i]==400){
                Roman.add("CD");
            }if(b[i]==90){
                Roman.add("XC");
            }if(b[i]==40){
                Roman.add("XL");
            }if(b[i]==9){
                Roman.add("IX");
            }if(b[i]==4){
                Roman.add("IV");
            }
            if (b[i]!=900 && b[i]!=400 && b[i]!=90 && b[i]!=40 && b[i]!=9 && b[i]!=4) {
                int repeat = 0;
                if (b[i] / 1000 >= 1) {
                    repeat = b[i] / 1000;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("M");
                    }
                }
                if (b[i] / 500 >= 1 && b[i] < 1000) {
                    repeat = b[i] / 500;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("D");
                    }
                }
                if (b[i] / 100 >= 1 && b[i] < 500) {
                    repeat = b[i] / 100;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("C");
                    }
                }
                if (b[i] / 50 >= 1 && b[i] < 100) {
                    repeat = b[i] / 50;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("L");
                    }
                }
                if (b[i] / 10 >= 1 && b[i] < 50) {
                    repeat = b[i] / 10;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("X");
                    }
                }
                if (b[i] / 5 >= 1 && b[i] < 10) {
                    repeat = b[i] / 5;
                    for (int j = 0; j < repeat; j++) {
                        Roman.add("V");
                    }
                }
                if (b[i] / 1 >= 1 && b[i] < 5) {
                    repeat = b[i] / 1;
                    Roman.add("I");
                }
            }



        }
     System.out.print("The number is:");
     for(int i =0; i< Roman.size(); i++) {
         System.out.print(Roman.get(i));
     }

    }
}
