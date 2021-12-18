package entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Alquileres implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codAlquiler")
	private int codAlquiler;
	
	private Date fechaAlquiler;
	private Date fechaDevolucion;
	
	@ManyToOne
	@JoinColumn(name="codSocio")
	private Socios socio;
	
	@ManyToOne
	@JoinColumn(name="idPelicula")
	private Peliculas pelicula;
	
	@ManyToOne
	@JoinColumn(name="nroEjemplar")
	private Ejemplares ejemplar;
	
	public Alquileres() {}

	public Alquileres(Date fechaAlquiler, Date fechaDevolucion, Socios socio, Peliculas pelicula, Ejemplares ejemplar) {
		super();
		this.fechaAlquiler = fechaAlquiler;
		this.fechaDevolucion = fechaDevolucion;
		this.socio = socio;
		this.pelicula = pelicula;
		this.ejemplar = ejemplar;
	}

	public int getCodAlquiler() {
		return codAlquiler;
	}

	public void setCodAlquiler(int codAlquiler) {
		this.codAlquiler = codAlquiler;
	}

	public Date getFechaAlquiler() {
		return fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Socios getSocio() {
		return socio;
	}

	public void setSocio(Socios socio) {
		this.socio = socio;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public Ejemplares getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplares ejemplar) {
		this.ejemplar = ejemplar;
	}
	
}
