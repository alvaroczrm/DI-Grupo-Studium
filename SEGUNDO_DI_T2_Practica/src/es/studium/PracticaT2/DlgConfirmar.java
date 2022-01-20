package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class DlgConfirmar extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfirmar dialog = new DlgConfirmar();
			dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfirmar() {
		setBounds(100, 100, 145, 128);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("\u00BFSeguro?");
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			contentPanel.add(btnAceptar);
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int id = Integer.parseInt(JFBaja.txtid.getText());
					OperadorCrud.deleteArticulo(id);
					setVisible(false);
				}
			});
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			contentPanel.add(btnCancelar);
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					JFBaja.txtid.setText("");
				}
			});
		}
	}

}
