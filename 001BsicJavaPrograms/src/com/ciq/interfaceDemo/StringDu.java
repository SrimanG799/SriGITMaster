package com.ciq.interfaceDemo;

public class StringDu {
	
	public static void main(String[] args) {
		String[] str= {"ram","mahi","kumar","sriman","ramya","RAMYA","pooja","raja","Ram"};
		String[] st2=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
				
			{
				int count=0;
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					
				}
			}
			
		}
		

}
}
