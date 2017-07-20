import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Kyran
 */
public class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.trim().length() == 0) {
            return result;
        }

        result.add("");
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));

            while (result.get(0).length() == i) {
                String rm = result.remove(0);

                for (char c : mapping[x].toCharArray()) {
                    result.add(rm + c);
                }
            }
        }

        return result;
    }
}
