import java.util.HashMap;
import java.util.Stack;

public class LC20 {
    public static boolean isValid(String s){
        Stack<Character> myStack = new Stack<Character>();
        HashMap<Character,Character> pairs = new HashMap<>();
        pairs.put('(',')');
        pairs.put('{','}');
        pairs.put('[',']');
        boolean valid = true;
        for(char c: s.toCharArray()){
            if(pairs.containsKey(c)){
                myStack.push(c);
            }else{
                // pop stack = get the opening bracket
                // if the current c ==
                if(myStack.empty() || c != pairs.get(myStack.pop())){
                    valid = false;
                    break;
                }
            }
        }
        if(valid && !myStack.empty()){
            valid = false;
        }
        return valid;
    }
}
