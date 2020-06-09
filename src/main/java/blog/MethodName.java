package blog;

public class MethodName {
	public static void main(String[] args) {
		getMethodName();
	}
	
	private static void getMethodName() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}

//getMethodName
