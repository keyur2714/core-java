package com.webstack.driver;

import com.webstack.util.Car;
import com.webstack.util.HondaCar;
import com.webstack.util.HyundaiCar;
import com.webstack.util.MarutiCar;

public class TestDriver {
	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...!");
		Car car;
		
		Car c = new HondaCar();
		c.show();
		
		//System.out.println(car.model()+" "+car.price());		
		
		car = new MarutiCar();
		car.show();
		
		//System.out.println(car.model()+" "+car.price());

		car = new HyundaiCar();
		car.show();
		
		//System.out.println(car.model()+" "+car.price());
		
	}
}
