package ctci;

public class CTCI1_2 {
    public static String defanging(String s){
        StringBuilder solution = new StringBuilder();
        String [] digits = s.split("\\.");

        for(int i = 0; i<digits.length; i++){
            solution.append(digits[i]);
            if(i != digits.length -1) solution.append("[.]");
        }
        return solution.toString();
    }
}
