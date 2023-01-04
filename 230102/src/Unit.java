
public abstract class Unit {
	public String name;
	public int hp;
	public abstract void work();
	
	public static void main(String[] args) {
		
		// 1) 추상클래스는 객체를 만들 수 없다
		// --> 추상클래스는 추상메서드를 가진다
		// --> 추상메서드는 메서드의 구현부가 없다
		Unit u = new Unit();
	}
}
