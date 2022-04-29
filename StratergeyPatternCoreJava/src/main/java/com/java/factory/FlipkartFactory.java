package com.java.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.java.component.Courier;
import com.java.component.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	
	static {
	System.out.println("FlipkartFactory.static block");
	try {
		// Locate properties file through stream
		InputStream is = new FileInputStream("src/main/java/com/java/commons/info.properties");
	
		// load property files content to java.util.Properties class Obj
		props = new Properties();
		props.load(is);
		
	}catch(IOException ie) {
		ie.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
}// static block
	// static factory method
	public static Flipkart getInstance() throws Exception{
		System.out.println("FlipkartFactory.getInstance()");
		
		// get dependent class name
		String courierClassname = props.getProperty("courier.classname");
		//load dependent class name
		Class c = Class.forName(courierClassname);
		// create the object for loaded class
		Constructor<Courier> cons[] = c.getDeclaredConstructors();
		Courier courier = cons[0].newInstance();
		
		// create target class obj
		Flipkart fpkt = new Flipkart();
		
		// assign dependednt class object to target class obj
		
		fpkt.setCourier(courier);
		return fpkt;
		
		
		
		
	}
}

	