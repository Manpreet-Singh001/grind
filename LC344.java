public class LC344 {
     public static void reverseString(char[] s) {
        for(int i = 0; i<s.length/2; i++){
            char temp = s[s.length - 1 - i];
            s[s.length -1 - i] = s[i];
            s[i] = temp;
        }
        for(char c: s){
            System.out.println(c);
        }
    }

}
