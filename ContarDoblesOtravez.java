package ejemplos;

public class ContarDoblesOtravez {
    public static void main(String[]args){
        int[]a={1,1,2,3,1,4,5,6};
        counts(a);
    }

    public static void counts(int[]a){
        int size= a.length;
        int[]b=new int[a.length];
        int[]c=new int[a.length];
        int indexContado=0;
        for(int i=0; i<size;i++){
            int numRepet=1;
            int indexOfComparation=0;
            boolean counted=false;

            while(!counted && indexOfComparation<indexContado){
                if(a[i]==b[indexOfComparation]){
                    counted=true;
                }
                indexOfComparation++;
            }

            if(!counted){
                b[indexContado]=a[i];
                indexContado++;
                for(int j=0; j<size;j++){
                    if(j!=i){
                        if(a[i]==a[j]){
                            numRepet++;
                        }
                    }
                }
                System.out.println("The number "+a[i]+" repeat "+numRepet);
                c[i]=numRepet;
            }
        }
        int repeat=0;
        for(int i=0; i<size;i++){
            if(c[i]>1){
                repeat++;
            }
        }
        System.out.println("Total of repeat "+repeat);
    }



}
