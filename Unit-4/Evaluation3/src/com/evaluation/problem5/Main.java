package com.evaluation.problem5;

public class Main {

	public static void main(String[] args) {
		
		ElectricCar electircCar = new ElectricCar() ;
		electircCar.run();
		electircCar.service();
		
		System.out.println("===========================================\n");
		
		FuelCar fuelCar = new FuelCar() ;
		fuelCar.run(); 
		fuelCar.service();
	}
}
