package com.d6223;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListInt {
	public static void main(String[] args)
	{
		List<Integer> li=Arrays.asList(1,5,7,9,3,2,4,6,10,15);
		
		//Iterator itr=li.iterator();
		int check=20;		
		if(li.contains(check))
		{
			System.out.println(li.indexOf(check));
		}
		else
		{
			System.out.println("-1");
		}
		
	}

}
