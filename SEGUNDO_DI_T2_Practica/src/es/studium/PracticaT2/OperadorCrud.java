package es.studium.PracticaT2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class OperadorCrud {
	static Statement statement = null;
	static Connection connection = GestorConexiones.getMySQL_Connection("di_t4"); // permite conectar
	static ResultSet rs = null;
	public static void createArticulo(String artiDes, float artiPre, int artiCant) {
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "insert into articulos values (Null,'" + artiDes + "','" + artiPre + "','" + artiCant +"')";
			statement.executeUpdate(consulta);
			DlgOperaciones dlg = new DlgOperaciones();
			dlg.setVisible(true);
			JFAltasArticulo.txtCantidad.setText("");
			JFAltasArticulo.txtDescripcion.setText("");
			JFAltasArticulo.txtPrecio.setText("");
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			DlgERROR dlg = new DlgERROR();
			dlg.setVisible(true);
		}
	}
	public static void deleteArticulo(int id) {
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "delete from articulos where idArticulos=" + id + ";";
			statement.executeUpdate(consulta);
			DlgOperaciones dlg = new DlgOperaciones();
			//dlg.setVisible(true);
			JFBaja.txtid.setText("");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			DlgERROR dlg2 = new DlgERROR();
			dlg2.setVisible(true);
		}
	}
	public static String consultaArticulo() {
		String contenido = null;
		ArrayList<String> contenido2 = new ArrayList<String>();
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "Select * from articulos;";
			rs = statement.executeQuery(consulta);
			while (rs.next()) {
				//((Appendable) JFConsultaArticulo.table).append
						contenido=(rs.getInt("idArticulos")
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
		return contenido;
	}
	public static void updateArticulo(String nuevoValor1, float nuevoValor2 ,int nuevoValor3, int id) {
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "UPDATE articulos SET ArticuloDescripcion ='" + nuevoValor1 + "', ArticulosPrecio= '"+ nuevoValor2+"', ArticulosCantidad= '"+nuevoValor3+"' where idArticulos ='" + id + "';";
			//"UPDATE clientes SET nombreCliente='"+txtClienteNombre.getText()+"', apellidosCliente='"+txtClienteApellidos.getText()+"', dniCliente='"+txtClienteDni.getText()+"' where idCliente="+txtId.getText();
			statement.executeUpdate(consulta);
			DlgOperaciones dlg = new DlgOperaciones();
			dlg.setVisible(true);
			//JFModificarArticulo.textArea.setText("ID\tArticulo\tPrecio\tCantidad\n"+OperadorCrud.consultaArticulo());
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			DlgERROR dlg2 = new DlgERROR();
			dlg2.setVisible(true);
		}
	}
	public static void createTicket(String TicketFecha, int idArticulo, float artiPre) {
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "insert into tickets values (Null,'" + TicketFecha + "','" + artiPre + "','" + idArticulo +"')";
			statement.executeUpdate(consulta);
			DlgOperaciones dlg = new DlgOperaciones();
			dlg.setVisible(true);
			JFAltasTickets.textArticulos.setText("");
			JFAltasTickets.textFecha.setText("");
			JFAltasTickets.textPrecioTotal.setText("");
		}catch(SQLException sqle) {
			sqle.printStackTrace();
			DlgERROR dlg = new DlgERROR();
			dlg.setVisible(true);
		}
	}
	public static String consultaTicket() {
		String contenido = null;
		ArrayList<String> contenido2 = new ArrayList<String>();
		try {
			statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String consulta = "Select * from tickets;";
			rs = statement.executeQuery(consulta);
			while (rs.next()) {
				//((Appendable) JFConsultaArticulo.table).append
						contenido=(rs.getInt("idTickets")
						+"\t"+" "+rs.getString("TicketsFecha")
						+"\t"+" "+rs.getString("TicketsPrecioTotal")
						+"\t"+" "+rs.getString("idArticuloFK")
						+"\n");
						//contenido.add(contenido2);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return contenido;
	}

}
