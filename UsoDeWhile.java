package ejemplos;

public class UsoDeWhile {
    public static void main(String[]args){
        int k=0;
        while (k<10){
            if(k%2==0){
                System.out.println(k+" Multiplo de 2");
            }else{
                System.out.println(k+" No es multiplo");
            }
            k++;
        }
    }
}
