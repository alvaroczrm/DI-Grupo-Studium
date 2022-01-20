package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JFAltasArticulo extends JFrame {

	private JPanel contentPane;
	static JTextField txtDescripcion;
	static JTextField txtPrecio;
	static JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAltasArticulo frame = new JFAltasArticulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFAltasArticulo() {
		setResizable(false);
		setTitle("Altas articulo");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 272, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblArticuloDescripcion = new JLabel("Descripci\u00F3n");
		lblArticuloDescripcion.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		
		JLabel lblArticuloPrecio = new JLabel("Precio");
		lblArticuloPrecio.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 11));
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		
		JLabel lblArticuloCantidad = new JLabel("Cantidad");
		lblArticuloCantidad.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 11));
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDescripcion.setText("");
				txtCantidad.setText("");
				txtPrecio.setText("");
			}
		});
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Descripcion = txtDescripcion.getText();
				float Precio = Float.parseFloat(txtPrecio.getText());
				int Cantidad = Integer.parseInt(txtCantidad.getText());
				OperadorCrud.createArticulo(Descripcion, Precio, Cantidad);
			}
		});
		JLabel lblNewLabel = new JLabel("Studium\u00AE 2021");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblArticuloDescripcion)
							.addGap(5)
							.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblArticuloPrecio)
							.addGap(38)
							.addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblArticuloCantidad)
							.addGap(23)
							.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(10, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(46, Short.MAX_VALUE)
					.addComponent(btnCancelar)
					.addGap(18)
					.addComponent(btnAceptar)
					.addGap(46))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addComponent(lblNewLabel)
					.addContainerGap(99, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblArticuloDescripcion))
						.addComponent(txtDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblArticuloPrecio))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblArticuloCantidad))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptar)
						.addComponent(btnCancelar))
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(lblNewLabel))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
