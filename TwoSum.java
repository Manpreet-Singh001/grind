import java.util.HashMap;
public class TwoSum {
        public static int[] find(int[] nums, int target){
        HashMap<Integer, Integer> foundAt = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            foundAt.put(nums[i], i);
        }
        int required[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(foundAt.get(difference) != null && foundAt.get(difference) != i){
                required[0] = i;
                required[1] = foundAt.get(difference);
                break;
            }
        }
        return required;
    }
}
