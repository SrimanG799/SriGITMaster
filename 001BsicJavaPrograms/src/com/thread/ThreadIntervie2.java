package com.thread;

public class ThreadIntervie2 {
	
	public int square(int a)
	{
		int ss=0;
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int c=a*a;
				System.out.println(c);
				
				
			}
		});
		t.start();
		
		
		return ss;
		
	}
	
	public int cube(int c)
	{
	int cc=0;
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int cc=c*c;
				System.out.println(cc);
				
				
			}
		});
		t.start();
		
		
		return cc;
		
	}
	
	public static void main(String[] args) {
		
		ThreadIntervie2 t=new ThreadIntervie2();
		t.square(5);
		t.cube(8);
		
	}
	
	
	

}
