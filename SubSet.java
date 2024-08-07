package Complete_Dsa.Recursion.Lec7_Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static List<List<Integer>> subsetSort(int arr[]){
        Arrays.sort(arr);// sort arrma j kam karshe
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>()); //empty add karyu
        int start=0;
        int end=0;
        for (int i=0; i<arr.length; i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for (int j=start; j<n; j++){
                // duplicate aave mano ke 1,2,2 then first [] pachi [],[1] then [],[1], [2],[1,2]
                // have 2 aavshe to te alredy [], [1] ma add tahine [2],[1,2] bani jgayo che etle tema add karvani jarur nathi
                // karishu to [],[1],[2],[1,2], [2],[1,2],[2,2],[1,2,2] so [2],[1,2] repeat thashe
                // tene rokva jo curr element aaglna sathe match thai to [],[1] ma add karvani jarur nathi. only [2],[1,2], ma j add karvanu, start and end point lai achive kari shakai
                List<Integer> internalList=new ArrayList<>(outer.get(j));
                internalList.add(arr[i]);  // num ni jgyae arr[i]
                outer.add(internalList);
            }
        }
        return outer;
    }
    public static List<List<Integer>> subset(int arr[]){
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>()); //empty add karyu
        for (int num:arr){
            int n=outer.size(); // kunal ni ppt note refer karo, jetla element outer ma hashe etli new list banavi padashe
            // like [] and [1] che and 2 number aavyo to final ans: [] [1] [2] [1,2]. so outer ni size 2 hati and 2 list extra add karvi padi, and
            // te 2 or n number ne origanla list ma add be karvana
            for (int i=0; i<n; i++){
                List<Integer> internalList=new ArrayList<>(outer.get(i));
                internalList.add(num);
                outer.add(internalList);
            }
        }
        return outer;
    }
    public static void main(String[] args){
      int[] arr={1,2,3};
      List<List<Integer>> ans=subsetSort(arr);
      for (List<Integer> list : ans){
          System.out.println(list);
        }
    }
}
// time complexity O(n*2^n)  , darek level e list ni sankhya double thai che so total subset 2^n and total level 2^n
// space complexity: O(n*2^n) , total 2^n subset and each subset take O(n) space
