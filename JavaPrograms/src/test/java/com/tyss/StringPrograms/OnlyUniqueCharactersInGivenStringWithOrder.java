package com.tyss.StringPrograms;

import java.util.LinkedHashSet;

public class OnlyUniqueCharactersInGivenStringWithOrder {
	public static void main(String[] args) {
		String s = "Jharkhand";

		//Step 1 : Filter out Unique Character from given String and storing in set.
		
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
			//Print only unique Character which is not occurred more then one times 
			if(count==1)
				System.out.println(ch+" : "+ count);
		}
	}

}
