package es.studium.PracticaT2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class JDAtencion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDAtencion dialog = new JDAtencion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDAtencion() {
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 178, 124);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0};
		gbl_contentPanel.rowHeights = new int[]{0};
		gbl_contentPanel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				lblNewLabel = new JLabel("Operaci\u00F3n realizada");
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap(44, Short.MAX_VALUE)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
								.addComponent(okButton)
								.addGap(59))
							.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addGap(33))))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(36)
						.addComponent(lblNewLabel)
						.addGap(18)
						.addComponent(okButton)
						.addContainerGap())
			);
			buttonPane.setLayout(gl_buttonPane);
		}
	}

}
