package libroPaginaComposicion;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int añoPublicacion;
	private ArrayList<Pagina> paginas;
	private int contadorPagina;


	/**
	 * @param titulo
	 * @param isbn
	 * @param autor
	 * @param añoPublicacion
	 */
	public Libro(String titulo, long isbn, String autor, int añoPublicacion) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.paginas = new ArrayList<Pagina>();
	}
	
	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * @return el isbn
	 */
	public long getIsbn() {
		return isbn;
	}
	
	/**
	 * @param isbn el isbn a establecer
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @return el autor
	 */
	
	public String getAutor() {
		return autor;
	}
	
	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * @return el añoPublicacion
	 */
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	
	/**
	 * @param añoPublicacion el añoPublicacion a establecer
	 */
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	public void añadirPagina(String pagina) {
		paginas.add(new Pagina(pagina, ++contadorPagina));
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion
				+ "]" + paginas;
	}
	
	
}
