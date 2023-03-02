package com.classpractice;

public class CarClass {

	int id;
	String name;
	int price;
	String color;

	public static void main(String[] args) {

		CarClass car = new CarClass();

		car.id = 1111;
		car.name = "Marcedes Benz G-Class";
		car.price = 980000;
		car.color = "Black";
		System.out.println(car.id + " " + car.name + " " + car.price + " " + car.color);

		car.id = 806;
		car.name = "Baleno";
		car.price = 200000;
		car.color = "Blue";
		System.out.println(car.id + " " + car.name + " " + car.price + " " + car.color);

		car.id = 698;
		car.name = "Kia Seltos";
		car.price = 250000;
		car.color = "White";
		System.out.println(car.id + " " + car.name + " " + car.price + " " + car.color);

		car.id = 331;
		car.name = "Audi RsQ8";
		car.price = 22000000;
		car.color = "Black";
		System.out.println(car.id + " " + car.name + " " + car.price + " " + car.color);
	}

}
