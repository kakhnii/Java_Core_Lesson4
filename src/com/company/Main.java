package com.company;

public class Main {

    public static void main(String[] args) {
	Animal a = new Animal("Тигр",50,9);
	System.out.println(a);

	System.out.println("_________________________________________________________________");

	a.setName("Бик");
	a.setSpeed(25);
	a.setAge(4);
    System.out.println(a);
    }
}
