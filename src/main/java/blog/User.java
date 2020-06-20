package blog;

import lombok.Builder;

@Builder
public class User {
	private String id;
	private String pw;
	private int age;
}
