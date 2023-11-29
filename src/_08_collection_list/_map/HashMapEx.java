package _08_collection_list._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// key(id), value(name) HashMap
		
		// Map 컬렉션 생성 
		Map<Integer, String> map = new HashMap<>();
		
		// entry 추가 
		map.put(1001, "홍길동");
		map.put(1002, "성춘향");
		map.put(1003, "강해린");
		map.put(1004, "홍길동");

		// 전체 객체 수 
		System.out.printf("총 %d 명의 학생이 있습니다. %n%n", map.size());
		
		// 키로 값 얻기
		int key = 1003;
		String value = map.get(key);
		System.out.printf("%d 번에 해당하는 학생은 %s 입니다. %n%n", key, value);
		
		// 키와 값으로 구성된 모든 Map.Entry 객체들을 Set 담아 리턴 
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		System.out.println();
		
		// iterator 로 반복해서 엔트리 출력하기  
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			// entry: 1001=홍길동 
			// k: 1001
			// v: 홍길동 
			Entry<Integer, String> entry = iterator.next();
			Integer k = entry.getKey();
			String v = entry.getValue();
			System.out.printf("%s 학생은 %d 번입니다. %n", v, k);
			}
		System.out.println();
		
		
		// key에 대한 Set 컬렉션 
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);

		// 주어진 key와 일치하는 entry 삭제
		String deledtedValue = map.remove(key);
		System.out.printf("%s 학생이 삭제되었습니다. %n", deledtedValue);
		int size2 = map.size();
		System.out.printf("총 %d 명의 학생이 있습니다. %n%n", size2);
	}

}
