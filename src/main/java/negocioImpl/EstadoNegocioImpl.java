package negocioImpl;

import dao.EstadoDAO;
import daoImpl.EstadoDAOImpl;
import entidades.Estado;
import negocio.EstadoNegocio;

public class EstadoNegocioImpl implements EstadoNegocio {

	EstadoDAO eDAO = new EstadoDAOImpl();
	
	public void insert(Estado estado) {
		if(!estado.getDescripcion().equals("")) {
			eDAO.insert(estado);
		}
	}

}
