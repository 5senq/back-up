package good;

// 정보은닉 -> this -> 캡슐화
public class Member {
	public int age;
	public String name;
	
	// method(정보) 은닉
	private String getCountry() {
		String result = null;
		if(this.name.equals("홍길동")) {
			result = "KO";
		} else if(this.name.equals("루피")) {
			result = "JP";
		} else {
			result = "unknown";
		}
		return result;
	}
	
	public String getAgeAndNameAndCountry() {
		return this.age + this.name + this.getCountry();
		// this가 가리키는(바인딩) 것은 getAgeAndName()를 호출하는 객체
		// this method가 동일한 객체내 다른 method나 필드와 통신할때 사용
	}
	
}
