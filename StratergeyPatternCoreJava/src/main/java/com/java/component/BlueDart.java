package com.java.component;

public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart 0 :: param constructor ");
	}

	@Override
	public String deliver(int oid) {

        
		return oid+"orderid is assigned for bluedart for delevery";
	}
	
	

}
