import java.util.ArrayList;

public class Base {

	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		// m.move();
		// t.move();		
		// m.attack();
		// t.attack();
		// 같이 공격할 유닛이 100개면?
		// method의 공통분모를 찾을거에요 이름은 통일할 수 있는데 내용이 다르다
		// method를 추상화 하자
		ArrayList<IAttack> team = new ArrayList<IAttack>();
		team.add(m); // 다형성(이름과 기능이 동일한 메서드지만(구체적인 내용이 다르다)의 다형성)
		team.add(t);
		
		for(IAttack it : team) {
			it.attack();
			((Unit)it).move();
		}
	}

}

/* 동일한 필드 -> 클래스 추상화 -> 다형성
 * 동일한 메서드 -> 클래스 추상화 -> 다형성
 * 기능은 같지만 내용이 다른 메서드 => 추상클래스(추상메서드 -> 오버라이딩까지 있어야됩니다) -> 다형성
 * 이미 다른클래스를 상속중이다 */
