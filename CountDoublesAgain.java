package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class CountDoublesAgain {
    public static void main(String[]args){
        Integer[] nums = {2,2,3,7,8,9,3,1,2,5,3,2,1}; // example array with multiple repeated numbers
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(nums));
        java.util.Collections.sort(arrayList);
        System.out.println("The arraylist after sort"+arrayList);
        for(int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) == arrayList.get(i - 1)) {
                System.out.println("The number " + arrayList.get(i - 1) + " is repeated.");
                arrayList.remove(arrayList.get(i - 1));
            }
        }
    }

}
