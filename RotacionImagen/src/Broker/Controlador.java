package Broker;

public class Controlador {
	
	private Balanceador balanceador;
	
	private Clientes repos;
	
	public void guardarInfoCliente(String ubi){
		repos.registrarUbicacion(ubi);
	}
	
	public String obtenerUbicaciones(){
		return balanceador.obtenerUbicacionBalanceada();
	}

}
