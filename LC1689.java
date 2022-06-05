public class LC1689 {
    public static int minPartitions(String n){
        char [] digits = n.toCharArray();
        int max = 0;
        for(char c: digits){
            if(Character.getNumericValue(c) > max){
                max = Character.getNumericValue(c);
            }
        }
        return max;
    }
}
