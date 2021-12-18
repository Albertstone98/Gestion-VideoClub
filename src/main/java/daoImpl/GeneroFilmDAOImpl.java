package daoImpl;

import org.hibernate.Session;

import dao.ConfigHibernate;
import dao.GeneroFilmDAO;
import entidades.G�neroFilm;

public class GeneroFilmDAOImpl implements GeneroFilmDAO{

	public void insert(G�neroFilm genero) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(genero);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
