package negocioImpl;

import dao.SexoDAO;
import daoImpl.SexoDAOImpl;
import entidades.Sexo;
import negocio.SexoNegocio;

public class SexoNegocioImpl implements SexoNegocio{

	SexoDAO sDAO = new SexoDAOImpl();
	
	public void insert(Sexo sexo) {
		if(!sexo.getDescripcion().equals("")) {
			sDAO.insert(sexo);
		}
	}

}
