package model.data_structures;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListaDobleEncadenada <Z extends Iterable<Z>>implements IDobleListaEncadenada{

	private int tamaño;

	private Comparendo primero;

	private ArrayList listaComparendos;

	public ListaDobleEncadenada() {
		primero = null;
		tamaño=0;
		listaComparendos= new ArrayList<>();

	}

	@Override
	public int darTamaño() {
		// da numero de elementos en la lista
		return tamaño;
	}

	@Override
	public Z darPrimerElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z darUltimoElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z darElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Z BuscarElemneto(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void limpiarLista() {
		// TODO Auto-generated method stub

	}

	


	public void agregarPrimero(Comparendo pComparendo) {
		if (primero== null) {
			primero= pComparendo;

		}else {
			primero.CambiarAnterior(pComparendo);
			pComparendo.CambiarSiguiente(primero);
			pComparendo.CambiarAnterior(null);
			primero=pComparendo;
		}
		tamaño++;
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
	public void agregarDespues(Iterable ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarPrimero(Iterable pComparendo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarUltimo(Iterable nuevoComparendo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Iterable ID) {
		// TODO Auto-generated method stub
		
	}

	
	
}
