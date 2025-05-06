package com.gsd.daw.prog;

public class ColaStrings {
	
	private NODO principal;

	public ColaStrings() {
		this.principal = null;
	}
	//Añade un elemento al final de la cola
	public void enqueue(String s) {
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
	//Devuelve el primer elemento de la cola
	public String dequeue() {
		if (isEmpty()) {
			System.err.println("La cola está vacia.");
			return null;
		}
			return principal.valor;
	}
	//Devuelve el tamaño de la cola
	public int size() {
		int contador = 0;
		NODO actual = principal;
		while (actual != null) {
			contador++;
			actual = actual.siguiente;
		}
		return contador;
	}
	//Imprime todos los elementos de la cola
	public void print() {
		NODO actual = principal;
		while (actual != null) {
			System.out.print(actual.valor + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}
	//Devuelve true or false si la cola esta o no vacia
	public boolean isEmpty() {
		if (principal == null) return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
