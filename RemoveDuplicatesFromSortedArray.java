package ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[]args){
        int[] nums = {2,3,1,1,2,4,5,6,6,7,7,8,8,9,9,5,1,2}; // Input array
        //int[] expectedNums = removeDuplicates((nums)); // The expected answer with correct length
       removeDuplicates(nums);
        /*int k = removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }*/

    }
    public static void removeDuplicates(int[]nums){
        ArrayList<Integer> l1= new ArrayList<>();
        int[]numCounted=new int[nums.length];
        int indexForRevision,indexCounted=0;
        boolean counted;

        for(int i=0; i< nums.length;i++){
            counted=false;
            indexForRevision=0;

            while(!counted && indexForRevision<indexCounted){
                if(numCounted[indexForRevision]==nums[i]){
                    counted=true;
                }
                indexForRevision++;

            }
            if(!counted) {
                numCounted[indexCounted]=nums[i];
                indexCounted++;
                l1.add(nums[i]);
            }
        }

        /*for (int num : nums) {
            counted = false;
            indexForRevision = 0;

            while (!counted && indexForRevision < indexCounted) {
                if (numCounted[indexCounted] == num) {
                    counted = true;
                }
                indexForRevision++;

            }
            if (!counted) {
                numCounted[indexCounted] = num;
                indexCounted++;
                l1.add(num);
            }
        }*/
      /*  int[] Object = new int[l1.size()];
        Object[] numNew = l1.toArray();
        return Object;*/
        Collections.sort(l1);
        System.out.println(l1);




    }
}
