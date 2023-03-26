package ejemplos;

public class CountDoublesObj {

    public int duobles(int[]a ){
        int count=0;
        int size = a.length;
        for(int i =0; i<size; i++){
            for(int j=0; j<size;j++ ){
             for(int k=0;k<size;k++){
                  if(i!=j && i!=k  ){
                         if(a[i]==a[j] || a[i]==a[k]){
                             count=count+1;
                         }
                     }
                 }
                }
            }

        return  (count/10);
    }
}
