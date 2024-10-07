package stack;

public class Stack {
	
	public static int top;
	public static int [] arr;
	
	public Stack() {
		top = -1;
		arr = new int[5];
	}
	
	public Stack(int num) {
		top = -1;
		arr = new int[num];
	}
	
	public void push(int no) {
		if(top==arr.length-1) {
			System.out.println("Stack is full !");
		}
		else {
			arr[++top] = no;
			System.out.println(no+" Inserted !");
		}
		
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is Empty !");
			return 999;
		}
		else {
			int no =arr[top--];
			System.out.println(no+" Removed !");
			return no;
		}
	}
	
	public int peek() {
		return arr[top];
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(6);
		s.push(2);
		s.push(8);
		s.push(4);
		s.push(3);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}
}
