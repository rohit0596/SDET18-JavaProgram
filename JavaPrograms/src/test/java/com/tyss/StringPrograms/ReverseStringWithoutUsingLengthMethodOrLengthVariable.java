package com.tyss.StringPrograms;

public class ReverseStringWithoutUsingLengthMethodOrLengthVariable {
	public static void main(String[] args) {
		String s ="Karnataka";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;
		}
		
		for(int i=count-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
