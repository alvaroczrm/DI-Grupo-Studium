package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;

public class JFAltasTickets extends JFrame implements WindowListener {
	static Statement statement = null;
	static Connection connection = GestorConexiones.getMySQL_Connection("di_t4"); // permite conectar
	static ResultSet rs = null;



		private JPanel contentPane;
		static JTextField textFecha;
		static JTextField textArticulos;
		static JTextField textPrecioTotal;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JFAltasTickets frame = new JFAltasTickets();
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
		public JFAltasTickets() {
			setResizable(false);
			setTitle("Altas Tickets");
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setBounds(100, 100, 272, 293);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			JLabel lblTicketFecha = new JLabel("Fecha");
			lblTicketFecha.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
			
			textFecha = new JTextField();
			textFecha.setColumns(10);
			
			JLabel lblArticulosTicket = new JLabel("Articulos");
			lblArticulosTicket.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 11));
			
			textArticulos = new JTextField();
			textArticulos.setColumns(10);
			
			JLabel lblTicketPrecio = new JLabel("Precio total");
			lblTicketPrecio.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 11));
			
			textPrecioTotal = new JTextField();
			textPrecioTotal.setColumns(10);
			
			JButton btnCancelar = new JButton("Cancelar");
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String Fecha = textFecha.getText();
					int idArticulo = Integer.parseInt(textArticulos.getText());
					float Precio = Float.parseFloat(textPrecioTotal.getText());
					OperadorCrud.createTicket(Fecha, idArticulo ,Precio);
				}
			});
			
			JLabel lblNewLabel = new JLabel("Studium\u00AE 2021");
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblArticulosTicket)
									.addComponent(lblTicketFecha))
								.addGap(38)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(textFecha, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
									.addComponent(textArticulos, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblTicketPrecio)
								.addGap(23)
								.addComponent(textPrecioTotal, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(82)
						.addComponent(lblNewLabel)
						.addContainerGap(99, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(40)
						.addComponent(btnCancelar)
						.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
						.addComponent(btnAceptar)
						.addGap(36))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(31)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTicketFecha)
							.addComponent(textFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(37)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textArticulos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblArticulosTicket))
						.addGap(35)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textPrecioTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTicketPrecio))
						.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCancelar)
							.addComponent(btnAceptar))
						.addGap(18)
						.addComponent(lblNewLabel))
			);
			contentPane.setLayout(gl_contentPane);
		}
		/*public static void llenarSpinner() {
			String contenido = null;
			ArrayList<String> contenido2 = new ArrayList<String>();
			try {
				statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				String consulta = "Select * from articulos;";
				rs = statement.executeQuery(consulta);
				while (rs.next()) {
					//((Appendable) JFConsultaArticulo.table).append
							spinner.add(rs.getInt("idArticulos")
							+"\t"+" "+rs.getString("ArticuloDescripcion")
							+"\t"+" "+rs.getString("ArticulosPrecio")
							+"\t"+" "+rs.getString("ArticulosCantidad")
							+"\n");
							//contenido.add(contenido2);
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}*/

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			if(this.isActive()) {
				this.setVisible(false);
			}
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}