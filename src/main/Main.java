package main;

import utilidades.Utilidades;

public class Main {

	public static void main(String[] args) {
		
	}
	
	public static int menu() {
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");
		return Utilidades.leerInt(1,5);
	}
}
