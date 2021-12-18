package main;

import javax.swing.JOptionPane;

import dao.ConfigHibernate;
import entidades.Clasificacion;
import entidades.Estado;
import entidades.G�neroFilm;
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
			//Si puedo establecer la Configuraci�n de Hibernate...
				//Entonces abro la ventana
			ch = new ConfigHibernate();
			JOptionPane.showMessageDialog(null, "Conexi�n Establecida");
			
			//Seteo los primeros datos de las Tablas
			setearDatos();
			
			VentanaPrincipal frame = new VentanaPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			//Caso contrario...
				//Muestro mensaje de error y no contin�o
			JOptionPane.showMessageDialog(null, "Error en la Conexi�n");
		}	
	}
	
	public static void setearDatos() {
		LocalidadesNegocio locNeg = new LocalidadesNegocioImpl();
		GeneroFilmNegocio genFilmNeg = new GeneroFilmNegocioImpl();
		ClasificacionNegocio clasNeg = new ClasificacionNegocioImpl();
		SexoNegocio sNeg = new SexoNegocioImpl();
		EstadoNegocio eNeg = new EstadoNegocioImpl();
		
		try {
			//Cargo los G�neros
			Estado e1 = new Estado("Disponible");
				eNeg.insert(e1);
			Estado e2 = new Estado("Alquilado");
				eNeg.insert(e2);
			
			//Cargo los G�neros
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
			Localidades loc1 = new Localidades("Bel�n de Escobar");
				locNeg.insert(loc1);
			Localidades loc2 = new Localidades("Gar�n");
				locNeg.insert(loc2);
			Localidades loc3 = new Localidades("Ingeniero Maschwitz");
				locNeg.insert(loc3);
			Localidades loc4 = new Localidades("Matheu");
				locNeg.insert(loc4);
			Localidades loc5 = new Localidades("Maquinista Savio");
				locNeg.insert(loc5);
			Localidades loc6 = new Localidades("Loma Verde");
				locNeg.insert(loc6);
				
			//Cargo los G�neros de las Peliculas
			G�neroFilm genero1 = new G�neroFilm("Acci�n");
				genFilmNeg.insert(genero1);
			G�neroFilm genero2 = new G�neroFilm("Aventura");
				genFilmNeg.insert(genero2);
			G�neroFilm genero3 = new G�neroFilm("Ciencia Ficci�n");
				genFilmNeg.insert(genero3);
			G�neroFilm genero4 = new G�neroFilm("Comedia");
				genFilmNeg.insert(genero4);
			G�neroFilm genero5 = new G�neroFilm("No-Ficci�n");
				genFilmNeg.insert(genero5);
			G�neroFilm genero6 = new G�neroFilm("Drama");
				genFilmNeg.insert(genero6);
			G�neroFilm genero7 = new G�neroFilm("Fantas�a");
				genFilmNeg.insert(genero7);
			G�neroFilm genero8 = new G�neroFilm("Musical");
				genFilmNeg.insert(genero8);
			G�neroFilm genero9 = new G�neroFilm("Suspenso");
				genFilmNeg.insert(genero9);
			G�neroFilm genero10 = new G�neroFilm("Terror");
				genFilmNeg.insert(genero10);
				
			JOptionPane.showMessageDialog(null, "Datos Preliminares cargados");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Datos Preliminares cargados");
		}
	}

}
