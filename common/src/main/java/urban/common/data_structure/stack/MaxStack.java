package urban.common.data_structure.stack;

import java.util.Stack;

/**
 * Built-in Stack class to implement a new class MaxStack with a function getMax() that returns the largest element in the stack. getMax() should not remove the item.
 * <p>
 * We define two new stacks within our MaxStack class—stack holds all of our integers, and maxesStack holds our "maxima." We use maxesStack to keep our max up to date in constant time as we push() and pop()
 * <p>
 * Complexity: O(1) time for push(), pop(), and getMax(). O(m) additional space, where mm is the number of operations performed on the stack
 */
public class MaxStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxesStack = new Stack<>();

    // Add a new item to the top of our stack. If the item is greater
    // than or equal to the last item in maxesStack, it's
    // the new max! So we'll add it to maxesStack.
    public void push(int item) {
        stack.push(item);
        if (maxesStack.empty() || item >= maxesStack.peek()) {
            maxesStack.push(item);
        }
    }

    // Remove and return the top item from our stack. If it equals
    // the top item in maxesStack, they must have been pushed in together.
    // So we'll pop it out of maxesStack too.
    public int pop() {
        int item = stack.pop();
        if (item == maxesStack.peek()) {
            maxesStack.pop();
        }
        return item;
    }

    // The last item in maxesStack is the max item in our stack.
    public int getMax() {
        return maxesStack.peek();
    }
}