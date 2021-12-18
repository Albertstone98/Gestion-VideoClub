package daoImpl;

import org.hibernate.Session;

import dao.ClasificacionDAO;
import dao.ConfigHibernate;
import entidades.Clasificacion;

public class ClasificacionDAOImpl implements ClasificacionDAO{

	public void insert(Clasificacion clasificacion) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(clasificacion);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}

}
