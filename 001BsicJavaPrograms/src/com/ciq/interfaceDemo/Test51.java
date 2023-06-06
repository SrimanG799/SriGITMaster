package com.ciq.interfaceDemo;

import java.util.regex.Pattern;

public class Test51 {
	public static void main(String[] args) {
		String s="sriman.rapelli.ciq@gmail.com";
		
		
		String[] arr=s.split(Pattern.quote("."));
		
		for (String str: arr) {
			
			System.out.println(str);
		}
		
		
	}

}
