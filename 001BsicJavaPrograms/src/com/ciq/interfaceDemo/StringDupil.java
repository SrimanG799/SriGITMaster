package com.ciq.interfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDupil {
	public static void main(String[] args) {
		String[] str= {"ram","mahi","kumar","sriman","ramya","RAMYA","pooja","raja","Ram"};
		
	List<String> ls=(List<String>) Arrays.stream(str).map(e->e.toUpperCase()).distinct().collect(Collectors.toList());	
		
		System.out.println(ls);
	}

}
