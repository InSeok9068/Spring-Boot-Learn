package blog.response;

public class ResponseMain {
	public static void main(String[] args) {
		Member1 member1 = new Member1();
		member1.setResCode(0);
		member1.setResMsg("성공");
		member1.setName("홍길동");
		member1.setAge(15);

		System.out.println("member1 : " + member1);

		CommonGenericRes<Member2> commonGenericRes = new CommonGenericRes<>();
		Member2 member2 = new Member2();
		member2.setName("홍길동");
		member2.setAge(15);
		commonGenericRes.setResCode(0);
		commonGenericRes.setResMsg("성공");
		commonGenericRes.setResObj(member2);

		System.out.println("member2 : " + commonGenericRes);

	}
}
