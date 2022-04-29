package com.java.test;

import com.java.component.Flipkart;
import com.java.factory.FlipkartFactory;

public class StratergyPatternTest {
	
	public static void main(String[] args) {
		
		try {
		
		// get target class obj( Flipkart class obj) from Factory
		
		Flipkart fpkt = FlipkartFactory.getInstance();
		
		String resultMsg = fpkt.shopping(new String[] {"candles","flowers","cake","wine"}, new double[] {1000.0,200.0,1000.0,3000.0});
		
		System.out.println(resultMsg);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
