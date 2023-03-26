package ejemplos;

import java.util.Scanner;

public class objetoMain {
    public static void main(String[]arg){
        Scanner into = new Scanner(System.in);
        do{
        float a, b,c;
        System.out.println("Introduce el primer valor:");
        a=into.nextFloat();
        System.out.println("Introduce el segundo valor:");
        b=into.nextFloat();
        objeto mensajero = new objeto();

        System.out.println("Elige una opcion: \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 division");
        int op=0;
        op=into.nextInt();

        switch (op) {
            case 1:
                System.out.println("El resultado es: " + mensajero.suma(a, b));
                break;
            case 2:
                System.out.println("El resultado es: " + mensajero.resta(a, b));
                break;
            case 3:
                System.out.println("El resultado es: " + mensajero.mult(a, b));
                break;
            case 4:
                System.out.println("El resultado es: " + mensajero.division(a, b));
                break;
        }
        System.out.println("Press 1 to do other operation");
        }while (into.nextInt()==1);
        System.out.println("Ok,see you later, have a nice day ");
    }



}





