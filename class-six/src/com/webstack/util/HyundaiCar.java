package com.webstack.util;

public class HyundaiCar extends CarUtil implements Car {

	@Override
	public Long price() {
		return 1400000L;
	}

	@Override
	public String model() {
		return "CRETA";
	}

	@Override
	public void show() {
		System.out.println(model() + " " + price());
	}
}
