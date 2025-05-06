package com.gsd.daw.prog;


public class App {
	
	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
		lista.add(23);
		lista.add(32);
		lista.add(7);
		lista.add(34);
		lista.add(3);
		lista.add(5);
		lista.print();
		lista.add(10, 4);
		lista.print();
		System.out.println("------------------");
		System.out.println("------------------");
		
	}
}
