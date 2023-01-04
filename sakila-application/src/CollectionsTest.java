import java.util.*;
public class CollectionsTest {
	public static void main(String[] args) {
		// 자료 구조 -> 배열
		int[] arr = new int[3]; // 배열을 만들때 크기가 3으로 고정된다(정적배열)
		arr[0] = 7;
		arr[1] = 1;
		arr[2] = 3;
		for(int i : arr) {
			System.out.println(i);
		}
		// arr[3] = 9; // ArrayIndexOutOfBoundsException 발생
		
		// 배열 사용 X -> 배열대신 Collections(기본API) 사용 -> 3가지의 자료구조(list/set/map)
		
		System.out.println("-------- list --------");
		// 1) list(동적배열)
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		// list.set(0, 7);
		// list.set(1, 1);
		// list.set(2, 3);
		// list.set(3, 9); // 4개째 예외발생? -> IndexOutOfBoundsException 발생
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(9); // 자동으로 list의 크기가 변경된다
		System.out.println(list.get(3)); // 9
		
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("-------- set --------");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(7);
		set.add(3); // 중복된 값은 입력되지 않는다
		// System.out.println(set.get(1)); // error -> index가 없다
		System.out.println(set);
		
		System.out.println("-------- map --------");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김도희",3);
		map.put("김설",7);
		map.put("김도희",10); // 동일한 키를 사용하면 덮어쓰기
		System.out.println(map.get("김도희"));
		System.out.println(map.get("김설"));
		
		System.out.println("-------- 응용 list<map> --------");
		ArrayList<HashMap<String, Object>> studentList = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> s1 = new HashMap<String, Object>();
		s1.put("이름", "김도희");
		s1.put("나이", 21);
		studentList.add(s1);
		
		HashMap<String, Object> s2 = new HashMap<String, Object>();
		s2.put("이름", "김설");
		s2.put("나이", 22);
		studentList.add(s2);
		
		for(HashMap<String, Object> m : studentList) {
			System.out.print((String)m.get("이름"));
			System.out.print((Integer)m.get("나이"));
			System.out.println("");
		}
	}
}