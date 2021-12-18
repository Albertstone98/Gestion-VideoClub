package negocioImpl;

import dao.LocalidadesDAO;
import daoImpl.LocalidadesDAOImpl;
import entidades.Localidades;
import negocio.LocalidadesNegocio;

public class LocalidadesNegocioImpl implements LocalidadesNegocio{

	LocalidadesDAO lDAO = new LocalidadesDAOImpl();
	
	public void insert(Localidades localidad) {
		if(!localidad.getDescripcion().equals("")) {
			lDAO.insert(localidad);
		}
	}

}
