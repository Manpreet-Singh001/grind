import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC241 {

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> solution = new ArrayList<>();
        return solution;
    }

    public static void backtrack(String s) {
        if (stringToArray(s).length == 1) {
            return;
        }

        for(int i = 1; i<s.length() - 1; i = i + 2){
            String [] current = stringToArray(s);
            String afterOperation = performOperation(current[i-1],current[i+1],current[i]);
            String newString = afterOperation +
        }


    }

    public static String performOperation(String s1, String s2, String operator) {
        String solution = "";
        int i = Integer.parseInt(s1);
        int j = Integer.parseInt(s2);
        if (operator.equals("*")) {
            solution = Integer.toString(i * j);
        }
        if (operator.equals("-")) {
            solution = Integer.toString(i - j);
        }
        if (operator.equals("+")) {
            solution = Integer.toString(i + j);
        }
        return solution;
    }

    public static String[] stringToArray(String s) {
        String[] reqArray = s.split("((?=[-+*])|(?<=[-+*]))");
        return reqArray;
    }

    public static String arrayToString(String[] s){
        String solution = "";
        for(String s1: s){
            solution += s1;
        }
        return solution;
    }


}
