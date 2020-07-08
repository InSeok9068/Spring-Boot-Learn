package blog;

public class StringConcat {
	public static void main(String[] args) {
		String str = "";		
		String name = "홍길동";
		
		// '+' 연산자
		str = "안녕하세요 " + name + " 입니다";
		System.out.println(str);
		
		// String format 메소드 사용
		str = String.format("안녕하세요 %s 입니다", name);
		System.out.println(str);

		// StringBuilder append 메소드 사용
		str = new StringBuilder().append("안녕하세요 ").append(name).append(" 입니다").toString();
		System.out.println(str);
				
	}
}
