package com.gsd.daw.prog;

public class ListaCircular {
	
	private NODO principal;
	private NODO ultimo;

	public ListaCircular() {
		this.principal = null;
		this.ultimo = null;
	}
	//Añadir un elemento
	public void add(int n) {
		NODO nuevo = new NODO(n);
		if (principal == null) {
			principal = nuevo;
			principal.siguiente = principal;
		}else {
			NODO actual = principal;
			while (actual.siguiente != null) {
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
			ultimo = actual.siguiente;
		}
	}
	//Añade un elemento en una posicion dada
	public void add(int n, int pos) {
		NODO actual = principal;
		NODO nuevo = new NODO(n);
		if (pos == 0) {
			nuevo.siguiente = principal;
			NODO temp = principal;
			while (temp.siguiente != principal) {
				temp = temp.siguiente;
			}
			temp.siguiente = nuevo;
			principal = nuevo;
		}
		NODO otro = principal;
		int contador = 0;
		while (contador < pos - 1 && otro.siguiente != principal) {
			otro = otro.siguiente;
			contador++;
		}
		if (contador == pos - 1) {
			nuevo.siguiente = otro.siguiente;
			otro.siguiente = nuevo;
		}else {
			System.err.println("La posicion no se puede encontar.");
			return;
		}
		
	}
	
	//Devuelve el elemento de la posicion dada
	public int get(int pos) {
		
		return 0;
	}
	
	//Borra el elemento de la posicion dada
	public void remove(int pos) {
		
	}
	
	//Devuelve la posicion del elemento dado
	public int search(int n) {
		
		return 0;
	}
	
	//Devuelve el tamaño de la lista
	public int size() {
		
		return 0;
	}
	
	//Imprime todos los elementos de la lista
	public void print() {
		NODO actual = principal;
		while (actual != null) {
			System.out.print(actual.valor + " ");
			actual = actual.siguiente;
		}
		System.out.println();
	}
	
	//Ordena la lista de forma ascendente
	public void sort() {
		
	}
	
	//Devuelve true o false si la lista está o no vacia.
	public boolean isEmpty() {
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
