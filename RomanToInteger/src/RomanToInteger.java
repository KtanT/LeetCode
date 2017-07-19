
/**
 * 
 */

/**
 * @author Kyran
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0, length = s.length();
        if (s == null || length == 0) {
            return 0;
        }

        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
            case 'M':
                nums[i] = 1000;
                break;
            case 'D':
                nums[i] = 500;
                break;
            case 'C':
                nums[i] = 100;
                break;
            case 'L':
                nums[i] = 50;
                break;
            case 'X':
                nums[i] = 10;
                break;
            case 'V':
                nums[i] = 5;
                break;
            case 'I':
                nums[i] = 1;
                break;
            }
        }

        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                result = result - nums[i - 1];
            } else {
                result = result + nums[i - 1];
            }
        }

        return result + nums[length - 1];
    }
}
