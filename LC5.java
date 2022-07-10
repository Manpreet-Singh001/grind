public class LC5 {

    public static String longestPalindrome(String s) {
        int i, j;
        i = j = 0;

        for (int k = 0; k < s.length(); k++) {
            // odd
            int start = k - 1;
            int end = k + 1;
            while (start >= 0 && end < s.length() &&
                    s.charAt(start) == s.charAt(end)
            ) {
                if ((end - start) > j - i) {
                    i = start;
                    j = end;
                }
                start--;
                end++;
            }
            // even
            end = k + 1;
            start = k;
            while (start >= 0 && end < s.length() &&
                    s.charAt(start) == s.charAt(end)
            ) {
                if ((end - start) > j - i) {
                    i = start;
                    j = end;
                }
                start--;
                end++;
            }
        }
        return s.substring(i,j+1);

    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("baaba"));
    }
}
