package Complete_Dsa.Recursion.Lec9_Google_Questions;
import java.util.*;
public class GoogleUsingMapping {

//  Time Complexity:  ( k^n ), where ( k ) is the average number of letters each digit maps to, and ( n ) is the number of digits.
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return pad1("", digits);
    }

    public static ArrayList<String> pad1(String p, String up) {
        // Base condition: if the input string is empty, return the current combination
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Mapping digits to letters
        String[] mapping = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        // Convert the current digit to an integer
        int digit = up.charAt(0) - '0';

        // Initialize a list to store the combinations for the current function call
        ArrayList<String> ans = new ArrayList<>();

        // Get the corresponding letters for the current digit
        String letters = mapping[digit];

        // Loop through the letters and make recursive calls
        for (char ch : letters.toCharArray()) {
            ans.addAll(pad1(p + ch, up.substring(1)));
        }

        // Return the list of combinations
        return ans;
    }
    public static void main(String[] args){
        System.out.println(letterCombinations("12"));
    }
}
