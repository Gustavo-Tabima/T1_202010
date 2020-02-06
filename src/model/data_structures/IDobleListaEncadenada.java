package model.data_structures;

public interface IDobleListaEncadenada <X, Z extends Iterable<Z>>   {

	public int darTamano();// metodo para dar tamaño

	public Z darPrimerElemento();// metodo para instertar dato como primero de la lista.

  public Z darUltimoElemento(); // metodo para insertar dato al final de la lista.

	public Z darElementoActual(); //Da el elemento Actual 

	public Z BuscarElemento(X ID);

	public void limpiarLista(); // metodo para instertar en cualcquier otra posiscion

	public void agregarDespues(X ID, Z pComparendo); // metodo para agregar despues de cierto objeto

	public void agregarPrimero(Z pComparendo); // agrega comp primer objeto de la lista

	public void agregarUltimo(Z pComparendo); //agrega como ultimo  objeto de la lista

	public void removerPrimero(); // remueve el primer objeto de la lista

	public void removerUltimo();// remueve el ultimo objeto de la lista

	public void remover(X ID); // remueve un objeto especifico de la lista

}
