package good;

public class ExecuteMain {

	public static void main(String[] args) {
		// static 요소는 클래스이름으로 접근 -> 클래스 멤버
		Execute.hello();
		Execute.num = 777;
		System.out.println(Execute.num);
		// static inner class
		Execute.InClzStatic ics = new Execute.InClzStatic();
		ics.y = 20;
		System.out.println(ics.y);
		
		// 일반 멤버는 객체 이름으로 접근 -> 객체 멤버
		Execute ex = new Execute();
		ex.bye();
		ex.id = 4;
		System.out.println(ex.id);
		System.out.println(ex.num); // 777 나쁜습관 
		// 객체이름으로 static멤버 접근가능 -> ex.num보다는 Execute.num으로 접근
		
		Execute.InClz ic = ex.new InClz();
		ic.x = 9;
		System.out.println(ic.x);
	}
}