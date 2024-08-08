package Complete_Dsa.Recursion.Lec9_Google_Questions;
import java.lang.reflect.Array;
import java.util.*;
public class Google {

    public static List<String> letterCombinations(String digits) {
     return pad1("",digits);
    }
    public static ArrayList<String> pad1(String p, String up){
        //base condtion
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();
        int digit= up.charAt(0)-'0'; // this will convert '2' into 2

        int start= (digit-2)*3;
        int end= start+3;
        if(digit==7 || digit==9){
            end++;
        }

        for (int i=start; i<end; i++){
            char ch= (char) ('a'+i);
            ans.addAll(pad1(ch+p,up.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args){
      System.out.println(letterCombinations("12"));
    }
}
