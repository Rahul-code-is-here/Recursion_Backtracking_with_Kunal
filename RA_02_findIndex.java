package Recursion_In_Java.Array;

import java.util.ArrayList;

public class RA_02_findIndex {
    public static boolean find(int arr[],int target, int index){
        //base condtion
        if(index==arr.length){// last element be check karvano hovathi arr.length
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    public static int findIndex(int arr[], int target, int index){
        //base condition
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return findIndex(arr,target,index+1);
        }
    }
    public static int findIndexFromLast(int arr[], int target, int index){
        //base condition
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else {
            return findIndexFromLast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list =new ArrayList<>();
    public static void findAllIndex(int arr[], int target, int index){
        //base condition
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    public static ArrayList<Integer> findallIndex(int arr[], int target, int index,ArrayList<Integer> list){
        //base condition
        // diiffrent func call ma value add thashe te main list ma j add thashe
        // ahi arraylist rakhvathi every func call vakhate new arraylist banashe. diff object dor diffrent func call
        // list.add karishu etle te function call purtu j reshe baki koine khabar nai pade 3 te list ma add tahyu
        //chelle empty list return thashe and te uper jati reshe and last ans empty list aavshe
        // thethi last ma jya return karavta ta tya ek arraylist object banavi nichethi uper aavta ans ne store karta javana
        // like empty list nichethi main func call taraf jai che and vCHHE tene list.add(3) and list.add(4) male che
        // to 3 and 4 te object ma store thai jashe nd uper jata raheshe
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findallIndex(arr,4,index+1,list); // list  e same name but diff refrence variable
        // badha refrence variable same object ne j point kare che
    }
    public static ArrayList<Integer> findallIndex(int arr[], int target, int index){
        ArrayList<Integer> list= new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        // this  will contains answer for that func call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findallIndex(arr,4,index+1,list);
        list.addAll(ansFromBelowCalls);
        return list;

    }

    public static void main(String[] args){
      int arr[]={2,3,1,4,4,5};
//      System.out.println(find(arr,4,0));
//      System.out.println(findIndex(arr,4,0));
//      System.out.println(findIndexFromLast(arr,4,arr.length-1));
//      findAllIndex(arr,4,0);
//      System.out.println(list);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans= findallIndex(arr,4,0,new ArrayList<>()); //new kwyword vagar error aavshe
        System.out.println(ans);
//      new Arraylist<>() ni jgyae list pan chale. banne same j che initialize alag rite karelu che
//        System.out.println(list);
    }
}
