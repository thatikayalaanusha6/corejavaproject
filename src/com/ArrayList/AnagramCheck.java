package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		ArrayList<Character> list1=new ArrayList<>();
		ArrayList<Character> list2=new ArrayList<>();
		for (char ch : str1.toCharArray()) {
            list1.add(ch);
        }
		for(char ch:str2.toCharArray()) {
			list2.add(ch); 
		}
		Collections.sort(list1);
		Collections.sort(list2);
		
		if (list1.equals(list2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
		
	}

}
