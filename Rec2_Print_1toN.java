package Recursion_with_Kunal;

public class Rec2_Print_1toN {
    public static void PrintToN(int n){
        if(n==0){
            return;
        }
        PrintToN(n-1);
        System.out.println(n);

    }
    public static void main(String[] args){
       PrintToN(5);
    }
}
