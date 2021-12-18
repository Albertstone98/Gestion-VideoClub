package negocioImpl;

import dao.ClasificacionDAO;
import daoImpl.ClasificacionDAOImpl;
import entidades.Clasificacion;
import negocio.ClasificacionNegocio;

public class ClasificacionNegocioImpl implements ClasificacionNegocio{

	ClasificacionDAO cDAO = new ClasificacionDAOImpl();
	
	public void insert(Clasificacion clasificacion) {
		if(!clasificacion.getDescripcion().equals("")) {
			cDAO.insert(clasificacion);
		}
	}

}
