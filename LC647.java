public class LC647 {
    public static int countSubstrings(String s) {
        int counter = 0;
        int left;
        int right;
        int i = 0;

        left = right = i;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            counter++;

        }

        left = i;
        right = i + 1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            counter++;
        }


        return counter;
    }


    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
}
