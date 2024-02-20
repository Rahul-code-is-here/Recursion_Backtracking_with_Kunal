package Recursion_with_Kunal;

public class Rec6_Sum_of_individual_digit {
    public static int DigitSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + DigitSum(n/10);
    }
    public static void main(String [] args){
        System.out.println(DigitSum(456));
    }
}
