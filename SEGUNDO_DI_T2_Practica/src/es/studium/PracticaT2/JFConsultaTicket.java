package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class JFConsultaTicket  extends JFrame {

	private JPanel contentPane;
	static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFConsultaTicket frame = new JFConsultaTicket();
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
	public JFConsultaTicket() {
		setTitle("Consulta Ticket");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 239);
		contentPane.add(textArea);
		textArea.setText("ID\tFecha\tPrecio\tid Articulo\n"+OperadorCrud.consultaTicket());
		/*
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 414, 239);
		contentPane.add(textPane);
		textPane.setText(OperadorCrud.consultaArticulo());*/
		/*
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"ID", "Articulos", "Precio", "Cantidad"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		int columns = table.getModel().getColumnCount();
		Object [] fila = new Object[columns];
			fila[0] = OperadorCrud.consultaArticulo();
			fila[1] = 2;
			fila[2] = 3;
			fila[3] = 4;
			((DefaultTableModel) table.getModel()).addRow(fila);
		scrollPane.setViewportView(table);*/
	}

}
