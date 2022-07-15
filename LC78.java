import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class LC78 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        backtrack(sol, nums, 1, new ArrayList<Integer>(), 0);
        return sol;
    }

    public static void backtrack(List<List<Integer>> sol, int[] arr, int lvl, List<Integer> currentSol, int parentIndex) {

        if (currentSol.size() + 1  == lvl) {
            sol.add(new ArrayList<>(currentSol));
        }

        for (int i = parentIndex; i < arr.length; i++) {

            currentSol.add(arr[i]);
            backtrack(sol, arr, lvl + 1, currentSol, i + 1);
            currentSol.remove(currentSol.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        List<List<Integer>> sol = subsets(nums);
        for (int i = 0; i < sol.size(); i++) {
            for (int j = 0; j < sol.get(i).size(); j++) {
                System.out.print(sol.get(i).get(j) + ",");
            }
            System.out.print("\n");
        }
    }

}
