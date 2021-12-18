package negocioImpl;

import dao.GeneroFilmDAO;

import daoImpl.GeneroFilmDAOImpl;

import entidades.G�neroFilm;
import negocio.GeneroFilmNegocio;

public class GeneroFilmNegocioImpl implements GeneroFilmNegocio{

	GeneroFilmDAO genDAO = new GeneroFilmDAOImpl();
	
	public void insert(G�neroFilm genero) {
		if(!genero.getDescripcion().equals("")) {
			genDAO.insert(genero);
		}
	}

}
