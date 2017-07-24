import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        if (n <= 0) {
            return result;
        }

        backtrack(result, "", 0, 0, n);

        return result;
    }

    private void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, str + ")", open, close + 1, max);
        }
    }
}
