package Recursion_with_Kunal;

public class Rec10_No_of_step_to_no_become_0 {
    public static int noOfStep(int n){
       return helper(n,0);
    }
    public static int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        } else {
            return helper(n-1,steps+1);
        }
    }
    public static void main(String[] args){
        int ans= noOfStep(125);
        System.out.println(ans);
    }
}
