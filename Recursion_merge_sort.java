package Complete_Dsa.Recursion.Lec4_Pattern_Usig_Recursion.PATTERN_USING_RECURSION;

import java.util.Arrays;
// time complexity O(n*logn)  total logn level and each level has each level made n comparision
// n/2^0 + n/2^1+ n/2^2 + ... + n/2^k
// n/2^k ma chelle 1 j element hashe so n/2^k=1 have log lai lo etle log base2 k ans aavi jashe
// space complexity O(n)

public class Recursion_merge_sort {
    public static int[] merge_sort(int arr[]){
        //base condition
        if(arr.length==1){
            return arr;  // it will return where it was callled
        }
        int mid=arr.length/2;
        //here we are not using origanl array, we are using copy of array
        int[] left=merge_sort(Arrays.copyOfRange(arr,0, mid));
        int[] right=merge_sort(Arrays.copyOfRange(arr,mid,arr.length));

        // now it's time to merge it
        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        int mix[]= new int[first.length+second.length];
        // technique of merging two parts
        int i=0; // first half mate
        int j=0; // second half mate
        int k=0; // new mix array mate, element sort thaine aama add thashe

        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }else {
                mix[k]=second[j];
                j++;
                k++;
            }
        }
     // it may be possible that one of the array is not complete
        while(i<first.length){
            // while i is  not finish copy the remainning element
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            // while j is not finish copy the remainning element
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void merge_sort_in_place(int arr[], int s, int e){
        //base condition
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;

        merge_sort_in_place(arr,s,mid);
        merge_sort_in_place(arr,mid,e);

        // now it's time to merge it
        merge_in_place(arr,s,mid,e);
    }
    private static void merge_in_place(int[] arr, int s, int m,int e){
        int mix[]= new int[e-s]; // nichethi uper aavie tyare ketali length no mix array joie for that
        // technique of merging two parts
        int i=s; // first half mate
        int j=m;  // second half mate
        int k=0; // new mix array mate, element sort thaine aama add thashe

        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
                k++;
            }else {
                mix[k]=arr[j];
                j++;
                k++;
            }
        }
        // it may be possible that one of the array is not complete
        while(i<m){
            // while i is  not finish copy the remainning element
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            // while j is not finish copy the remainning element
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            arr[s+l]=mix[l]; //nichethi mano ke start index 3 and end index 4 che tya j modification
            // karavanu che e be original array ma so 0,1 e na thai te mate s+l.
        }
    }
    public static void main(String[] args){
     int arr[]={5,4,3,2,1};

//     arr=merge_sort(arr);    // orignalnal array update karava mate

//     int[] ans = merge_sort(arr);


     // only merge sort chalavathi nai thai. kem ke original array midify nathi thato.
     // Arrays.copyOfRange is creating new object for every function call
     // origanal is not modified

        merge_sort_in_place(arr,0,arr.length);
     System.out.println(Arrays.toString(arr));

//     System.out.println(Arrays.toString(ans));
    }
}
