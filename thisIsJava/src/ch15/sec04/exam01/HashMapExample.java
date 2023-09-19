package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("박종범", 1);
		map.put("박종범2", 2);
		map.put("박종범3", 3);
		map.put("박종범", 4);
		System.out.println("총 엔트리 수 : " + map.size());
		System.out.println("==============");
		
		// 키로 값 얻기
		String key = "박종범";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println("=============");
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println("==============");
		
		// 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+ " : " + v);
		}
		System.out.println("==============");
		
		// 키로 엔트리 삭제
		map.remove("박종범");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}

}
