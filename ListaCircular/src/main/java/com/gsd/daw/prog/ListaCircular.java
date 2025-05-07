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
			ultimo = nuevo;
			nuevo.siguiente = nuevo;
		}else {
			nuevo.siguiente = principal;
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
	}
	//Añade un elemento en una posicion dada
	public void add(int n, int pos) {
		NODO nuevo = new NODO(n);
		if (principal == null) {
			principal = nuevo;
			ultimo = nuevo;
			nuevo.siguiente = nuevo;
		}else if(pos == 0) {
			nuevo.siguiente = principal;
			principal = nuevo;
			ultimo.siguiente = principal;
		}else {
			NODO actual = principal;
			int contador = 0;
			while(contador < pos - 1 && actual.siguiente != principal) {
				actual = actual.siguiente;
				contador++;
			}
			nuevo.siguiente = actual.siguiente;
			actual.siguiente = nuevo;
			if (actual == ultimo) {
				ultimo = nuevo;
			}
		}
	}
	
	//Devuelve el elemento de la posicion dada
	public int get(int pos) {
		if(pos < 0) System.err.print("La posicion del elemento no es válida");
		NODO actual = principal;
		for (int i = 0; actual != null && i<pos; i++) {
			actual = actual.siguiente;
		}
		return (actual != null) ? actual.valor : null;
	}
	
	//Borra el elemento de la posicion dada
	public void remove(int pos) {
		if (principal == null || pos < 0)	return;
		if (pos == 0) {
			principal = principal.siguiente;
			return;
		}
		NODO actual = principal;
		for (int i = 0; actual != null && i < pos - 1; i++) {
			actual = actual.siguiente;
		}
		actual.siguiente = actual.siguiente.siguiente;
	}
	
	//Devuelve la posicion del elemento dado
	public int search(int n) throws Exception {
		NODO actual = principal;
		int contador = 0;
		while (actual.valor != n) {
			actual = actual.siguiente;
			contador++;
			if(contador > size()) {
				throw new Exception("El numero solicitado no se encuentra en la lista.");
			}
		}
		return contador;
	}
	
	//Devuelve el tamaño de la lista
	public int size() {
		int contador = 0;
		NODO actual = principal;
		while (actual != ultimo) {
			contador++;
			actual = actual.siguiente;
		}
		return contador;
	}
	
	//Imprime todos los elementos de la lista
	public void print() {
		NODO actual = principal;
		int contador = 0;
		do {
			contador++;
			System.out.print(actual.valor + " ");
			actual = actual.siguiente;
		}while (size() >= contador);
		System.out.println();
	}
	
	//Ordena la lista de forma ascendente
	public void sort() {
		if (principal == null || principal.siguiente == null) return;
		boolean ordenado;
		do {
			ordenado = false;
			NODO actual = principal;
			while (actual.siguiente != principal) {
				if (actual.valor > actual.siguiente.valor) {
					int temp = actual.valor;
					actual.valor = actual.siguiente.valor;
					actual.siguiente.valor = temp;
					ordenado = true;
				}
				actual = actual.siguiente;
			}
		}while(ordenado);
	}
	
	//Devuelve true o false si la lista está o no vacia.
	public boolean isEmpty() {
		if (principal == null) return true;
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
