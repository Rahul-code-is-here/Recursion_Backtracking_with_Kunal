package Recursion_with_Kunal;

public class Rec1 {
    public static void PrintNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNto1(n-1);
    }
    public static void main(String[] args){
        PrintNto1(5);
    }
}
