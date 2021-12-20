package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.ConfigHibernate;
import images.ImagenFondo;

import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private static DefaultListModel<entidades.Peliculas> listModel = new DefaultListModel<entidades.Peliculas>();
	
	public VentanaPrincipal()
	{		
		CrearVentana();
		Resolucion();
		IniciarComponentes();
	}
	

	public void CrearVentana()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setTitle("Gestión VideoClub 1.0");
		setIconImage(new ImageIcon(getClass().getResource("/images/icono JR.png")).getImage());
	}
	
	public void Resolucion()
	{
		setBounds(440, 150, 1150, 750);
	}
	
	public void IniciarComponentes()
	{
		ColocarPanel();
		ColocarMenu();
	}
	
	public void ColocarPanel()
	{
		contentPane = new ImagenFondo();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	}
	
	public void ColocarMenu()
	{
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				agregarPelicula panel = new agregarPelicula();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnPeliculas.add(mntmAgregar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		/*mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				ListarPeliculas panel = new ListarPeliculas();
				panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});*/
		mnPeliculas.add(mntmListar);
	}
}
