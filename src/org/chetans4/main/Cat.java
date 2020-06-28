package org.chetans4.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cat implements Animal {

	Logger log = Logger.getLogger(Cat.class.getSimpleName());

	@Override
	public void speak() {
		log.log(Level.ALL, "Meaoo... Meao....");
	}

}
