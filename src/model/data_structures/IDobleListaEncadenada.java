package model.data_structures;



public interface IDobleListaEncadenada <Z extends Iterable<Z>>   { 

	public int darTamaño();
	
	public Z darPrimerElemento();// metodo para instertar dato como primero de la lista.
	
	public Z darUltimoElemento(); // metodo para insertar dato al final de la lista.
	public Z darElemento();
	
	public Z BuscarElemneto(String ID);
	
	public void limpiarLista(); // metodo para instertar en cualcquier otra posiscion
	
	public void agregarDespues(Z ID); // metodo para agregar despues de cierto objeto
	
	public void agregarPrimero(Z pComparendo);// agrega comp primer objeto de la lista
	
	public void agregarUltimo(Z nuevoComparendo); //agrega como ultimo  objeto de la lista
	
	public void removerPrimero(); // remueve el primer objeto de la lista
	
	
	public void removerUltimo();// remueve el ultimo objeto de la lista
	
	public void remover(Z ID); // remueve un objeto especifico de la lista

	

	

}
