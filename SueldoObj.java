package ejemplos;

import java.util.Scanner;

public class SueldoObj {
    public float[] PTC(float sueldoBasico, float apoyoMaterialDidactico, float bono, float anosDeServicio){
        Scanner entrada = new Scanner(System.in);
        float sueldoBruto= sueldoBasico+apoyoMaterialDidactico+bono;
        float imss = sueldoBruto*5/100;
        float jubilacion = sueldoBruto*10/100;
        float ISR = sueldoBruto*16/100;
        float deducciones = imss+jubilacion+ISR;
        float sueldoNeto = sueldoBruto-deducciones;
        System.out.println("¿Tiene credito hipotecario? 1 para Si y 2 para No");
        int resCredito = entrada.nextInt();
        float creditoHipotecario;
        if(resCredito==1){
            creditoHipotecario= (sueldoBruto*30/100)*10;
        } else{
            creditoHipotecario=0;
        }
        float jubilacionMonto;
        if(anosDeServicio<25){
           jubilacionMonto=0;
        }else if(anosDeServicio<30){
            jubilacionMonto= (sueldoNeto*80/100) *52;
        }else if (anosDeServicio<35){
            jubilacionMonto=(sueldoNeto*95/100)*52;
        }else{
            jubilacionMonto=sueldoNeto*52;
        }
        float []a={sueldoBruto,deducciones,sueldoNeto,creditoHipotecario,jubilacionMonto};
        return a;
    }


    public float[] PA(float sueldoBasico, float apoyoMaterialDidactico, float bono, float anosDeServicio){
        Scanner entrada = new Scanner(System.in);
        float sueldoBruto= sueldoBasico+apoyoMaterialDidactico+bono;
        float imss = sueldoBruto*5/100;
        float jubilacion = sueldoBruto*10/100;
        float ISR = sueldoBruto*16/100;
        float deducciones = imss+jubilacion+ISR;
        float sueldoNeto = sueldoBruto-deducciones;
        float prestamo = 0;
        if (anosDeServicio<5){
            prestamo=0;
        } else if (anosDeServicio>=5){
            prestamo=(sueldoNeto*10/100)*52*2;
        }
        float[]b={sueldoBruto,deducciones,sueldoNeto,prestamo};
        return b;
    }
}
