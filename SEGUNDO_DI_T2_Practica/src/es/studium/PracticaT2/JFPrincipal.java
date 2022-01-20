package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class JFPrincipal extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFPrincipal jframe = new JFPrincipal();
					jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnArtiAlta = new JButton("Altas");
		btnArtiAlta.setBackground(Color.LIGHT_GRAY);
		btnArtiAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFAltasArticulo altasjf = new JFAltasArticulo();
				altasjf.setVisible(true);
			}
		});
		
		JButton btnArtiBajas = new JButton("Bajas");
		btnArtiBajas.setBackground(Color.LIGHT_GRAY);
		btnArtiBajas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFBaja BajaJF = new JFBaja();
				BajaJF.setVisible(true);
			}
		});
		JButton btnArtiConsulta = new JButton("Consultas");
		btnArtiConsulta.setBackground(Color.LIGHT_GRAY);
		btnArtiConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFConsultaArticulo Consultajf = new JFConsultaArticulo();
				Consultajf.setVisible(true);
			}
		});
		
		JButton btnArtiModificar = new JButton("Modificar");
		btnArtiModificar.setBackground(Color.LIGHT_GRAY);
		btnArtiModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFModificarArticulo Modificarjf = new JFModificarArticulo();
				Modificarjf.setVisible(true);
			}
		});
		JButton btnTicketAltas = new JButton("Altas");
		btnTicketAltas.setBackground(Color.LIGHT_GRAY);
		btnTicketAltas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFAltasTickets altasTicketjf = new JFAltasTickets();
				altasTicketjf.setVisible(true);
			}
		});
		JButton btnTicketConsulta = new JButton("Consultas");
		btnTicketConsulta.setBackground(Color.LIGHT_GRAY);
		btnTicketConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFConsultaTicket ConsuTicketjf = new JFConsultaTicket();
				ConsuTicketjf.setVisible(true);
			}
		});
		
		JButton btnTicketBajas = new JButton("Bajas");
		btnTicketBajas.setEnabled(false);
		
		JButton btnTicketModificar = new JButton("Modificar");
		btnTicketModificar.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("Articulos");
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Tickets");
		lblNewLabel_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 14));
		
		JSeparator separator_1 = new JSeparator();
		
		JButton btnExit = new JButton("Salir");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setFont(new Font("Verdana", Font.BOLD, 10));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		JLabel lblNewLabel_2 = new JLabel("Studium\u00AE 2021");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnArtiAlta)
								.addComponent(btnArtiModificar)
								.addComponent(btnArtiConsulta)
								.addComponent(btnArtiBajas)
								.addComponent(lblNewLabel))
							.addGap(113)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnTicketAltas)
								.addComponent(lblNewLabel_1)
								.addComponent(btnTicketConsulta)
								.addComponent(btnTicketBajas)
								.addComponent(btnTicketModificar))
							.addGap(11))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(110)
							.addComponent(btnExit)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnArtiAlta)
								.addComponent(btnTicketAltas))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnArtiBajas))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnTicketConsulta)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnArtiConsulta))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnTicketBajas)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnArtiModificar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnTicketModificar))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnExit)
						.addComponent(lblNewLabel_2)))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
