package Complete_Dsa.Recursion.Lec9_Google_Questions;

import java.util.ArrayList;

public class PhonePad {
    public static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit= up.charAt(0)-'0';
        int count=0;
        for (int i=(digit-1)*3; i<digit*3; i++){
            char ch= (char) ('a'+i);
         count=count+ padCount(p+ch, up.substring(1));
        }
        return count;
    }
    public static ArrayList<String> pad1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0'; // this will convert '2' into 2
        //local list, particular func call na ans contains karshe like
        // i=0 mate ad,ae,af list ma add thai jashe and last ma te local list ne return karavo
        ArrayList<String> ans=new ArrayList<>();
        for (int i=(digit-1)*3; i<digit*3; i++){
            char ch= (char) ('a'+i);
           ans.addAll(pad1(p+ch, up.substring(1)));
        }
     return ans;
    }
    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0)-'0'; // this will convert '2' into 2
        for (int i=(digit-1)*3; i<digit*3; i++){
           char ch= (char) ('a'+i);
           pad(p+ch, up.substring(1));
        }
    }

    public static void main(String[] args){
//        int digit= '2'- '0';
//        System.out.println(digit);
//        pad("","12");
        System.out.println(pad1("","12").size());
        System.out.println(padCount("","12"));
    }
}
