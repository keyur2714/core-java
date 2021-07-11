package com.webstack.util;

public class MarutiCar extends CarUtil implements Car{

	@Override
	public Long price() {
		// TODO Auto-generated method stub
		return 800000l;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return "BREZA";
	}

	@Override
	public void show() {
		System.out.println(model()+" "+price());
	}
}
