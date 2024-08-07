package Complete_Dsa.Recursion.Lec7_Subset;

import java.util.ArrayList;

public class SubSeq {
    public static ArrayList<String> subseqRetAscii(String p, String up){ // p==process and up=unprocessed
        //base condition
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        // these are the answer from below call
        ArrayList<String> first= subseqRetAscii(p+ch,up.substring(1));
        ArrayList<String> second= subseqRetAscii(p,up.substring(1));
        ArrayList<String> third= subseqRetAscii(p+(ch+0),up.substring(1));
        // substring and p+ch thi new object create thai che
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    public static void subseqAscii(String p, String up){ // p==process and up=unprocessed
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1)); // Aasci value be print karo
    }
    public static ArrayList<String> subseqRet(String p, String up){ // p==process and up=unprocessed
        //base condition
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        // these are the answer from below call
        ArrayList<String> right= subseqRet(p+ch,up.substring(1));
        ArrayList<String> left= subseqRet(p,up.substring(1));
         // substring and p+ch thi new object create thai che
        left.addAll(right);
        return left;
    }
    public static ArrayList<String> subseq(String p, String up,ArrayList<String> list){ // p==process and up=unprocessed
        //base condition
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
         subseq(p,up.substring(1),list);
         subseq(p+ch,up.substring(1),list);  // substring and p+ch thi new object create thai che
         return list;
    }
    public static void subseq(String p, String up){ // p==process and up=unprocessed
       //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
//     subseq("","abc",list);
//     System.out.println(subseqRet("","abc"));
//        subseqAscii("","abc");
        System.out.println(subseqRetAscii("","abc"));
    }
}
