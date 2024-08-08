package Complete_Dsa.Recursion.Lec9_Google_Questions;

import java.util.ArrayList;
import java.util.List;

public class AmazonDiceProblem {
    public static List<String> diceFace(String p, int target,int face){
        //base condtion
        if(target==0){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<>();
        for (int i=1; i<=face && i<=target; i++){
            ans.addAll(diceFace(p+i,target-i,face));
        }
        return ans;
    }
    public static void diceFACE(String p, int target,int face){
        //base condtion
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1; i<=face && i<=target; i++){
            diceFACE(p+i,target-i,face);
        }
    }
    public static List<String> dice1(String p, int target){
        //base condtion
        if(target==0){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<>();
        for (int i=1; i<=6 && i<=target; i++){
           ans.addAll(dice1(p+i,target-i));
        }
        return ans;
    }
    public static void dice(String p, int target){
        //base condtion
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1; i<=6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }
    public static void main(String[] args){
//     dice("",4);
     System.out.println(dice1("",4));
    }
}
