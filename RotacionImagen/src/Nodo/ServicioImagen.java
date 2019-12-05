/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: ProcesadorImagen.java 1207 2019-05-05 07:00:03Z s.n $
 * Universidad ICESI (Cali - Colombia)
 * Licenciado bajo el esquema Academic Free License version 2.1 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package Nodo;


/**
 * Representa el delegado de negocio con los servicios de la aplicación.
 */
public class ServicioImagen {
	/**
	 * Dependencia a repositorio.
	 */
	private RepositorioImagen repositorioImagen;
	/**
	 * Dependencia a algoritmos matriz.
	 */
	private AlgoritmosMatriz algoritmos;
	/**
	 * Constructor con la instanciación de las dependencias.
	 */
	public ServicioImagen() {
		repositorioImagen = new NasaRepositorio();
		algoritmos = new TransformacionMatriz();
	}
	/**
	 * Servicio para rotar imagen.
	 * @param ruta con la dirección de la imagen a rotar.
	 * @param phi ángulo de rotación.
	 */
	public void rotarImagen(String ruta, double phi) {
		repositorioImagen.cargarImagen(ruta);
		repositorioImagen.guardarImagen(
				algoritmos.rotateMatrizByAngle(repositorioImagen.darImagen(), phi)
				,"C:/Users/jagn1/git/RotacionImagenes/RotacionImagen/img/kamino2.png");
		repositorioImagen.liberarRecursos();
	}
	
}