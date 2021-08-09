package com.tyss.StringPrograms;

public class ReverseStringUsingPrintMethod {

	public static void main(String[] args) {
		
		String s = "india";
		
		for(int i = 0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println("\n=================================");
		System.out.println("Reverse of String.");
		System.out.println("=================================");
		
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	
	}
}
