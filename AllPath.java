package Complete_Dsa.Recursion.Lec10_backtracking;

import java.util.Arrays;

public class AllPath {
    public static void allPaths(String p,boolean[][] arr, int r, int c){
        // base condition, uper niche and left and right baddhe jai shakie
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        // funct call e je r,c path ma add kari tene false mark kari dyo so fari vakhat tyathi aagal na jai shaki
        arr[r][c]=false;
        if(r<arr.length-1){
            allPaths(p+'D',arr, r+1,c);
        }
        if (c<arr[0].length-1){
            allPaths(p+'R',arr,r,c+1);
        }
        if(r>0){ // top/uper jaishu
            allPaths(p+'T',arr,r-1,c);
        }
        if(c>0){ // down or niche jaishu
            allPaths(p+'L',arr,r,c-1);
        }
        // this line is where the functions will be over
        // so before the function gets removed, also remove the changes that were made by that function
        arr[r][c]=true;
    }
    public static void allPathsPrints(String p,boolean[][] arr, int r, int c, int[][] path, int step){
        // base condition, uper niche and left and right baddhe jai shakie
        if(r==arr.length-1 && c==arr[0].length-1){
            for (int[] nums: path){
                System.out.println(Arrays.toString(nums));

            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!arr[r][c]){
            return;
        }
        path[r][c]=step;
        // funct call e je r,c path ma add kari tene false mark kari dyo so fari vakhat tyathi aagal na jai shaki
        arr[r][c]=false;
        if(r<arr.length-1){
            allPathsPrints(p+'D',arr, r+1,c, path,step+1);
        }
        if (c<arr[0].length-1){
            allPathsPrints(p+'R',arr,r,c+1, path,step+1);
        }
        if(r>0){ // top/uper jaishu
            allPathsPrints(p+'T',arr,r-1,c, path,step+1);
        }
        if(c>0){ // down or niche jaishu
            allPathsPrints(p+'L',arr,r,c-1, path,step+1);
        }
        // this line is where the functions will be over
        // so before the function gets removed, also remove the changes that were made by that function
        arr[r][c]=true;
        path[r][c]=0;
    }

    public static void main(String[] args){
        boolean[][] board= {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allPaths("",board,0,0);
        int[][] path=new int[board.length][board[0].length];
        allPathsPrints("",board,0,0,path,1);
    }
}
