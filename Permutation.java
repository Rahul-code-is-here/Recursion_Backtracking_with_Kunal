package Complete_Dsa.Recursion.Lec7_Subset;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Permutation {
    public static int permutationCount(String p, String up, int count){
        //base condtion
        if(up.isEmpty()){
         return count+1;
        }
        char ch=up.charAt(0);
        for (int i=0; i<=p.length();i++){
            String f=p.substring(0,i);  // i is exclusive
            String s=p.substring(i,p.length());
            count=permutationCount(f+ch+s,up.substring(1),count);
        }
        return count;
    }
    public static int permutationCount(String p, String up){
        //base condtion
        if(up.isEmpty()){
           return 1;
        }
        // nichenu je rite list return kare e rite aa count return kare
        char ch=up.charAt(0);
        int count=0;
        for (int i=0; i<=p.length();i++){
            String f=p.substring(0,i);  // i is exclusive
            String s=p.substring(i,p.length());
            count= count+ permutationCount(f+ch+s,up.substring(1));
        }
        // when function in over it should return all the answer that get from below
        // read below how list return same count return
        return count;
    }
    public static ArrayList<String> permutationList(String p, String up){
        //base condtion
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch=up.charAt(0);
        // local to this call, ans ma teni nichena badha call contain hashe like
        // for (ba/c) mate 3 recursion call, (ba,lenght=2+1) and
        // (ba/c) mate cba,bca,bac 3 ey and list ma add thai jashe
        // permutationList(f+ch+s,up.substring(1)) i==0 to p.length mate recursion  call thaya karshe jya sudhi up 0 na thai
        // and up 0 thashe etle e tyathi 3 words nu(like bca) list return karshe
        // have aa list return thashe. where? where it was called. suppose (ba/c) mate i==0 mate  permutationList(f+ch+s,up.substring(1))
        // "bca" list retun thayu to te ans mate add thai jashe.
        // have i==1 mate jyare up.length empty tahse tyare bca list return thashe ebe ans ma add thai jashe
        // have i==2 mate bac jyare up.length empty thashe tyare return thashe te be ans mate store thai jashe
        // have aa ans jema 3 ans che te kya return thase? wheere it was called. (a/bc) e
        // (a/bc) nu left recursion tena i==0 nu thai gayu (ba/c) valu and tene teno ans return karyo e (a/bc) potana local and ma add karshe
        // have (a/bc) nu i==1 mate (ab/c) mate recursion call tahse , te be i==0 to i==2 sudhi chalshe, and 3 recursion call karshe
        // darek call ma ek list return thashe je tena local ans ma jashe tyathi  (ab/c)  na local ans list ma add thai jashe\
        // have last ma ans return

        ArrayList<String> ans=new ArrayList<>();
        for (int i=0; i<=p.length();i++){
            String f=p.substring(0,i);  // i is exclusive
            String s=p.substring(i,p.length());
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    public static ArrayList<String> permutation(String p, String up, ArrayList<String> list){
        //base condtion
        if(up.isEmpty()){
            list.add(p);
            return list ;
        }
        char ch=up.charAt(0);
        for (int i=0; i<=p.length();i++){
            String f=p.substring(0,i);  // i is exclusive
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1),list);
        }
        return list;
    }
    public static void permutation(String p, String up){
        //base condtion
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        // aama total recursion call p(process) length +1 jetla thashe {refer kunal notes}
        // thst's why for loop o to <=p
        char ch=up.charAt(0);
        for (int i=0; i<=p.length();i++){
            String f=p.substring(0,i);  // i is exclusive
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));   // for this refer kunal note
        }
    }
    public static void main(String[] args){
//    permutation("","abc");
    ArrayList<String> list=new ArrayList<>();
//    System.out.println(permutation("","abc",list));
//        System.out.println(permutationList("","abc"));
//        System.out.println(permutationCount("","abcd"));
        int count=0;
//        AtomicInteger count = new AtomicInteger(0);
        System.out.println(permutationCount("","abcd",count));
    }
}
