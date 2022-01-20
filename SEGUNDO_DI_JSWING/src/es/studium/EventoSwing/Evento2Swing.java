package es.studium.EventoSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Evento2Swing extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JToggleButton boton;

	public Evento2Swing() {
		setLayout(new FlowLayout());
		boton = new JToggleButton("Activar");
		add(boton);
		boton.addActionListener(this);
		setSize(150, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (boton.isSelected()) {
			boton.setText("Desactivar");
		} else {
			boton.setText("Activar");
		}
	}

	public static void main(String[] args) {
		new Evento2Swing();
	}
}
