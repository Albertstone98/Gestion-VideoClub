package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.ConfigHibernate;
import images.ImagenFondo;

import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
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
	}
	
	public void ColocarPanel()
	{
		contentPane = new ImagenFondo();
		setContentPane(contentPane);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	}
}
