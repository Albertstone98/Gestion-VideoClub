package images;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel{
	ImageIcon Imagen;
	
	public ImagenFondo()
	{
		super();
		Imagen = new ImageIcon(getClass().getResource("/images/1132.jpg"));
		setSize(Imagen.getIconWidth(),Imagen.getIconHeight());
	}
	
	protected void paintComponent (Graphics g)
	{
		Dimension d = getSize();
		g.drawImage(Imagen.getImage(),0,0,d.width,d.height,null);
		this.setOpaque(false);
		super.paintComponent(g);
	}
}
