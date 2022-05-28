import java.sql.Array;
import java.util.*;

public class LetterCombs {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> output_arr = new LinkedList<>();
        if (digits.length() == 0) return output_arr;
        output_arr.add("");
        String[] char_map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
                "wxyz"
        };

        for(int i = 0; i<digits.length(); i++){
            // index has each characters digit value
            int index = Character.getNumericValue(digits.charAt(i));
            System.out.println(output_arr);

            while (output_arr.peek().length() == i){
                String permutation = output_arr.remove();
                for(char c: char_map[index].toCharArray()){
                    output_arr.add(permutation + c);
                }
            }

        }



        return output_arr;
    }

}
