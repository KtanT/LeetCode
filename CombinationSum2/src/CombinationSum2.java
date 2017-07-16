import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates.length == 0 || candidates == null) {
            return result;
        }
        Arrays.sort(candidates);
        List<Integer> combine = new ArrayList<Integer>();

        combine(candidates, target, combine, result, 0);

        return result;
    }

    private void combine(int[] candidates, int target, List<Integer> combine, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(combine));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            combine.add(candidates[i]);
            combine(candidates, target - candidates[i], combine, result, i + 1);
            combine.remove(combine.size() - 1);
        }
    }
}
