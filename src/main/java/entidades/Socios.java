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
public class Socios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codPelicula")
	private int CodSocio;
	
	@Column(unique=true)
	private int dni;
	
	private String apellido;
	private String nombre;
	private Date fechaNac;
	
	@ManyToOne
	@JoinColumn(name="idSexo")
	private Sexo sexo;
	
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name="idLocalidad")
	private Localidades localidad;
	
	private int telefono;
	private String email;

	public Socios() {}

	public Socios(int dni, String apellido, String nombre, Date fechaNac, Sexo sexo, String direccion,
			Localidades localidad, int telefono, String email) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.email = email;
	}

	public int getCodSocio() {
		return CodSocio;
	}

	public void setCodSocio(int codSocio) {
		CodSocio = codSocio;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Localidades getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidades localidad) {
		this.localidad = localidad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
