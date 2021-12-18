package main;

import javax.swing.JOptionPane;

import dao.ConfigHibernate;
import entidades.Clasificacion;
import entidades.Estado;
import entidades.GéneroFilm;
import entidades.Localidades;
import entidades.Sexo;
import negocio.ClasificacionNegocio;
import negocio.EstadoNegocio;
import negocio.GeneroFilmNegocio;
import negocio.LocalidadesNegocio;
import negocio.SexoNegocio;
import negocioImpl.ClasificacionNegocioImpl;
import negocioImpl.EstadoNegocioImpl;
import negocioImpl.GeneroFilmNegocioImpl;
import negocioImpl.LocalidadesNegocioImpl;
import negocioImpl.SexoNegocioImpl;
import vistas.VentanaPrincipal;

public class Principal {

	static ConfigHibernate ch;
	
	public static void main(String[] args) {
		
		try {
			//Si puedo establecer la Configuración de Hibernate...
				//Entonces abro la ventana
			ch = new ConfigHibernate();
			JOptionPane.showMessageDialog(null, "Conexión Establecida");
			
			//Seteo los primeros datos de las Tablas
			setearDatos();
			
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			//Caso contrario...
				//Muestro mensaje de error y no continúo
			JOptionPane.showMessageDialog(null, "Error en la Conexión");
		}	
	}
	
	public static void setearDatos() {
		LocalidadesNegocio locNeg = new LocalidadesNegocioImpl();
		GeneroFilmNegocio genFilmNeg = new GeneroFilmNegocioImpl();
		ClasificacionNegocio clasNeg = new ClasificacionNegocioImpl();
		SexoNegocio sNeg = new SexoNegocioImpl();
		EstadoNegocio eNeg = new EstadoNegocioImpl();
		
		try {
			//Cargo los Géneros
			Estado e1 = new Estado("Disponible");
				eNeg.insert(e1);
			Estado e2 = new Estado("Alquilado");
				eNeg.insert(e2);
			
			//Cargo los Géneros
			Sexo s1 = new Sexo("Masculino");
				sNeg.insert(s1);
			Sexo s2 = new Sexo("Femenino");
				sNeg.insert(s2);
			Sexo s3 = new Sexo("Otro");
				sNeg.insert(s3);
			
			//Cargo las Clasificaciones
			Clasificacion clas1 = new Clasificacion("G");
				clasNeg.insert(clas1);
			Clasificacion clas2 = new Clasificacion("PG");
				clasNeg.insert(clas2);
			Clasificacion clas3 = new Clasificacion("PG-13");
				clasNeg.insert(clas3);
			Clasificacion clas4 = new Clasificacion("R");
				clasNeg.insert(clas4);
			Clasificacion clas5 = new Clasificacion("NC-17");
				clasNeg.insert(clas5);
			
			//Cargo las Localidades del Partido de Escobar
			Localidades loc1 = new Localidades("Belén de Escobar");
				locNeg.insert(loc1);
			Localidades loc2 = new Localidades("Garín");
				locNeg.insert(loc2);
			Localidades loc3 = new Localidades("Ingeniero Maschwitz");
				locNeg.insert(loc3);
			Localidades loc4 = new Localidades("Matheu");
				locNeg.insert(loc4);
			Localidades loc5 = new Localidades("Maquinista Savio");
				locNeg.insert(loc5);
			Localidades loc6 = new Localidades("Loma Verde");
				locNeg.insert(loc6);
				
			//Cargo los Géneros de las Peliculas
			GéneroFilm genero1 = new GéneroFilm("Acción");
				genFilmNeg.insert(genero1);
			GéneroFilm genero2 = new GéneroFilm("Aventura");
				genFilmNeg.insert(genero2);
			GéneroFilm genero3 = new GéneroFilm("Ciencia Ficción");
				genFilmNeg.insert(genero3);
			GéneroFilm genero4 = new GéneroFilm("Comedia");
				genFilmNeg.insert(genero4);
			GéneroFilm genero5 = new GéneroFilm("No-Ficción");
				genFilmNeg.insert(genero5);
			GéneroFilm genero6 = new GéneroFilm("Drama");
				genFilmNeg.insert(genero6);
			GéneroFilm genero7 = new GéneroFilm("Fantasía");
				genFilmNeg.insert(genero7);
			GéneroFilm genero8 = new GéneroFilm("Musical");
				genFilmNeg.insert(genero8);
			GéneroFilm genero9 = new GéneroFilm("Suspenso");
				genFilmNeg.insert(genero9);
			GéneroFilm genero10 = new GéneroFilm("Terror");
				genFilmNeg.insert(genero10);
				
			JOptionPane.showMessageDialog(null, "Datos Preliminares cargados");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Datos Preliminares cargados");
		}
	}

}
