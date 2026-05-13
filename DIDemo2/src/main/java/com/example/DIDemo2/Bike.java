package com.example.DIDemo2;


import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehical{

	public void start() {
		System.out.println("Bike is starting....");
		
	}

}
