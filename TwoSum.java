package ejemplos;

public class TwoSum {
    public static void main(String[]args){
        int []a={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target=5;
        System.out.println("The target is: "+target);
        twoSum(a,target);
    }

    public static void twoSum(int[]a,int target){
        int[]b=new int[a.length];
        int actualindex=0,subindex=0;
        boolean count;
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a.length;j++){
              count=false;
                subindex=0;
                /*while((!count) && (subindex<actualindex) && actualindex<a.length && (a[i]+a[j]!=target)){
                    if(a[i]==b[subindex]){
                        count=true;
                    }
                    subindex++;
                }*/

           // if((!count)) {
           //     b[actualindex]=a[i];
           //     actualindex++;
                if ((a[i] + a[j]) == target) {
                    System.out.println("The number in index: " + i + " + " + j + " = " + target);
                    System.out.println(a[i] + " + " + a[j] + " = " + target);
                }
            //}
            }
        }
    }
}
