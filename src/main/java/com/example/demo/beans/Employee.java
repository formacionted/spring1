package com.example.demo.beans;

public class Employee {

	private String name;
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
//		this.car = new Honda(); // Alto acoplamiento
		this.car = car; // bajo acoplamiento
	}

	public void showDetails() {
		System.out.print("Employee " + name + " drives ");
		car.drive();
	}

}
