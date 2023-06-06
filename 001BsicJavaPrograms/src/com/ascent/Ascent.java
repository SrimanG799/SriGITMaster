package com.ascent;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ascent {

	public static void main(String[] args)
	{
		
		
		
		//Prodcut name, Price 
		Map<String,Integer>  productMap = new HashMap<>();

		 

		        productMap.put("cc",435);
		        productMap.put("dd",3425);
		        productMap.put("ee",2378);
		        productMap.put("ff",8765);
		        productMap.put("gg",766);
		        productMap.put("kk",4556);
		        productMap.put("rr",2234);

		 

		       // int  n = 2;
		        
		    Map<String,Integer> topN_Map = new HashMap<>();
		    
	//	  topN_Map=  (Map<String, Integer>) productMap.entrySet().stream().sorted((o1,o2)->o2.getKey()-o1.getKey()).limit(2).collect(Co
		    
		    

		System.out.println(topN_Map);
	}
}
