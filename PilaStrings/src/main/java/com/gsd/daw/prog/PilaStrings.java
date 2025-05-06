package com.gsd.daw.prog;

public class PilaStrings {
	
	private NODO principal;

	public PilaStrings() {
		this.principal = null;
	}
	//Añade un elemento al final de la pila
	public void push(String s) {
		NODO nuevo = new NODO(s);
		if (principal == null) {
			principal = nuevo;
		}else {
			NODO actual = principal;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}
	//Devuelve el ultimo elemento de la pila
	public String pop() {
		if (isEmpty()) {
			System.err.println("La pila está vacia.");
			return null;
		}
		NODO actual = principal;
		while(actual.siguiente != null) {
			actual = actual.siguiente;
		}
		return actual.valor;
	}
	//Permite ver el último elemento de la pila sin eliminarlo
	public void peek() {
		if (isEmpty()) {
			System.err.println("La pila está vacia.");
			return;
		}
		NODO actual = principal;
		while(actual.siguiente != null) {
			actual = actual.siguiente;
		}
		System.out.println("El ultimo elemento de la pila es: " +
				actual.valor);
		return;
	}
	//Devuelve el tamaño de la pila
	public int size() {
		int contador = 0;
		NODO actual = principal;
		while (actual != null) {
			contador++;
			actual = actual.siguiente;
		}
		return contador;
	}
	//Imprime todos los elementos de la pila
	public void print() {
		NODO actual = principal;
		while (actual != null) {
			System.out.print(actual.valor + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}
	//Devuelve true o false si la pila esta no vacia
	public boolean isEmpty() {
		if (principal == null) return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
