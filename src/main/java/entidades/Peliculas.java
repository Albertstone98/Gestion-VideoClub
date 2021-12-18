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
	private GéneroFilm genero;
	
	private int anio;
	private String duración;
	private String director;
	private String productor;
	private String descripción;
	
	@ManyToOne
	@JoinColumn(name="idClasificacion")
	private Clasificacion clasificación;
	
	private byte[] imagen;

	public Peliculas() {}
	
	public Peliculas(String titulo, GéneroFilm genero, int anio, String duración, String director, String productor,
			String descripción, Clasificacion clasificación, byte[] imagen) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.anio = anio;
		this.duración = duración;
		this.director = director;
		this.productor = productor;
		this.descripción = descripción;
		this.clasificación = clasificación;
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

	public GéneroFilm getGenero() {
		return genero;
	}

	public void setGenero(GéneroFilm genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
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

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Clasificacion getClasificación() {
		return clasificación;
	}

	public void setClasificación(Clasificacion clasificación) {
		this.clasificación = clasificación;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
