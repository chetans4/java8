package org.chetans4.main;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Animal a = () -> System.out.println("lambda-- Cat : meao... meao....");
//		Animal a = MethodRefrence::animalSpeak;
		Animal a = ConstrReference::new;
		a.speak();
		
	}

}
