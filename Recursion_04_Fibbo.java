package Recursion_In_Java;

public class Recursion_04_Fibbo {

    public static int fibboFormula(int n){
        return (int)(( Math.pow(((1+Math.sqrt(5))/2),n)/ Math.sqrt(5)));
    }

    public static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args){
     System.out.println(fibo(6));
    }
}
