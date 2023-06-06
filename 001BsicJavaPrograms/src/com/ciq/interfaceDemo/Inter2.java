package com.ciq.interfaceDemo;

public interface Inter2 {
	//void hello();
	default void print()
	{
		System.out.println("interface2");
	}

}
