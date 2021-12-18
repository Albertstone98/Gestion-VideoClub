package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class G�neroFilm implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idGenero")
	private int idGenero;
	
	@Column(unique=true)
	private String descripcion;
	
	public G�neroFilm() {}

	public G�neroFilm(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "G�neroFilm [idGenero=" + idGenero + ", descripcion=" + descripcion + "]";
	}
}
