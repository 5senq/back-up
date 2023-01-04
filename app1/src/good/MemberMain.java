package good;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.age = 20;
		m1.name = "홍길동";
		String s1 = m1.getAgeAndNameAndCountry(); // m -> this에 바인딩
		System.out.println(s1);
		// 국적코드만 출력가능
		System.out.println(m1.getAgeAndNameAndCountry());
		
		Member m2 = new Member();
		m2.age = 21;
		m2.name = "루피";
		String s2 = m2.getAgeAndNameAndCountry();
		System.out.println(s2);

	}

}
