class MinStack {
 Stack<Integer> stack;
 ArrayList<Integer> minStack;
    public MinStack() {
       stack= new Stack();
       minStack=new ArrayList();
    }
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.get(minStack.size()-1)>=val){
            minStack.add(val);
        }
        else{
            int temp=minStack.get(minStack.size()-1);
            minStack.remove(minStack.size()-1);
            minStack.add(val);
            minStack.add(temp);
        }
    }

    public void pop() {
        minStack.remove(Integer.valueOf(stack.peek()));
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
