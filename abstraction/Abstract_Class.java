package com.abstraction;

public abstract class Abstract_Class {
	//to initialize global variable we have constructor
	void m1() {
		System.out.println("m1 method");
	}
	static void m3() {
		System.out.println("static method");
	}
	abstract void m2();//for abstract method abstract class is required. abstract method is without body.

public static void main(String[]args) {
	m3();
}
}