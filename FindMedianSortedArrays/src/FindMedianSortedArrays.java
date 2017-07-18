import java.util.Arrays;

/**
 * 
 */

/**
 * @author Kyran
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merge = new int[m + n];

        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }
        int len = m;
        for (int i = 0; i < n; i++) {
            merge[len++] = nums2[i];
        }

        Arrays.sort(merge);
        int med;

        if ((m + n) % 2 == 1) {
            med = (m + n) / 2;
            return merge[med];
        } else {
            med = (m + n) / 2;
            return (double) (merge[med - 1] + merge[med]) / 2;
        }
    }
}
