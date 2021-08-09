package com.tyss.StringPrograms;

public class ReverseStringUsing3rdVariable {
	public static void main(String[] args) {
		String s = "Bengaluru";
		String rev = "";
		for(int i = s.length()-1; i >=0; i--) {
			rev=rev + s.charAt(i);
		}
		System.out.println(rev);
	}

}
