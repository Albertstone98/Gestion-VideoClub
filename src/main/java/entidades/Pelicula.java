package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Peliculas")
public class Pelicula implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idPelicula")
	private int id;
	
	@Column(name="nombrePelicula")
	private String nombre;

	public Pelicula() {}
	
	
	public Pelicula(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", nombre=" + nombre + "]";
	}
		
}
