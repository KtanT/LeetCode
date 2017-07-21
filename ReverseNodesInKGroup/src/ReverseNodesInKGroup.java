/**
 * 
 */

/**
 * @author Kyran
 */
public class ReverseNodesInKGroup {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode cur = head;
        int count = 0;
        while (cur != null && count != k) {
            count++;
            cur = cur.next;
        }

        if (count == k) {
            cur = reverseKGroup(cur, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = cur;
                cur = head;
                head = temp;
            }
            head = cur;
        }

        return head;
    }
}
