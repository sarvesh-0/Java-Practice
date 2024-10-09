package GenStack;

public class Stack <T>{
	T arr[];
	static int top;
	public Stack() {
		top = -1;
		arr = (T[]) new Object[5];
	}
	
	public Stack(int no) {
		top = -1;
		arr = (T[]) new Object[no];
	}
	
	public void push(T val) {
		arr[++top] = val;
		System.out.println(val+" Pushed");
	}
	
	public T pop() {
		T r = arr[top--];
		System.out.println(r+" Poped ...");
		return r;
	}
	
	public T peek() {
		return arr[top];
	}
	
	public static void main(String[] args) {
		Stack <Integer> s = new Stack<>(4);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.pop();
		s.pop();
		
		Stack <String> str = new Stack<>(4);
		str.push("Sarvesh");
		str.push("Tejas");
		str.push("Aditya");
		
		str.pop();
	}
}
