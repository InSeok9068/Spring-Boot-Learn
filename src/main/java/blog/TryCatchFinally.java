package blog;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinally {
	public static void main(String[] args) {
//		FileOutputStream out = null;
//		try {
//			out = new FileOutputStream("test.txt"); 
//			// 입출력 로직 구현 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace(); 
//		} finally {
//			if(out != null) {  
//				try { 
//					out.close(); //close 하다가 예외가 발생할 수 있다. 
//				} catch (IOException e) {
//					e.printStackTrace(); 
//				} 
//			} 
//		}
		
		try(FileOutputStream out = new FileOutputStream("test.txt")) {
			//입출력 로직 구현 
		}catch(IOException e){
			e.printStackTrace(); 
		}
	
	}
}
