package model.data_structures;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListaDobleEncadenada implements IDobleListaEncadenada{

	private int tama�o;

	private Comparendo primero;

	private ArrayList listaComparendos;

	public ListaDobleEncadenada() {
		primero = null;
		tama�o=0;
		listaComparendos= new ArrayList<>();

	}

	@Override
	public int darTama�o() {
		// da numero de elementos en la lista
		return tama�o;
	}

	@Override
	public String darPrimerElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darUltimoElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BuscarElemneto(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void limpiarLista() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarDespues(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarPrimero(Comparendo pComparendo) {
		if (primero== null) {
			primero= pComparendo;

		}else {
			primero.CambiarAnterior(pComparendo);
			pComparendo.CambiarSiguiente(primero);
			pComparendo.CambiarAnterior(null);
			primero=pComparendo;
		}
		tama�o++;
	}

	@Override
	public void agregarUltimo(Comparendo nuevoComparendo) {
		Comparendo actual = primero;

		while(actual.darSiguiente()!=null){
			actual=actual.darSiguiente();
		}
		actual.CambiarSiguiente(nuevoComparendo);
		nuevoComparendo.CambiarAnterior(actual);

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
	public void remover(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
