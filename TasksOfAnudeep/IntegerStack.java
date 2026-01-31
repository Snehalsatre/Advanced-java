package TasksOfAnudeep;
public class IntegerStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public IntegerStack(int size) {
        this.capacity = size;
        this.stackArray = new int[capacity];
        this.top = -1; 
    }

  
    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push " + item);
            return;
        }
        stackArray[++top] = item;
    }

    
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop");
            return null;
        }
        return stackArray[top--];
    }

   
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty: Cannot peek");
            return null;
        }
        return stackArray[top];
    }

   
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element (peek): " + myStack.peek());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Is stack empty? " + myStack.isEmpty());
    }
}