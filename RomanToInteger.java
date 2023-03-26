package ejemplos;

public class RomanToInteger {
    public static void main(String[]args){
        String roman = "XLV";
        System.out.println("Integer: "+RomantoInteger(roman));
    }

    public static int RomantoInteger(String roman){
        int Integ=0;
        char[] arrayChar = roman.toCharArray();
        int [] arrayInteger =  new int[arrayChar.length];
        for(int i=0; i<arrayChar.length;i++){
            switch (arrayChar[i]){
                case 'I':
                    arrayInteger[i]=1;
                    break;
                case 'V':
                    arrayInteger[i]=5;
                    break;
                case 'X':
                    arrayInteger[i]=10;
                    break;
                case 'L':
                    arrayInteger[i]=50;
                    break;
                case 'C':
                    arrayInteger[i]=100;
                    break;
                case 'D':
                    arrayInteger[i]=500;
                    break;
                case 'M':
                    arrayInteger[i]=1000;
                    break;
            }
        }
        int b[]=new int[arrayChar.length];
        b[arrayChar.length-1]=arrayInteger[arrayChar.length-1];
        for(int i=0; i<arrayChar.length;i++){
            if(i< arrayChar.length-1){
                if(arrayInteger[i]<arrayInteger[i+1]){
                    b[i]= -arrayInteger[i];
                }else{
                    b[i]=arrayInteger[i];
                }
            }
            Integ+=b[i];
        }


        return Integ;
    }
}
