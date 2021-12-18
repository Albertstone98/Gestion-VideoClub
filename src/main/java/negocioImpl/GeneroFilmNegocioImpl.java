package negocioImpl;

import dao.GeneroFilmDAO;

import daoImpl.GeneroFilmDAOImpl;

import entidades.GéneroFilm;
import negocio.GeneroFilmNegocio;

public class GeneroFilmNegocioImpl implements GeneroFilmNegocio{

	GeneroFilmDAO genDAO = new GeneroFilmDAOImpl();
	
	public void insert(GéneroFilm genero) {
		if(!genero.getDescripcion().equals("")) {
			genDAO.insert(genero);
		}
	}

}
