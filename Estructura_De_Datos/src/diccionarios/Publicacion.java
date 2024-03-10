package diccionarios;

import java.time.LocalDate;

public class Publicacion {
	
	private String titulo;
	private String autor;
	private LocalDate fechaPublicacion;
	
	public Publicacion(String titulo, String autor, LocalDate fechaPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", autor=" + autor + ", fechaPublicacion=" + fechaPublicacion + "]";
	}
	

}
