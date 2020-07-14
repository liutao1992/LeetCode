import java.util.EmptyStackException;
import java.util.Stack;

class MinStack {

    private Stack<Integer> dateStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        dateStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        dateStack.push(x);
        // push 操作时,要保证minStack的栈顶元素为当前最小值
        if (minStack.empty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int x = dateStack.pop();
        if (x == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return dateStack.peek();
    }

    public int getMin() {
        if (!minStack.empty())
            return minStack.peek();
        throw new EmptyStackException();
    }

    public static void main(String[] args) {
        // ["MinStack","push","push","push","getMin","pop","getMin"]
        // [[],[0],[1],[0],[],[],[]]
        MinStack minStack = new MinStack();

        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}



/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */