package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Peliculas")
public class Peliculas implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codPelicula")
	private int codPelicula;
	
	private String titulo;
	
	@ManyToOne
	@JoinColumn(name="idGenero")
	private G�neroFilm genero;
	
	private int anio;
	private String duraci�n;
	private String director;
	private String productor;
	private String descripci�n;
	
	@ManyToOne
	@JoinColumn(name="idClasificacion")
	private Clasificacion clasificaci�n;
	
	private byte[] imagen;

	public Peliculas() {}
	
	public Peliculas(String titulo, G�neroFilm genero, int anio, String duraci�n, String director, String productor,
			String descripci�n, Clasificacion clasificaci�n, byte[] imagen) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
		this.duraci�n = duraci�n;
		this.director = director;
		this.productor = productor;
		this.descripci�n = descripci�n;
		this.clasificaci�n = clasificaci�n;
		this.imagen = imagen;
	}

	public int getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(int codPelicula) {
		this.codPelicula = codPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public G�neroFilm getGenero() {
		return genero;
	}

	public void setGenero(G�neroFilm genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDuraci�n() {
		return duraci�n;
	}

	public void setDuraci�n(String duraci�n) {
		this.duraci�n = duraci�n;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public Clasificacion getClasificaci�n() {
		return clasificaci�n;
	}

	public void setClasificaci�n(Clasificacion clasificaci�n) {
		this.clasificaci�n = clasificaci�n;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
