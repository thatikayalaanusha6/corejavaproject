package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Map<String, List<String>> m = new LinkedHashMap<>();
		for(String word: arr) {
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(!m.containsKey(key)) {
				m.put(key, new ArrayList<>());
			}
			m.get(key).add(word);
		}
System.out.println("Grouped Anagrams: "+m.values());
	}

}
