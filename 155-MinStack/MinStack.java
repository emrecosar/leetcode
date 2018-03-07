public class MinStack {

    Stack<Long> stack;
    long minimum;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Long>();
        minimum = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.push((long)x-minimum);
        minimum = Math.min(x,minimum);
    }

    public void pop() {
        minimum = Math.max(minimum - stack.pop(), minimum);
    }

    public int top() {
        return (int)Math.max(minimum + stack.peek(), minimum);
    }

    public int getMin() {
        return (int)minimum;
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