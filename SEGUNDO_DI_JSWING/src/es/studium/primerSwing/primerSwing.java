package es.studium.primerSwing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class primerSwing extends JFrame
{
private static final long serialVersionUID = 1L;
// Constructor
Container panel;
JButton miBoton;
JFrame ventanaJ = new JFrame("Ejemplo 1");
public primerSwing()
{
	// Constantes y componentes (objetos)
	miBoton = new JButton("Aceptar");
	panel = ventanaJ.getContentPane();
	panel.add(miBoton);
	ventanaJ.setLocationRelativeTo(null);
	ventanaJ.setSize(200,100);
	ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventanaJ.setVisible(true);
	}
	public static void main(String args[])
	{
	new primerSwing();
	}
}
