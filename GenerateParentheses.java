package ejemplos;

public class GenerateParentheses {
    public static void main(String [] args){
        int number=5;
        Generate(number);
    }
    public static void Generate(int number){
        System.out.print("[");
        for(int i=0; i<number;i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < number; j++) {
                System.out.print(")");
            }
         if(i!=(number-1)){
             System.out.print(",");
         }else{
             System.out.println("]");
         }
        }

    }
}
