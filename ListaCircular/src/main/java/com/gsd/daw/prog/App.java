package com.gsd.daw.prog;


public class App {
	
	public static void main(String[] args) throws Exception {
		
		ListaCircular lista = new ListaCircular();
		lista.add(23);
		lista.add(7);
		lista.add(34);
		lista.add(3);
		lista.add(5);
		lista.add(90);
		lista.print();
		System.out.println("----------------");
		lista.add(10, 4);
		lista.print();
		System.out.println("----------------");
		System.out.println(lista.get(2));
		System.out.println("----------------");
		lista.remove(3);
		lista.print();
		System.out.println("----------------");
		System.out.println(lista.search(34));
		System.out.println("----------------");
		lista.sort();
		lista.print();
		System.out.println("----------------");

		System.out.println("----------------");

		System.out.println("----------------");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
