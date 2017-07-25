import java.util.Stack;

/**
 * 
 */

/**
 * @author Kyran
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public ImplementQueueUsingStacks() {
        this.stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.remove(0);
    }

    /** Get the front element. */
    public int peek() {
        return stack.firstElement();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
