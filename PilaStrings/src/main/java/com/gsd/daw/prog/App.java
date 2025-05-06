package com.gsd.daw.prog;


public class App {
	
	public static void main(String[] args) {
		
		PilaStrings lista = new PilaStrings();
		lista.push("Hola");
		lista.push("Clase");
		lista.push("Jirafa");
		lista.push("Libro");
		lista.push("Primo");
		lista.push("Escape");
		lista.print();
		System.out.println("------------------");
		System.out.println("El ultimo elemento de la pila es: "+ 
		lista.pop());
		lista.peek();
		System.out.println("------------------");
		System.out.println("La pila tiene " + lista.size() + " elementos.");
		
	}
}
