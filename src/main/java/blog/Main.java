package blog;

public class Main {
	public static void main(String[] args) {
		
		User user = User.builder()
						.id("id")
						.pw("pw")
						.age(18)
						.build();
		
	}
}
