package ejemplos;

import java.util.Scanner;

public class Sueldo {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        SueldoObj Objeto = new SueldoObj();
        do {
            System.out.println("Bienvenido al sistema de calculo de salario, ingresa los valores que se piden a continuación:");
            System.out.print("Nombre completo:");
            String nombre="";
            nombre= entrada.nextLine();
            System.out.print("Sueldo basico:");
            float sueldoBasico =0;
            sueldoBasico= entrada.nextFloat();
            System.out.print("Apoyo en material didactico:");
            float apoyoMaterialDidactico = 0;
            apoyoMaterialDidactico = entrada.nextFloat();
            System.out.print("Bono:");
            float bonoDinero = 0;
            bonoDinero= entrada.nextFloat();
            System.out.print("Años de servicio:");
            float anosDeServicio =0;
            anosDeServicio= entrada.nextFloat();
            System.out.println("Ingresa el tipo de puesto: " +
                    "\n escribe 1 para tiempo completo " +
                    "\n escribe 2 para tiempo parcial");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    float[] a = Objeto.PTC(sueldoBasico, apoyoMaterialDidactico, bonoDinero, anosDeServicio);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Puesto: PTC");
                    System.out.println("Sueldo bruto: " + a[0]);
                    System.out.println("Deducciones: " + a[1]);
                    System.out.println("Sueldo neto: " + a[2]);
                    System.out.println("Credito hipotecario: " + a[3]);
                    System.out.println("Jubilacion: " + a[4]);
                    break;
                case 2:
                    float[] b = Objeto.PA(sueldoBasico,apoyoMaterialDidactico,bonoDinero,anosDeServicio);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Puesto: PA");
                    System.out.println("Sueldo bruto: " + b[0]);
                    System.out.println("Deducciones: " + b[1]);
                    System.out.println("Deducciones: " + b[2]);
                    System.out.println("Deducciones: " + b[3]);
                    break;
            }
            System.out.println("Si desea calcular a otro trabajador escriba 1 y 2 para salir");
        }while (entrada.nextInt()==1);
    }
}
