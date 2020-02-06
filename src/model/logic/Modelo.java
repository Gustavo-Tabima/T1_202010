package model.logic;

import model.data_structures.ArregloDinamico;
import model.data_structures.DobleListaEncadenada;
import model.data_structures.IArregloDinamico;
import model.data_structures.IDobleListaEncadenada;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo <X , Z extends Iterable<Z>> {
	/**
	 * Atributos del modelo del mundo
	 */
	private IArregloDinamico datos;
	private IDobleListaEncadenada datoscadena;	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		datos = new ArregloDinamico(7);
		datoscadena = new DobleListaEncadenada(4);
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
		datoscadena = new DobleListaEncadenada(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datoscadena.darTamano();
		
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(Z dato)
	{	
		datoscadena.agregarUltimo(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public X buscar(X dato)
	{
		return (X) datoscadena.BuscarElemento(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public void eliminar(Z dato)
	{
		 datoscadena.remover(dato);
	}


}
