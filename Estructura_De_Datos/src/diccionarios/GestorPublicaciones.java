package diccionarios;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;

public class GestorPublicaciones {

	private HashMap<String, Publicacion> publicaciones; // Solo lo estamos declarando

	public GestorPublicaciones() {
		super();
		// Inicializamos
		this.publicaciones = new HashMap<>();
	}

	public Boolean addPublicacion(Publicacion publicacion) {
		// Si publicaion = null
		if (publicacion != null) {
			if (this.publicaciones.put(publicacion.getTitulo(), publicacion) != null) {
				return true;
			}
		}
		return false;
	}

	public Boolean removePubli(String titulo) {
		// Vemos si esta
		if (this.publicaciones.containsKey(titulo)) {
			// Si esta vamos a eliminarlo
			return this.publicaciones.remove(titulo) != null; // Retorna lo eliminado
		}
		return false;
	}

	public Boolean removeByAutor(String autor) {

		Iterator<String> iterator = this.publicaciones.keySet().iterator();

		// [ *El hoobit, Cenicienta, como ser Rico ]

		while (iterator.hasNext()) {
			String titulo = iterator.next(); // hemos cogido la Clave actual

			Publicacion publicacion1 = this.publicaciones.get(titulo);
			String autorPublicacion = publicacion1.getAutor();

			if (autorPublicacion.equalsIgnoreCase(autor)) {
				iterator.remove();
			}

		}
		return false;
	}

	public void showPublicacion() {
//		System.out.println(this.publicaciones);
		for (String titulo : this.publicaciones.keySet()) {
			System.out.println(titulo + ": " + this.publicaciones.get(titulo));
			System.out.println();
		}
	}

	public void cargaExamen() {
		addPublicacion(new Publicacion("El Hobbit", "Sabrina", LocalDate.of(2024, 10, 12)));
		addPublicacion(new Publicacion("Rayo MAcQueen", "Nieves", LocalDate.of(2024, 10, 12)));
		addPublicacion(new Publicacion("Snow incoming", "Nieves", LocalDate.of(2024, 10, 12)));
		addPublicacion(new Publicacion("Cenicientas", "Adelaida", LocalDate.of(2024, 10, 12)));
		addPublicacion(new Publicacion("Cenicientas2", "Adelaida", LocalDate.of(2024, 10, 15)));
	}

}
