package ejemplos;

public class RomanObj {
    public int arrayRomanToNormal(int size,int[]a){
        int number=0;
        int[] b =new int[size];
        for (int i=0; i<size;i++){
          if(i<size-1) {
              if (a[i] < a[i + 1]) {
                  b[i] = -a[i];
              }else{
                  b[i]=a[i];
              }
          }
           else{
           b[i]=a[i];
           }
        }
        for(int i=0; i<size; i++){
            number+=b[i];
        }
        return number;
    }
}
