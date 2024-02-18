package Recursion_with_Kunal;

public class Rec3_Print_1toN_Nto1_both {
    public static void PrintBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintBoth(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        PrintBoth(5);
    }
}
