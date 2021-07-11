package com.webstack.util;

public class HondaCar extends CarUtil implements Car{

	@Override
	public Long price() {		
		return 1000000l;
	}

	@Override
	public String model() {		
		return "City-IV-Tech";
	}

	@Override
	public void show() {
		System.out.println(model()+" "+price());
	}
}
