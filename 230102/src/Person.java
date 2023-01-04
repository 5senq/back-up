import java.util.ArrayList;

public class Person {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.price = 100;
		
		Car car = new Car();
		car.price = 2000;
		
		// System.out.println(tv.price + car.price);
		
		// 10개면 100개면.. 어떻게 계산할건지
		// Tv와 Car를 추상화시켜 공통분모를 찾아보자
		// 상품이라는 공통분모를 만들자(추상화)
		// 둘다 공통분모를 가지기 때문에
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(tv); // 제네릭이 Product 타입이니까 tv, car 가능 -> 다형성
		list.add(car);
		int total = 0;
		for(Product p : list) {
			total += p.price;
		}
		System.out.println(total);
	}
}
