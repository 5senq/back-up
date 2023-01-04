package good;

public class Execute {
	// 1) 디폴트 생성자 메서드
	public Execute() {} 
	
	// 2) 메서드
	public static void hello() {
		System.out.println("hello");
	}
	public void bye() {
		System.out.println("bye");
	}
	
	// 3) 필드
	public int id;
	public static int num;
	
	// 4) 이너 클래스
	public class InClz {
		public InClz() {}
		public int x;
	}
	
	public static class InClzStatic {
		public InClzStatic() {}
		public int y;
	}
}