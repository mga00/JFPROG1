package com.gsd.daw.prog;


public class App {
	
	public static void main(String[] args) {
		
		ColaStrings lista = new ColaStrings();
		lista.enqueue("Hola");
		lista.enqueue("Clase");
		lista.enqueue("Jirafa");
		lista.enqueue("Libro");
		lista.print();
		System.out.println("------------------");
		System.out.println("El primer elemento de la lista es: "+ 
		lista.dequeue());
		System.out.println("------------------");
		System.out.println("La lista tiene " + lista.size() + " elementos.");
		
	}
}
