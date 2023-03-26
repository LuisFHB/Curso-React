package ejemplos;

public class fibonacciAgain {
    public static void main(String[]args){
        //0,1,1,2,3,5,8,13,21,34,55
        //1,2,3
          //1,2,3
        int first=0,second=1, third;
        for(int i=0; i<10;i++){
         System.out.print(first+",");
         third=first+second;
         first=second;
         second=third;

        }
    }
}
