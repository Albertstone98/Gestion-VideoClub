package daoImpl;

import org.hibernate.Session;

import dao.ConfigHibernate;
import dao.SexoDAO;
import entidades.Sexo;

public class SexoDAOImpl implements SexoDAO{

	public void insert(Sexo sexo) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	    session.beginTransaction();
	    session.save(sexo);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}

}
