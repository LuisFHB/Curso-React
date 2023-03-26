package ejemplos;

import java.util.Scanner;

public class Roman {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int retrn ;
        do {
         System.out.print("Enter the Roman number to convert:");
         String numberRoman = input.nextLine();
         //String numberRoman="MCMXCIV";
         //convertimos el String en un array
         char[] aCharcter = numberRoman.toCharArray();
         //longitud del array
         int sizeArray = aCharcter.length;
         //creamos array integer con el mismo tamaño del array String
         int[] arrayNorNumbers = new int[sizeArray];
         //Convertimos cada valor del array en numero y lo guardamos
         for (int i = 0; i < sizeArray; i++) {
             switch (aCharcter[i]) {
                 case 'I' -> arrayNorNumbers[i] = 1;
                 case 'V' -> arrayNorNumbers[i] = 5;
                 case 'X' -> arrayNorNumbers[i] = 10;
                 case 'L' -> arrayNorNumbers[i] = 50;
                 case 'C' -> arrayNorNumbers[i] = 100;
                 case 'D' -> arrayNorNumbers[i] = 500;
                 case 'M' -> arrayNorNumbers[i] = 1000;
             }
         }
     /*for(int i=0; i<sizeArray; i++) {
         System.out.println(arrayNorNumbers[i]);
     }*/
            //creamos objeto
         RomanObj obje = new RomanObj();
         //creamos variable y mandamos el tamaño del array, arrayNumerico y nos regresa el numero
         int number = obje.arrayRomanToNormal(sizeArray, arrayNorNumbers);
         //imprimimos el numero
         System.out.println("The number is: " + number);
         System.out.println("Enter 1 to convert other number");
         retrn=input.nextInt();
        }while(retrn==1);
        System.out.println("Ok,have nice you day");
    }
}
