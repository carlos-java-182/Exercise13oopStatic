package com.Static13.app;


import com.Static13.model;

import java.util.Scanner;


public class CarApp {

	public static void main(String[] args) {
		
		Car edgarCar = new Car();
		Car luisCar = new Car();
		Car aleCar = new Car();
		Car crisCar = new Car();
		Car hellCar = new Car();
		Car manuCar = new Car();
		Car aryCar = new Car();
		
		edgarCar.setSerialNumber("1");
		edgarCar.serNumberDoors(4);
		edgarCar.setBrand("Volvo");
		
		luisCar.setSerialNumber("2");
		luisCar.serNumberDoors(4);
		luisCar.setBrand("Volvo");
		
		aleCar.setSerialNumber("3");
		aleCar.serNumberDoors(4);
		aleCar.setBrand("Volvo");
		
		crisCar.setSerialNumber("4");
		crisCar.serNumberDoors(4);
		crisCar.setBrand("Honda");
		
		
		hellCar.setSerialNumber("5");
		hellCar.serNumberDoors(4);
		hellCar.setBrand("Honda");
		
		manuCar.setSerialNumber("6");
		manuCar.serNumberDoors(4);
		manuCar.setBrand("Honda");
		
		aryCar.setSerialNumber("7");
		aryCar.serNumberDoors(4);
		aryCar.setBrand("Honda");
		
		System.out.println(edgarCar.ToString());
		System.out.println(luisCar.ToString());
		System.out.println(aleCar.ToString());
		System.out.println(crisCar.ToString());
		System.out.println(hellCar.ToString());
		System.out.println(manuCar.ToString());
		System.out.println(aryCar.ToString());
	
		
		

	}

}
