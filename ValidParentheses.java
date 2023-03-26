package ejemplos;

public class ValidParentheses {
    public static void main(String[]args){
        String [] a={"(", "]","[","]","{","}"};
        valid(a);

    }
    public static void valid(String[]a){
        for(int i=0;i< a.length;i++){
            if((i%2)!=1 && i<a.length-1){
                if(a[i].equals("(")&& a[i+1].equals(")")){
                   System.out.println("True");
                }else if(a[i].equals("[")&& a[i+1].equals("]")){
                   System.out.println("True");
                }else if(a[i].equals("{")&& a[i+1].equals("}")){
                   System.out.println("True");
                }else {
                    System.out.println("False");
                }

            }
        }
    }
}
