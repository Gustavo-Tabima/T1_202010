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

		Nodo<X, Z> actual = nodoInicial;
		Z elementoBuscado =null;
		if (actual!=null) {
			while (actual.getSiguiente()!=null) 
			{
				if (actual.getDatos().equals(ID)) 
				{
					elementoBuscado=actual.getDatos();
				}
				actual=actual.getSiguiente();
			}

		}
		else {
			return null;
		}
		return elementoBuscado;

	}
	
	public Nodo<X, Z> BuscarNodo(X ID) {

		Nodo<X, Z> actual = nodoInicial;
		Nodo<X, Z> Buscado =null;
		if (actual!=null) {
			while (actual.getSiguiente()!=null) 
			{
				if (actual.darID().equals(ID)) 
				{
					Buscado=actual;
				}
				actual=actual.getSiguiente();
			}
		}
		else
		{
			return null;
		}
		return Buscado;
	}

	@Override
	public void limpiarLista() {
		if (nodoInicial!=null) {
			Nodo<X, Z> actual = nodoFinal;
			while (actual.getAnterior()!=null) 
			{
				actual.getAnterior().setSiguiente(null);
				actual.setAnterior(null);
				actual=actual.getAnterior();
			}
		}




	}

	@Override
	public void agregarDespues(X ID, Z pComparendo) {
		// TODO Auto-generated method stub
		Nodo<X, Z> nuevo = new Nodo< X, Z>(pComparendo);
		Nodo<X, Z> siguienteDeBucado= 	BuscarNodo(ID).getSiguiente();

		BuscarNodo(ID).setSiguiente(nuevo);
		siguienteDeBucado.setAnterior(nuevo);
		nuevo.setAnterior(BuscarNodo(ID));
		nuevo.setSiguiente(siguienteDeBucado);

	}

	@Override
	public void agregarPrimero(Z pComparendo) {
		Nodo<X, Z> nuevo = new Nodo< X, Z>(pComparendo);
		Nodo<X, Z> primero = nodoInicial;
		if (nodoInicial!=null) {
			primero.setAnterior(nuevo);
			nuevo.setSiguiente(primero);
			nodoInicial= nuevo; 

		}else {
			nodoInicial=nuevo;
			nodoInicial.setAnterior(null);

		}
	}

	@Override
	public void agregarUltimo(Z pComparendo) {
		// TODO Auto-generated method stub
		Nodo<X, Z> nuevo = new Nodo< X, Z>(pComparendo);
		nodoFinal.setSiguiente(nuevo);
		nuevo.setAnterior(nodoFinal);
		nodoFinal= nuevo;

	}

	@Override
	public void removerPrimero() {
		if (nodoInicial!=null) {
			Nodo<X, Z>	nuevoPrimero=nodoInicial.getSiguiente();
			nodoInicial.setSiguiente(null);
			nuevoPrimero.setAnterior(null);
			nodoInicial=nuevoPrimero;
		}

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
