package Stack;

public class Stack {
	private int top;
	private int maxSize;
	private char[] stackArray;
	
	public Stack() {
		this.top = -1;
		this.stackArray = new char [maxSize];
		this.maxSize = maxSize;
		
	}
	
	public boolean isEmpty(){
		return(top==-1) ;
	}
	public boolean isFull() {
		return(top==(maxSize -1));
	}
	
    //push method
	public void push (char ch) {
		if(!isFull()) {
			stackArray[++top]=ch;
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	
	//pop method
	public char pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		}
		else {
			System.out.println("Stack is Empty");
		}
		return 0;
	}
	
	//peek method
	public char peek() {
		if(!isEmpty()) {
			return stackArray[top];
		}
		else {
			System.out.println("Stack is empty");
		}
		return 0;
	}

}
