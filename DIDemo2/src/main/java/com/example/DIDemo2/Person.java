package com.example.DIDemo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	
	       @Autowired
	       @Qualifier("bike")
	private Vehical v_choice;

	public void travel() {
		v_choice.start();
	}
}
