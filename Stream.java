package Complete_Dsa.Recursion.Lec7_Subset;

public class Stream {
    // onlly skipp app when it's not an apple
    public static String skipapp(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipapp(up.substring(3));
        }else {
            return up.charAt(0)+ skipapp(up.substring(1));
        }
    }
    public static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipapple(up.substring(5));
        }else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
    public static String skipa(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        if (ch=='a'){
          return skipa(up.substring(1));
        }else {
            return ch+skipa(up.substring(1));
        }
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }
    public static void main(String[] args){
       skip("","baccdah");
       System.out.println(skipa("baccdah"));
       System.out.println(skipapple("baccapple"));
       System.out.println(skipapp("bachhappkapple"));
    }
}
