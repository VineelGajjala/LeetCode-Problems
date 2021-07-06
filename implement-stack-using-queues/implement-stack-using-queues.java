class MyStack {
    private Queue<Integer> stack;
    private Queue<Integer> temp;
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {
        stack = new LinkedList<>();
        temp = new LinkedList<>();
        top = -1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
        top = x;
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (stack.size() > 1) {
            top = stack.remove();
            temp.add(top);
        }
        int toReturn = stack.remove();
        Queue<Integer> empty = stack;
        stack = temp;
        temp = empty;
        
        
        return toReturn;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (stack.size() == 0);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */