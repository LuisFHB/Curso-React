package ejemplos;

import java.util.Scanner;

public class MainYMetodosEnUno {
    public static void main(String[]arg){
        Scanner into = new Scanner(System.in);
        do{
            float a, b,c;
            String mensaje1="";
            System.out.println("Introduce el primer valor:");
            a=into.nextFloat();
            System.out.println("Introduce el segundo valor:");
            b=into.nextFloat();
            System.out.println("Elige una opcion: \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 division");
            int op=0;
            op=into.nextInt();
            switch (op) {
                case 1:
                    suma(a,b);
                    break;
                case 2:
                    resta(a,b);
                    break;
                case 3:
                    mult(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
            }

            System.out.println("Press 1 to do other operation");
        }while (into.nextInt()==1);
        System.out.println("Ok,see you later, have a nice day ");
    }

    public static void suma(double a, double b){
        System.out.println("El resultado de la suma es: " +(a+b));
    }
    public static void resta(double a, double b){
        System.out.println("El resultado de la resta es: " +(a-b));
    }
    public static void mult(double a, double b){
        System.out.println("El resultado de la multiplicacion es: " +(a*b));
    }
    public static void division(double a, double b){
        System.out.println("El resultado de la division es: " +(a/b));
    }



}
