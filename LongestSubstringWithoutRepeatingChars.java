import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static int find(String s) {
        int start,end,i;
        start = end = i = 0;
        int longestSoFar = 0;

        HashMap<Character,Integer> containsChar = new HashMap<>();

        while (i<s.length()){
            printWindow(s,i,i);
            char c = s.charAt(i);
            if(containsChar.containsKey(c)){
                start = containsChar.get(c) + 1;
                end = i;
                containsChar.clear();
                containsChar.put(c,i);
            }else{
                containsChar.put(c,i);
                end = i;
            }
            if((end - start + 1) >longestSoFar){
                longestSoFar = end - start + 1;
            }
            i++;
            System.out.println(containsChar);
            printWindow(s,start,end);
            System.out.println("---------------------------");
        }

        return longestSoFar;
    }

    public static void printWindow(String s, int start, int end) {
        System.out.println(s);
        boolean started = false;
        for (int i = 0; i <= end; i++) {
            if (started || i == start) {
                started = true;
                System.out.print("_");
            } else if (i == end) {
                started = false;
            } else {
                System.out.print(" ");
            }
        }
       System.out.print("\n");
    }
}
