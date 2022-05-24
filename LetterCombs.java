import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombs {


    public static HashMap<String, String> getDigitMapping() {
        HashMap<String, String> digitMapping = new HashMap<String, String>();
        digitMapping.put("1", "abc");
        digitMapping.put("2", "def");
        digitMapping.put("3", "ghi");
        digitMapping.put("4", "jkl");
        digitMapping.put("5", "mno");
        digitMapping.put("6", "pqrs");
        digitMapping.put("7", "tuv");
        digitMapping.put("8", "wxyz");
        return digitMapping;
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<String,String> digitMapping = getDigitMapping();
        List<String> output = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        // put all the chars the digits can produce in temp
        for(char c: digits.toCharArray()){
            if(digitMapping.get(c) != null){
                temp.add(digitMapping.get(c));
            }
        }

        for(int i = 0; i<temp.size(); i++){
            for(int j = 0; j<temp.get(i).length(); j++){

            }
        }

        String[] haha = {"2", "3"};
        return output;
    }

}
