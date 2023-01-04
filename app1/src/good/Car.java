package good;

import java.util.ArrayList;

// Class?
// 1) 데이터 타입 -> 필드(속성, 멤버변수)를 가진다
// 2) 기능(function)의 상자 -> method(멤버함수)를 가진다
// 3) 1) + 2) -> 필드 + method -> method에서 필드를 호출 -> this -> method가 method를 호출 
// -> this -> 정보은닉 -> 캡슐화 -> get/set
// ※ this : 같은 Class 내의 method가 다른 method나 필드와 통신할 때 사용하는 참조 키워드

public class Car { // Class 이름과 생성자 : 파스칼 표현식 사용
	public static int serialNumber; // static 필드 ex) Car.serialNumber
	public static final int SERIAL_NUMBER = 100; // static 상수 필드 ex) Car.SERIAL_NUMBER
	// 상수 : 대문자 스네이크 표현식 사용
	
	public int id;
		
	// 1) method(생성자 method)
	public Car() { // 디폴트 생성자 -> 생성자 method가 Class 내에 없으면 컴파일러에 의해 자동으로 생성된다
		this.id = 0;
		// Class 내 필드가 존재한다면 필드값을 초기화 시키는 코드도 컴파일러에 의해 자동으로 생성된다
		// 기본타입 -> 0, 0.0, false, \u0000;, 참조타입 -> null값으로 자동 초기화
	}
	
	public Car(int id) { // 일반 생성자
		this.id = id; // 생성자가 매개변수를 가지면 원하는 값으로 필드를 초기화
	}
	// method 매개변수(타입, 갯수, 순서)가 다르면 같은 이름의 method 선언 가능 -> method 오버로딩, 생성자 method 오버로딩 가능
	
	// 필드명 : 카멜 표현식 사용
	public boolean auto; // 기본타입(8개)의 필드
	public String company; // String 참조타입
	public Integer no; // 랩퍼(박싱) 참조타입 -> 기본타입 8개와 동일한 값을 가지는 참조타입
	// 기본타입 -> 랩퍼타입으로 자동변환되는 걸 : 오토박싱 ex) Integer a = 10;
	// 랩퍼타입 -> 기본타입으로 자동변환되는 걸 : 오토언박싱 ex) int a = new Integer(10);
	public String[] nickname; // String의 배열, 기본타입의 배열 int[] num도 가능
	public ArrayList<String> nickname2; // 컬렉션 참조타입
	public Tire tire; // 사용자 정의 타입
	public ArrayList<Tire> tireList; // 사용자정의 컬렉션 타입
	
	// method : 카멜 표현식 사용
	// static method
	public static void goodeePrint() { // Car.goodeePrint()
		System.out.println("GooDee!");
		// this.id 에러! -> static method 안에서는 this 키워드를 사용할 수 없다.
		// this는 method 호출시 method 객체를 참조하는 static method는 Class 이름으로 호출
		// Class가 로드되는 시점에 static 멤버들은 같이 로드 -> 객체보다 static 멤버가 먼저 메모리에 로드
	}
	
	// 일반 method
	public void start() { // 매개변수 없는
		System.out.println("출발~"); // Car c = new Car(); c.start();
	}
	public void start(String name) { // 이름은 같지만 매개변수가 있다
		System.out.println(name + "이 출발~"); // Car c = new Car(); c.start();
		System.out.printf("%s 이(가) 출발~", name); // 자바스크립트에서 백틱사용 '${name} 이(가) 출발'
	}
	
	// Class안에 Class -> inner Class
	public class InClz {
		public int i;
	}
}
// 같은 파일 내 두개의 Class 선언가능 컴파일시에는 따로 컴파일
class Tire {}