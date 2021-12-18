package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ejemplares implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="nroEjemplar")
	private int nroEjemplar;
	
	@ManyToOne
	@JoinColumn(name="idPelicula")
	private Peliculas pelicula;
	
	@ManyToOne
	@JoinColumn(name="idEstado")
	private Estado estado;
	
	public Ejemplares() {}

	public Ejemplares(Peliculas pelicula, Estado estado) {
		super();
		this.pelicula = pelicula;
		this.estado = estado;
	}

	public int getNroEjemplar() {
		return nroEjemplar;
	}

	public void setNroEjemplar(int nroEjemplar) {
		this.nroEjemplar = nroEjemplar;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
