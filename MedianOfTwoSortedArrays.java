package ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
    public static void main(String[]args){
        int []a={1,3};
        int []b={2,4};
        System.out.print("First array: ");
        for(int i=0;i<a.length;i++){
            if(i==a.length-1){
                System.out.println(a[i]+"]");
            }else if(i==0){
                System.out.print("["+a[i]+",");
            }else{
                System.out.print(a[i]+",");
            }
        }
        System.out.print("Second array: ");
        for(int i=0;i<b.length;i++){
            if(i==b.length-1){
                System.out.println(b[i]+"]");
            }else if(i==0){
                System.out.print("["+b[i]+",");
            }else{
                System.out.print(b[i]+",");
            }
        }
        System.out.println("The median is: "+median(a,b));
    }

    public static double median(int[]a, int[]b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        double  media,w;
        int x,z;
        for(int i=0; i<a.length;i++){
            c.add(a[i]);
        }
        for(int i=0; i<b.length;i++){
            c.add(b[i]);
        }
        Collections.sort(c);
        System.out.print("In order: ");
        System.out.println(c);

        x=c.size();
        z=x/2;
        if(z%2!=0){
            media=c.get(z);
            return media;
        }else{
            w=(c.get(z-1)+c.get(z));
            media=w/2;
            return media;
        }


    }

}
