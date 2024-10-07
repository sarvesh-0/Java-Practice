package extra;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
    	String st = "Sarvesh Shailesh Teware";
        String [] str = st.split(" ");
        
        Stack<String> s = new Stack<>();
        for(String a:str){
            s.push(a);
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
}
