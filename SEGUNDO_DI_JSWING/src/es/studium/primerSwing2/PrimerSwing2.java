package es.studium.primerSwing2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimerSwing2 {
	JFrame ventanaJ;
	JButton miBoton;
	//constructor
	public PrimerSwing2()
	{
		JFrame ventanaJ = new JFrame("Ejemplo2");
		ventanaJ.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		for(int i=0;i<10;i++)
		{
		ventanaJ.add(new JButton("Componente "+i));
		}
		ventanaJ.setLocationRelativeTo(null);
		ventanaJ.setSize(400,300);
		ventanaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaJ.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimerSwing2();
	}

}
