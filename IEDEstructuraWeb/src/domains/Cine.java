package domains;

import java.util.List;

public class Cine {
	
	private Long id;
	private String nombre;
	private String direccion;
	private int numSalas;
	private double precio_entrada;
	private List<Pelicula> peliculasEsteCine;
	
	
	
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumSalas() {
		return numSalas;
	}
	public void setNumSalas(int numSalas) {
		this.numSalas = numSalas;
	}
	public double getPrecio_entrada() {
		return precio_entrada;
	}
	public void setPrecio_entrada(double precio_entrada) {
		this.precio_entrada = precio_entrada;
	}
	public List<Pelicula> getPeliculasEsteCine() {
		return peliculasEsteCine;
	}
	public void setPeliculasEsteCine(List<Pelicula> peliculasEsteCine) {
		this.peliculasEsteCine = peliculasEsteCine;
	}
	
	
	

}
