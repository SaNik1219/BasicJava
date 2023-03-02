package com.classpractice;

public class StudentClass {
	int id;
	String name;
	int marks;

	public static void main(String[] args) {

		StudentClass std = new StudentClass();

		std.id = 101;
		std.name = "Nikita";
		std.marks = 88;
		System.out.println(std.id + " " + std.name + " " + std.marks);

		std.id = 102;
		std.name = "Sandip";
		std.marks = 94;
		System.out.println(std.id + " " + std.name + " " + std.marks);

		std.id = 103;
		std.name = "Amol";
		std.marks = 68;
		System.out.println(std.id + " " + std.name + " " + std.marks);

		std.id = 104;
		std.name = "Pooja";
		std.marks = 78;
		System.out.println(std.id + " " + std.name + " " + std.marks);

		std.id = 105;
		std.name = "Shital";
		std.marks = 58;
		System.out.println(std.id + " " + std.name + " " + std.marks);
	}

}
