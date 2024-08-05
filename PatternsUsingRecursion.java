package Complete_Dsa.Recursion.Lec4_Pattern_Usig_Recursion;

import java.util.Arrays;

public class PatternsUsingRecursion {
    public static void selection(int[] arr,int r, int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c); //max ne update
            }else {
                selection(arr,r,c+1,max);
            }
        }else {
          // max ne last(r-1) element sathe swap
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
    }
    public static void Bubble(int arr[],int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
           Bubble(arr,r,c+1);
        }else {
            Bubble(arr,r-1,0);
        }
    }
    public static void triangle1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle1(r,c+1);
            System.out.print("*");
        }else {
            triangle1(r-1,0);
            System.out.println();
        }
    }
    public static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }else {
            System.out.println();
            triangle(r-1,0) ;
        }
    }
    public static void main(String[] args){
//     triangle(4,0);
//        triangle1(4,0);
         int[] arr={4,3,2,1};
         Bubble(arr,arr.length-1,0);
         System.out.println(Arrays.toString(arr));
    }
}
