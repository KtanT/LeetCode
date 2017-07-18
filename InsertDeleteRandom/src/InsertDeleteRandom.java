import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 */

/**
 * @author Kyran
 */
public class InsertDeleteRandom {
    List<Integer> numList;
    Map<Integer, Integer> numMap;
    Random random = new Random();

    /**
     * Initialize your data structure here.
     */
    public InsertDeleteRandom() {
        numList = new ArrayList<Integer>();
        numMap = new HashMap<Integer, Integer>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already
     * contain the specified element.
     *
     * @param val
     *            value to be inserted
     * @return true if not consisted before insertion, false otherwise
     */
    public boolean insert(int val) {
        boolean contain = numMap.containsKey(val);
        if (contain) {
            return false;
        }

        numMap.put(val, numList.size());
        numList.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the
     * specified element.
     *
     * @param val
     *            value to be deleted
     * @return true if deletion is complete, false otherwise
     */
    public boolean remove(int val) {
        boolean contain = numMap.containsKey(val);
        if (!contain) {
            return false;
        }

        int index = numMap.get(val);
        if (index < numList.size() - 1) {
            int last = numList.get(numList.size() - 1);
            numList.set(index, last);
            numMap.put(last, index);
        }

        numMap.remove(val);
        numList.remove(numList.size() - 1);

        return true;
    }

    /**
     * Get a random element from the set.
     *
     * @return the next random number in the list
     */
    public int getRandom() {
        return numList.get(random.nextInt(numList.size()));
    }
}
