package Broker;

public class Comunicacion {
	
	private Controlador controlador;
	
	public String retornarUbicacion(){
		return controlador.obtenerUbicaciones();
	}
	
	public void guardarUbicacionCliente(String ubi){
		controlador.guardarInfoCliente(ubi);
	}
	

}
