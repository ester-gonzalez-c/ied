package domains;

/*Object Actor related to table actores in database*/
public class Actor {

	private Long id;
	private String nombreArtistico;
	private char genero;
	private int edad;
	
	
	//Getters and setters
	//Comentario para probar cambio de codigo
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreArtistico() {
		return nombreArtistico;
	}
	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
