package main;

import java.time.LocalDate;

import diccionarios.GestorPublicaciones;
import diccionarios.Publicacion;

public class App {

	public static void main(String[] args) {
		/*
		 * Creamos un Objeto Tipo GestorPublicaciones
		 * - Al igual que hay tipo String, tipo int
		 * 
		 * Este es tipo GestorPublicaciones
		 */
		GestorPublicaciones gestionPublicaciones = new GestorPublicaciones();
		
		gestionPublicaciones.cargaExamen(); // cargar datos de prueba
		
		gestionPublicaciones.removeByAutor("Nieves");
		
		gestionPublicaciones.showPublicacion();
		
	}

}
