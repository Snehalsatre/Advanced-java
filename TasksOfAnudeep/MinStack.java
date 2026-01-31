package TasksOfAnudeep;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    
    public void push(int x) {
        mainStack.push(x);
        
       
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        } else {
           
            minStack.push(minStack.peek());
        }
    }

   
    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        }
    }

   
    public int top() {
        return mainStack.peek();
    }

   
    public int getMin() {
        return minStack.peek();
    }

  
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(15);
        s.push(10);
        s.push(20);
        
        System.out.println("Minimum: " + s.getMin()); 
        
        s.push(5);
        System.out.println("Minimum after pushing 5: " + s.getMin()); 
        
        s.pop();
        System.out.println("Minimum after popping 5: " + s.getMin());
    }
}