import java.util.Arrays;

/**
 * 
 */

/**
 * @author Kyran
 */
public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0, result = 0;
        for (int h : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= h * 2) {
                i++;
            }
            result = Math.max(result, Math.abs(heaters[i] - h));
        }

        return result;
    }
}
