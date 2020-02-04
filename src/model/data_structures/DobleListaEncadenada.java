package model.data_structures;

import java.util.Iterator;

public class DobleListaEncadenada <X,Z extends Iterable<Z>> implements IDobleListaEncadenada<X, Z> {
	int tamano;

	Nodo<X,Z> nodoInicial;
	Nodo<X,Z> nodoActual;
	Nodo<X,Z> nodoFinal;

	@Override
	public int darTamano() {
		return tamano;
	}

	@Override
	public Z darPrimerElemento() {
		return nodoInicial.getDatos();
	}

	@Override
	public Z darUltimoElemento() {
		// TODO Auto-generated method stub
		return nodoFinal.getDatos();
	}



	@Override
	public Z BuscarElemento(X ID) {
		Iterator<Nodo> iterador = new Iterator<Nodo>() {
			
			@Override
			public Nodo next() {
				
				return null;
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		return null;
	}

	@Override
	public void limpiarLista() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarDespues(X ID, Z pComparendo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarPrimero(Z pComparendo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarUltimo(Z pComparendo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerPrimero() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerUltimo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(X ID) {
		// TODO Auto-generated method stub

	}
	public DobleListaEncadenada(int pTamano) {
		tamano = pTamano;
	}

	@Override
	public Z darElementoActual() {
		return nodoActual.getDatos();
	}

}
