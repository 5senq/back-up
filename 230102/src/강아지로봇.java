// "extends 강아지, 로봇" 과 같은 두개이상의 다중 상속은 지원되지 않는다
// 자바는 인터페이스의 구현(implements)을 통해 다중상속같은 기능 구현
public class 강아지로봇 extends 강아지 implements I로봇 {
	@Override
	public void on() {
		System.out.println("전원을 켜다");
	}
	public void off() {};
}

// 추상 클래스도 인터페이스도 클래스다!
// 구체적 <- 클래스>추상클래스>인터페이스 -> 추상적
// 추상클래스도 인터페이스도 부모역할(다형성)이 가능하다