/**
 * 
 */

/**
 * @author Kyran
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pNode = l1, qNode = l2, cur = new ListNode(0);
        ListNode result = cur;

        while (pNode != null && qNode != null) {
            if (pNode.val > qNode.val) {
                cur.next = qNode;
                qNode = qNode.next;
            } else {
                cur.next = pNode;
                pNode = pNode.next;
            }
            cur = cur.next;
        }

        if (pNode != null) {
            cur.next = pNode;
        }
        if (qNode != null) {
            cur.next = qNode;
        }
        return result.next;
    }
}
