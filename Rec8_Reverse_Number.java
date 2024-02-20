package Recursion_with_Kunal;

public class Rec8_Reverse_Number {
    static int sum=0;
    public static void reverse1(int n){
        if(n==0){
            return;
        }
        int rem= n%10;
        sum= sum*10 +rem;
        reverse1(n/10);
    }

    public static int reverse2(int n){
        //sometimes you need some additional variable in the arguments
        // in that case, make another function
        int digit= (int)(Math.log10(n)+1);// imp
      return helper(n,digit);
    }
    public static int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem= n%10;
        return rem*(int)Math.pow(10,digit-1) + helper(n/10,digit-1);
    }

    public static boolean palidrom(int n){
        return n == reverse2(n);
    }

    public static void main(String [] args){
        //System.out.println(reverse2(1234));
        //System.out.println(sum);
        System.out.println(palidrom(1234));
    }
}
