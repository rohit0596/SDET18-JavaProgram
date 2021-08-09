package com.tyss.StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindNumberOfOccuranceOfEachCharecterOfGivenString {
	public static void main(String[] args) {
		String s = "Jharkhand";
		
		//Step 1 : Filter out Unique Character from given String and storing in set.
		//HashSet<Character> set = new HashSet<Character>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//Step 2: Compare set value with given string value
		for (Character ch : set) {
			int count = 0;
			for(int i = 0; i < s.length(); i++) {
				if(ch == s.charAt(i)) {
					count++;
				}
			}
		//Print Count of each characters of given string. 	
			System.out.println(ch+" : "+ count);
		}
		
	}
}
