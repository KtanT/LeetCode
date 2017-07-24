import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author Kyran
 */
public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        if (head == null) {
            return false;
        }

        while (head != null) {
            if (nodes.contains(head)) {
                return true;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }

        return false;
    }
}
