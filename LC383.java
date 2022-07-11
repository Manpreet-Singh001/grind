import java.util.HashMap;

public class LC383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] counter = new int['z'-'a' + 1];

        for(int i = 0; i<ransomNote.length(); i++){
            counter[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i<magazine.length(); i++){
            counter[magazine.charAt(i) - 'a']--;
        }

        for(int i = 0; i<counter.length; i++){
            if(counter[i] > 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String [] args){
        String r = "aa";
        String m = "aab";

        System.out.println(canConstruct(r,m));
    }
}
