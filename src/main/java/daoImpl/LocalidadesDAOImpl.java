package daoImpl;

import org.hibernate.Session;

import dao.ConfigHibernate;
import dao.LocalidadesDAO;
import entidades.Localidades;

public class LocalidadesDAOImpl implements LocalidadesDAO{

	
	
	public void insert(Localidades localidad) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(localidad);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}

}
