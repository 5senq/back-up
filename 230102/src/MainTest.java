
public class MainTest {

	public static void main(String[] args) {
		// 다형성 : 부모타입에 자식객체 대입
		동물 a = new 고양이();
		동물 b = new 뱀();
		동물 c = new 참치();
		
		a.움직인다();
		b.움직인다();
		c.움직인다();

	}

}
