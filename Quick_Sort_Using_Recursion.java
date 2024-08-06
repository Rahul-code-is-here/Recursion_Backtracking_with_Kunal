package Complete_Dsa.Recursion.Lec4_Pattern_Usig_Recursion.PATTERN_USING_RECURSION;

import java.util.Arrays;

public class Quick_Sort_Using_Recursion {
    public static void sort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];

        while (s<=e){
            // it's also reason why if its already sorted it will not swap
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        // now my pivot is on correct position, now sort two halves now
        sort(nums,low,e); // e-- thai ne and s++ thaine ekbijane cross kari gya so first half low to end
        sort(nums,s,high);// so second half thashe start to high
    }
   public static void main(String[] args){
   int[] arr={5,4,3,2,1};
   sort(arr,0,arr.length-1);
   System.out.println(Arrays.toString(arr));
   }
}
