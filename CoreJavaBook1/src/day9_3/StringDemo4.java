package day9_3;

public class StringDemo4
{
 public static void main(String[] args) 
 {
    String str="javavavavavava";
    String str2="va";
	 int count = 0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==('v')) {
			if(str.charAt(i+1)==('a')) {
				count ++;
			}
		}	
	}
	System.out.println("count = "+count);
	
	int cnt = 0;
	for(int i=0; i<str.length()-1; i++) {
		if(str.substring(i,i+2).equals(str2)) {
			cnt++;
		}
	}
	System.out.println("cnt = "+cnt);

 }
}
