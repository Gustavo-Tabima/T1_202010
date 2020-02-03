package model.data_structures;

import java.util.Date;

public class Comparendo {

	private Comparendo siguiente;

	private Comparendo anterior;

	private int idComparendo;

	private Date fechaHora;

	private String claseVehiculo;

	private String tipoServicio;

	private String infraccion;

	private String DescripcionInfraccion;

	private String localidad;

	public Comparendo(int nIdComparendo, Date nFechaHora, String nClaseVehi, String nTipoServicio, String nInfraccion, String nDescripcionInfraccion, String nLocalidad){

		idComparendo= nIdComparendo;
		fechaHora=nFechaHora;
		claseVehiculo=nClaseVehi;
		tipoServicio=nTipoServicio;
		infraccion=nInfraccion;
		DescripcionInfraccion=nDescripcionInfraccion;
		localidad=nLocalidad;
		siguiente=null;
		anterior=null;
	}


	public void CambiarSiguiente(Comparendo Sact) {
		// TODO Auto-generated method stub
		siguiente= Sact;

	}

	public void CambiarAnterior(Comparendo Aact) {
		// TODO Auto-generated method stub
		siguiente= Aact;

	}
	public Comparendo darSiguiente( )
	{
		return siguiente;
		
	}
	
	public Comparendo darAnterior(){
		return anterior;
	}
}
