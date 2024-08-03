package Complete_Dsa.Recursion.Lec1;

public class Rec1_Lec1And2 {
    public static int fibboOptimalWay(int n){
        return (int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    public static int fibbo(int n){
        //base condition
        if(n<=1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static int count0(int n){
        return helper1(n,0);
    }

    private static int helper1(int n, int count ){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
           return helper1(n/10,count+1);
        }else {
          return  helper1(n/10,count);
        }
    }

    public static boolean palindromeNum(int n){
        return n==reverseNum(n);
    }
    public static int reverseNum(int n){
        // ghani vaar helper func ni jarur padshe
        int digit=(int)(Math.log10(n)+1);
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        int rem=n%10;
        return rem*(int)Math.pow(10,digit)+ helper(n/10,digit-1);
    }

    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static int productOfIndividualDigit(int n){
        //base condition
        if(n%10==n){
            return n;
        }
        return n%10*productOfIndividualDigit(n/10);
    }
    public static int SumOfIndividualDigit(int n){
        //base condition
        if(n%10==n){
            return n;
        }
        return n%10+SumOfIndividualDigit(n/10);
    }
    public static int sumOfNnumber(int n){
        //base condition
        if(n<=1){
            return n;
        }
        return n+sumOfNnumber(n-1);
    }
    public static int factorial(int n){
        //base condition
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void print1toN(int n){
        // base condition
        if(n==1){
            System.out.println(n);
            return;
        }
        print1toN(n-1);
        System.out.println(n);
    }
    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args){
//        printNto1(5);
//        print1toN(5);
//        System.out.println(factorial(15));
//        System.out.println(sumOfNnumber(3));
//        System.out.println(SumOfIndividualDigit(123));
//        System.out.println(productOfIndividualDigit(1234));
        System.out.println(fibbo(5));
        System.out.println(fibboOptimalWay(5));
    }
}
