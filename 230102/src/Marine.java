
public class Marine extends Unit {
	// 부모 method를 재정의 - 오버라이딩
	// super.work()
	// this.work()
	@Override
	public void work() {
		System.out.println(this.name+"싸우다");
	}
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		m1.name = "해병1";
		m1.hp = 80;
		m1.work();
	}
}
