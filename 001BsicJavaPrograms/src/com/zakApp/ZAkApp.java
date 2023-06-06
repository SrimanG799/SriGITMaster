package com.zakApp;

public class ZAkApp {
	

public static void main(String[] args) {
	String s1="shvamshiwelcomevitrusa";
	char[] a=s1.toCharArray();
	for(int i=0;i<a.length;i++)
	{
		int count=1;
		if(a[i]==' ')
		{
			continue;
		}
		
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]==a[j])
		{
		count++;
		a[j]=' ';
			}
			}
		System.out.print(a[i]+"="+count+"  ");
		count=1;
			}
			}
}
