package ch15.practice.practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		for(Map.Entry<String, Integer> x : map.entrySet()) {
			totalScore += x.getValue();
			if(maxScore < x.getValue()) {
				maxScore = x.getValue();
				name = x.getKey();
			}
		}
		
		System.out.println("평균 점수 : " + totalScore/3);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
	}

}
