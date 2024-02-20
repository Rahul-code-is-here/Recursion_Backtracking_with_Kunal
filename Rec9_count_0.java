package Recursion_with_Kunal;

public class Rec9_count_0 {
    public static int count0(int n){
        return helper(n,0);
        // aama count  ek vaar j return thi che, baki badhama khali pass thai che
        // special pattern: how to pass value to above calls
        //special example to return same value to above function call
    }
    public static int helper(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
           return helper(n/10, count+1);
        }else {
         return  helper(n/10, count);
        }
    }
    public static void main(String[] args){
       int c= count0(100);
        System.out.println(c);
    }
}
