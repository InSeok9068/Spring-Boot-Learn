package blog;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchFinally {
	public static void main(String[] args) {
//		FileOutputStream out = null;
//		try {
//			out = new FileOutputStream("test.txt"); 
//			// ����� ���� ���� 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace(); 
//		} finally {
//			if(out != null) {  
//				try { 
//					out.close(); //close �ϴٰ� ���ܰ� �߻��� �� �ִ�. 
//				} catch (IOException e) {
//					e.printStackTrace(); 
//				} 
//			} 
//		}
		
		try(FileOutputStream out = new FileOutputStream("test.txt")) {
			//����� ���� ���� 
		}catch(IOException e){
			e.printStackTrace(); 
		}
	
	}
}
