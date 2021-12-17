package main;

import org.hibernate.Session;

import dao.ConfigHibernate;
import vistas.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
		
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
		
		ch.cerrarSession();
	}

}
