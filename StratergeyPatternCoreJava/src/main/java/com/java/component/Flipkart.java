package com.java.component;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart{
	//has - A property
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart 0:: param constructor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}
	
	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		
		// calculate bill amount
		double billAmt = 0.0;
		for(double p : prices) {
			billAmt +=p;
			
		}
		//generate order id
		int oid = new Random().nextInt(1000);
		//use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items)+" purchased having bill amount "+billAmt+" ---> " +msg;
		
	}

}
