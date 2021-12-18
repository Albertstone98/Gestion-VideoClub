package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Localidades")
public class Localidades implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idLocalidad")
	private int idLocalidad;
	
	@Column(unique=true)
	private String descripcion;

	public Localidades() {}
	
	public Localidades(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Localidades [idLocalidad=" + idLocalidad + ", descripcion=" + descripcion + "]";
	}
}
