package com.encore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Encore {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		List<Integer> even=al.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		
		
	
		System.out.println("git test");
		
	}

}
