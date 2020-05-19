package domains;

public class Pelicula {
	
	private Long id;
	private String nombre;
	private int duracion_mins;
	private String categoria;
	private boolean estaEnCine;
	private Director director;
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion_mins() {
		return duracion_mins;
	}
	public void setDuracion_mins(int duracion_mins) {
		this.duracion_mins = duracion_mins;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean isEstaEnCine() {
		return estaEnCine;
	}
	public void setEstaEnCine(boolean estaEnCine) {
		this.estaEnCine = estaEnCine;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	

}
