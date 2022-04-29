package com.java.component;

public final class DTDC implements Courier{
	
	

	public DTDC() {
		System.out.println("DTDC 0:: param constructor");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return  oid+" Oreder id is assigned to Dtdc for delevery";
	}

}
