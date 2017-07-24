/**
 * 
 */

/**
 * @author Kyran
 */
public class CountPrime {
    public int countPrimes(int n) {
        boolean[] result = new boolean[n]; // result: not prime
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (result[i] == true) {
                continue;
            } else {
                count++;
                for (int j = 2; i * j < n; j++) {
                    result[i * j] = true;
                }
            }
        }

        return count;
    }
}
