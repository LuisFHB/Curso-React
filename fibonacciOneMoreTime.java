package ejemplos;

public class fibonacciOneMoreTime {
    public static void main(String[]args){
        //0,1,1,2,3,5,8,13,21,34
        int a=0,b=1,c;

        for(int i=0; i<10;i++){
            System.out.print(a+",");
            c=b+a;
            a=b;
            b=c;
        }

    }


}
