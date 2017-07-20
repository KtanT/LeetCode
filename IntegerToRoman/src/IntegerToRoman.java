/**
 * 
 */

/**
 * @author Kyran
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        if (num <= 0) {
            return "";
        }

        int[] options = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();
        int index = 0;

        while (num > 0) {
            int times = num / options[index];
            num = num - options[index] * times;

            for (; times > 0; times--) {
                sb.append(romans[index]);
            }

            index++;
        }

        return sb.toString();
    }
}
