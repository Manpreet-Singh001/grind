package ctci;

import java.util.HashMap;

public class Ctci1_1 {
    public static boolean isUnique(String s){
        HashMap<Character,Boolean> characterVisited = new HashMap<Character, Boolean>();
        boolean unique = true;
        for(int i = 0; i<s.length(); i++){
            if(characterVisited.containsKey(s.charAt(i))){
                unique = false;
                break;
            }else{
                characterVisited.put(s.charAt(i),true);
            }
        }
        return unique;
    }
}
