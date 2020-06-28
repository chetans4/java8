package org.chetans4.main;

@FunctionalInterface
public interface Animal {

	void speak();
	
	public default void run(){
		
	}
	
}
