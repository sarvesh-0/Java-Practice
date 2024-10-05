package lab21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("D:\\SEED\\Java Practice\\CoreJavaBook1\\src\\day10_1\\f1.txt");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			finally {
			try {
				f.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
