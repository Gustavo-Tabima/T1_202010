package model.data_structures;

import java.util.Iterator;

public interface IDobleListaEncadenada  extends Iterable { 

	public int darTamaño();
	
	public String darPrimerElemento();// metodo para instertar dato como primero de la lista.
	
	public String darUltimoElemento(); // metodo para insertar dato al final de la lista.
	public String darElemento();
	
	public String BuscarElemneto(String ID);
	
	public void limpiarLista(); // metodo para instertar en cualcquier otra posiscion
	
	public void agregarDespues(String ID); // metodo para agregar despues de cierto objeto
	
	public void agregarPrimero(Comparendo pComparendo);// agrega comp primer objeto de la lista
	
	public void agregarUltimo(Comparendo nuevoComparendo); //agrega como ultimo  objeto de la lista
	
	public void removerPrimero(); // remueve el primer objeto de la lista
	
	
	public void removerUltimo();// remueve el ultimo objeto de la lista
	
	public void remover(String ID); // remueve un objeto especifico de la lista

	

}
