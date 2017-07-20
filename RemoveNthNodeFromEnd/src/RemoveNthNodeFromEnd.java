/**
 * 
 */

/**
 * @author Kyran
 */
public class RemoveNthNodeFromEnd {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n < 0) {
            return null;
        }

        ListNode result = new ListNode(0);
        result.next = head;
        int length = 0;
        ListNode cur = head;

        while (cur != null) {
            length++;
            cur = cur.next;
        }

        length -= n;
        cur = result;

        while (length > 0) {
            length--;
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return result.next;
    }
}
