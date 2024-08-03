package Recursion_In_Java.Array;

public class RA_03_RBS {
    public static int RBS(int arr[], int target, int start, int end){
        //base condition
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        //case-1:
        if(arr[start]<arr[mid]) {
            // first half is sorted search in it
            if(target>=arr[start]&& target<=arr[mid]){
                return RBS(arr,target,start,mid-1);
            }else {
                return RBS(arr,target,mid+1,end);
            }
        }
        //case:2-
        if(target>=arr[mid] && target<=arr[end]){
            return RBS(arr,target,mid+1,end);
        }else {
            return RBS(arr,target,start,mid-1);
        }
    }
    public static void main(String[] args){
     int arr[]={5,6,7,8,9,1,2,3};
     System.out.println(RBS(arr,9,0,arr.length-1));
    }
}
