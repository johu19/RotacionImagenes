package Broker;

import java.util.ArrayList;

public class Clientes {
	
	private ArrayList<String> ubicaciones;

	public ArrayList<String> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicaciones(ArrayList<String> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}
	
	public String getUbicacion(int i){
		return ubicaciones.get(i);
	}
	
	public void registrarUbicacion(String ubi){
		ubicaciones.add(ubi);
	}

}
