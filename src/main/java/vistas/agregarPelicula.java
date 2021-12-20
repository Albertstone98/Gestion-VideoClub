package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import images.ImagenFondo;

public class agregarPelicula extends JPanel {

	private static final long serialVersionUID = 1L;

	private DefaultListModel<entidades.Peliculas> listModel;
	private JTextField Txtcodigo;
	private JTextField TxtTitulo;
	private JTextField TxtDescripcion;
	private JTextField TxtAnio;
	private JTextField TxtDuracion;
	private JTextField TxtDirector;
	private JTextField TxtProductor;
	private JTextField TxtImagen;
	
	private JComboBox cbClasificacion;
	private JComboBox cbGenero;
	
	private JButton btnBuscar;
	private JButton btnRegistrar;
	
	public agregarPelicula() {
		super();
		inicializar();
	}

	public void inicializar()
	{
		setLayout(null);
		
		JPanel panel = new ImagenFondo();
		add(panel);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1150, 750);
		
		JLabel lblNewLabel = new JLabel("CodPelicula:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(131, 97, 100, 40);
		panel.add(lblNewLabel);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblAo.setForeground(Color.WHITE);
		lblAo.setBounds(131, 439, 100, 40);
		panel.add(lblAo);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDescripcin.setForeground(Color.WHITE);
		lblDescripcin.setBounds(131, 251, 100, 40);
		panel.add(lblDescripcin);
		
		JLabel lblDirector = new JLabel("Director:");
		lblDirector.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDirector.setForeground(Color.WHITE);
		lblDirector.setBounds(605, 97, 100, 40);
		panel.add(lblDirector);
		
		JLabel lblProductor = new JLabel("Productor:");
		lblProductor.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblProductor.setForeground(Color.WHITE);
		lblProductor.setBounds(605, 171, 100, 40);
		panel.add(lblProductor);
		
		JLabel lblDuracin = new JLabel("Duraci\u00F3n:");
		lblDuracin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDuracin.setForeground(Color.WHITE);
		lblDuracin.setBounds(131, 514, 100, 40);
		panel.add(lblDuracin);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTtulo.setForeground(Color.WHITE);
		lblTtulo.setBounds(131, 171, 100, 40);
		panel.add(lblTtulo);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblImagen.setForeground(Color.WHITE);
		lblImagen.setBounds(605, 403, 100, 40);
		panel.add(lblImagen);
		
		JLabel lblClasificacin = new JLabel("Clasificaci\u00F3n:");
		lblClasificacin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblClasificacin.setForeground(Color.WHITE);
		lblClasificacin.setBounds(605, 251, 100, 40);
		panel.add(lblClasificacin);
		
		JLabel lblGnero = new JLabel("G\u00E9nero:");
		lblGnero.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblGnero.setForeground(Color.WHITE);
		lblGnero.setBounds(605, 326, 100, 40);
		panel.add(lblGnero);
		
		JLabel lblAgregarPelcula = new JLabel("Agregar Pel\u00EDcula");
		lblAgregarPelcula.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAgregarPelcula.setForeground(Color.WHITE);
		lblAgregarPelcula.setBounds(456, 13, 245, 40);
		panel.add(lblAgregarPelcula);
		
		Txtcodigo = new JTextField();
		Txtcodigo.setEditable(false);
		Txtcodigo.setBounds(276, 98, 200, 40);
		panel.add(Txtcodigo);
		Txtcodigo.setColumns(10);
		
		TxtTitulo = new JTextField();
		TxtTitulo.setBounds(276, 172, 200, 40);
		panel.add(TxtTitulo);
		TxtTitulo.setColumns(10);
		
		TxtDescripcion = new JTextField();
		TxtDescripcion.setBounds(276, 251, 200, 157);
		panel.add(TxtDescripcion);
		TxtDescripcion.setColumns(10);
		
		TxtAnio = new JTextField();
		TxtAnio.setBounds(276, 440, 200, 40);
		panel.add(TxtAnio);
		TxtAnio.setColumns(10);
		
		TxtDuracion = new JTextField();
		TxtDuracion.setBounds(276, 515, 200, 40);
		panel.add(TxtDuracion);
		TxtDuracion.setColumns(10);
		
		TxtDirector = new JTextField();
		TxtDirector.setBounds(737, 98, 200, 40);
		panel.add(TxtDirector);
		TxtDirector.setColumns(10);
		
		TxtProductor = new JTextField();
		TxtProductor.setBounds(737, 181, 200, 40);
		panel.add(TxtProductor);
		TxtProductor.setColumns(10);
		
		cbClasificacion = new JComboBox();
		cbClasificacion.setBounds(737, 261, 200, 40);
		panel.add(cbClasificacion);
		
		cbGenero = new JComboBox();
		cbGenero.setBounds(737, 336, 200, 40);
		panel.add(cbGenero);
		
		TxtImagen = new JTextField();
		TxtImagen.setEditable(false);
		TxtImagen.setBounds(737, 404, 200, 40);
		panel.add(TxtImagen);
		TxtImagen.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(964, 412, 97, 25);
		panel.add(btnBuscar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(789, 544, 97, 25);
		panel.add(btnRegistrar);
		
	}
	
	public JComboBox getCbClasificacion() {
		return cbClasificacion;
	}

	public void setCbClasificacion(JComboBox cbClasificacion) {
		this.cbClasificacion = cbClasificacion;
	}

	public JComboBox getCbGenero() {
		return cbGenero;
	}

	public void setCbGenero(JComboBox cbGenero) {
		this.cbGenero = cbGenero;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JTextField getTxtcodigo() {
		return Txtcodigo;
	}

	public void setTxtcodigo(JTextField txtcodigo) {
		Txtcodigo = txtcodigo;
	}

	public JTextField getTxtTitulo() {
		return TxtTitulo;
	}

	public void setTxtTitulo(JTextField txtTitulo) {
		TxtTitulo = txtTitulo;
	}

	public JTextField getTxtDescripcion() {
		return TxtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		TxtDescripcion = txtDescripcion;
	}

	public JTextField getTxtAnio() {
		return TxtAnio;
	}

	public void setTxtAnio(JTextField txtAnio) {
		TxtAnio = txtAnio;
	}

	public JTextField getTxtDuracion() {
		return TxtDuracion;
	}

	public void setTxtDuracion(JTextField txtDuracion) {
		TxtDuracion = txtDuracion;
	}

	public JTextField getTxtDirector() {
		return TxtDirector;
	}

	public void setTxtDirector(JTextField txtDirector) {
		TxtDirector = txtDirector;
	}

	public JTextField getTxtProductor() {
		return TxtProductor;
	}

	public void setTxtProductor(JTextField txtProductor) {
		TxtProductor = txtProductor;
	}

	public JTextField getTxtImagen() {
		return TxtImagen;
	}

	public void setTxtImagen(JTextField txtImagen) {
		TxtImagen = txtImagen;
	}

	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public void setDefaultListModel(DefaultListModel<entidades.Peliculas> listModelRecibido)
	{
		this.listModel = listModelRecibido;
	}
}
