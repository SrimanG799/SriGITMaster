package com.ciq.interfaceDemo;

public class Test implements Inter1,Inter2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Inter1.super.print();
	}

//	@Override
//	public void hello() {
//		// TODO Auto-generated method stub
//		
//	}

//	@Override
//	public void hai() {
//		// TODO Auto-generated method stub
//		
//	}
	public static void main(String[] args) {
		Test t=new Test();
		t.print();
	}

}
