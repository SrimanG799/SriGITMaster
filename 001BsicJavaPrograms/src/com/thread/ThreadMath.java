package com.thread;

public class ThreadMath {
	int ss=0;
	int c=0;
	int total=0;
	
	public int square(int a)
	{
		return a*a;
	}
	public int cube(int b)
	{
		return b*b*b;
	}
	Runnable r=new Runnable() {
		//int s=0;
		public void run() {
			ss=square(2);
			//ss=s;
		}
		
		
	};
	
	

}
