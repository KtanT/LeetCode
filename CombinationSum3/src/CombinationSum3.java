import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (k < 1 || n < 1) {
            return result;
        }

        List<Integer> subset = new ArrayList<>();
        combine(result, subset, k, n, 1);

        return result;
    }

    private void combine(List<List<Integer>> result, List<Integer> subset, int k, int n, int index) {
        if (subset.size() == k && n == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }

        for (int i = index; i <= 9; i++) {
            subset.add(i);
            combine(result, subset, k, n - i, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
