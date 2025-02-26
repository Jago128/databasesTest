package main;

import modelo.*;
import utilidades.Utilidades;

public class Main {

	public static void main(String[] args) {
		int menu;
		String name, password;
		ImplementacionDB i=new ImplementacionDB();
		System.out.println("Introduce el nombre:");
		name=Utilidades.introducirCadena();
		System.out.println("Introduce la contraseña:");
		password=Utilidades.introducirCadena();
		System.out.println(i.comprobarUsuario(new Usuario(name,password)));
		
		do {
			menu=menu();
			switch (menu) {
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 0:
				System.out.println("Adios!");
			}
		} while (menu!=0);
	}
	
	public static int menu() {
		System.out.println("1. Insertar");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Mostrar");
		System.out.println("0. Salir");
		return Utilidades.leerInt("Elija una opcion:",0,4);
	}
}
