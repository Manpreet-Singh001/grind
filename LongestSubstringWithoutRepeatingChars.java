import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {
    public static int find(String s){
        HashSet<Character> containsString = new HashSet<>();
        int longestSoFar = 0;
        int currentLongest = 0;
        for(int i = 0; i<s.length(); i++){
            if(containsString.contains(s.charAt(i))){
                if(currentLongest > longestSoFar){
                    longestSoFar = currentLongest;
                }
                currentLongest = 1;
                containsString.clear();
                containsString.add(s.charAt(i));
            }else{
                containsString.add(s.charAt(i));
                currentLongest++;
            }
            System.out.println(s.charAt(i));
            System.out.println("Longest so far: " + longestSoFar + " \nCurrent Longest: "+ currentLongest);
        }
        if(currentLongest>longestSoFar){
            longestSoFar = currentLongest;
        }
        return longestSoFar;
    }
}
