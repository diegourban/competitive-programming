package urban.common.data_structure.queue;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Queue with 2 stacks implementation.
 * <p>
 * Solution:
 * For enqueue, we simply push the enqueued item onto inStack.
 * For dequeue on an empty outStack, the oldest item is at the bottom of inStack. So we dig to the bottom of inStack by pushing each item one-by-one onto outStack until we reach the bottom item, which we return.
 * After moving everything from inStack to outStack, the item that was enqueued the 2nd longest ago (after the item we just returned) is at the top of outStack, the item enqueued 3rd longest ago is just below it, etc. So to dequeue on a non-empty outStack, we simply return the top item from outStack.
 * <p>
 * Complexity: Each enqueue is O(1) time, and so is each dequeue when outStack has items. Dequeue on an empty outStack is order of the number of items in inStack at that moment, which can vary significantly
 */
public class QueueTwoStacks {

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public void enqueue(int item) {
        inStack.push(item);
    }

    public int dequeue() {
        if (outStack.empty()) {

            // Move items from inStack to outStack, reversing order
            while (!inStack.empty()) {
                int newestInStackItem = inStack.peek();
                outStack.push(newestInStackItem);
                inStack.pop();
            }

            // If outStack is still empty, raise an error
            if (outStack.empty()) {
                throw new NoSuchElementException("Can't dequeue from empty queue!");
            }
        }
        return outStack.pop();
    }
}
