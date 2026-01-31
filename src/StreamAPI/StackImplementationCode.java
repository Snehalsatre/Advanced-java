package StreamAPI;

import java.util.ArrayList;

public class StackImplementationCode{
	
	ArrayList<Integer> arrayObj = new ArrayList<>();
	
	public void push(int val) {
		arrayObj.add(val);
	}
	
	public int pop() {
		if(arrayObj.isEmpty()) {
			return -1;
		}
		return arrayObj.remove(arrayObj.size()-1);
	}
	
	public int peek() {
		if(arrayObj.isEmpty()) {
			return -1;
		}
		return arrayObj.get(arrayObj.size()-1);
	}
	
	public boolean isEmpty() {
		return arrayObj.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImplementationCode strObj = new StackImplementationCode();
		strObj.push(24);
		strObj.push(53);
		strObj.push(67);
		strObj.push(44);
		System.out.println("Stack elements: ");
		
		System.out.println("Top: " + strObj.peek()); 
        System.out.println("Removed: " + strObj.pop());
	
	}

}
