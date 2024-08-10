package Complete_Dsa.Recursion.Lec10_backtracking;

import java.util.ArrayList;

public class maze {
    public static int count(int r, int c){
        // base condtion
        if (r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right =count(r,c-1);
        return left+right;
    }
    public static void path(String p, int r, int c){
        // base condition
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if (c>1){
            path(p+'R',r,c-1);
        }
    }
    public static ArrayList<String> pathRet(String p, int r, int c){
        // base condition
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        // local list
        ArrayList<String> ans= new ArrayList<>();
        // nichena func call thi je list return thaine aavi tene local ans list ma store kari and uper return karavi didhi
        // where it will rerurn where it was called
        if(r>1){
           ans.addAll(pathRet(p+'D',r-1,c));
        }
        if (c>1){
           ans.addAll(pathRet(p+'R',r,c-1));
        }
        return ans;
    }
    public static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        // base condition
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        // local list
        ArrayList<String> ans= new ArrayList<>();
        // nichena func call thi je list return thaine aavi tene local ans list ma store kari and uper return karavi didhi
        // where it will rerurn where it was called
        if(r>1){
            ans.addAll(pathRetDiagonal(p+'V',r-1,c));
        }
        if(r>1 && c>1){
            ans.addAll(pathRetDiagonal(p+'D',r-1,c-1));
        }
        if (c>1){
            ans.addAll(pathRetDiagonal(p+'H',r,c-1));
        }
        return ans;
    }

    public static void pathRestriction(String p,boolean[][] arr, int r, int c){
        // base condition, jya false hoi tyathi nai chali shako evo rasto
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }
        if(r<arr.length-1){
            pathRestriction(p+'D',arr, r+1,c);
        }
        if (c<arr[0].length-1){
            pathRestriction(p+'R',arr,r,c+1);
        }
    }
    public static void main(String[] args){
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathRet("",3,3));
//        System.out.println(pathRetDiagonal("",3,3));
        boolean[][] board= {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestriction("",board,0,0);
    }
}
