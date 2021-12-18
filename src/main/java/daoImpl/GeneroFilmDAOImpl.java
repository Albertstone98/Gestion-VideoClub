package daoImpl;

import org.hibernate.Session;

import dao.ConfigHibernate;
import dao.GeneroFilmDAO;
import entidades.GéneroFilm;

public class GeneroFilmDAOImpl implements GeneroFilmDAO{

	public void insert(GéneroFilm genero) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(genero);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
}
