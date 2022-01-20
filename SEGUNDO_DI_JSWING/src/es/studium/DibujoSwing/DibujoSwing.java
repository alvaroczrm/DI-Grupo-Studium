package es.studium.DibujoSwing;

import javax.swing.JPanel;

public class DibujoSwing extends JPanel {
	private static final long serialVersionUID = 1L;

	public DibujoSwing() {
		setTitle("Ejemplo de dibujo");
		add(new DibujoSwing());
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DibujoSwing();
	}
}
