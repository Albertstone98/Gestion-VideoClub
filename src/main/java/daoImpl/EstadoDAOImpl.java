package daoImpl;

import org.hibernate.Session;

import dao.ConfigHibernate;
import dao.EstadoDAO;
import entidades.Estado;

public class EstadoDAOImpl implements EstadoDAO {

	public void insert(Estado estado) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(estado);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
}
