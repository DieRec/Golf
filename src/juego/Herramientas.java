package juego;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Herramientas {
	/**
	 * Transforma un de grados a radianes.
	 * @param grados El a transformar, medido en grados.
	 * @return El valor del medido en radianes.
	 */
	public static double radianes(double grados)
	{
		return (grados/360.0)*(2*Math.PI);
	}
	
	/**
	 * Transforma un de radianes a grados
	 * @param radianes El medido en radianes
	 * @return El medido en grados
	 */
	public static double grados(double radianes)   
	{
		return radianes*360/(2*Math.PI);
	}

	/**
	 * Levanta una imagen desde el archivo dado y devuelve un objeto de tipo Image con la misma.
	 * @param archivo Nombre de archivo que contiene la imagen
	 * @return Un objeto Image con la imagen cargada
	 */
	public static Image cargarImagen(String archivo) 
	{
		return new ImageIcon(ClassLoader.getSystemResource(archivo)).getImage();
		//return new ImageIcon(archivo).getImage();
	}
	

}