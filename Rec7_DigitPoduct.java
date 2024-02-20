package Recursion_with_Kunal;

public class Rec7_DigitPoduct {
    public static int Product(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * Product(n/10);
    }
    public static void main(String[] args){
        System.out.println(Product(1342));
    }
}
