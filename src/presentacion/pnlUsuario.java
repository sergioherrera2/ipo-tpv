package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Font;

public class pnlUsuario extends JPanel {
	private JLabel lblFotousuario;
	private JLabel lblUsr;
	private JLabel lblltAcceso;

	/**
	 * Create the panel.
	 */
	public pnlUsuario() {
		setFont(new Font("Segoe UI", Font.PLAIN, 13));
		setBorder(new TitledBorder(null, "Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 94, 140, 0, 0};
		gridBagLayout.rowHeights = new int[]{58, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblFotousuario = new JLabel("");
		lblFotousuario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblFotousuario.setIcon(new ImageIcon(pnlUsuario.class.getResource("/presentacion/imagenes/pizza.png")));
		GridBagConstraints gbc_lblFotousuario = new GridBagConstraints();
		gbc_lblFotousuario.gridheight = 3;
		gbc_lblFotousuario.insets = new Insets(0, 0, 0, 5);
		gbc_lblFotousuario.gridx = 1;
		gbc_lblFotousuario.gridy = 0;
		add(lblFotousuario, gbc_lblFotousuario);
		
		lblUsr = new JLabel("USR003");
		lblUsr.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		GridBagConstraints gbc_lblUsr = new GridBagConstraints();
		gbc_lblUsr.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsr.gridx = 2;
		gbc_lblUsr.gridy = 0;
		add(lblUsr, gbc_lblUsr);
		
		lblltAcceso = new JLabel("\u00DAlt. acceso: ayer");
		lblltAcceso.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_lblltAcceso = new GridBagConstraints();
		gbc_lblltAcceso.gridheight = 2;
		gbc_lblltAcceso.insets = new Insets(0, 0, 0, 5);
		gbc_lblltAcceso.gridx = 2;
		gbc_lblltAcceso.gridy = 1;
		add(lblltAcceso, gbc_lblltAcceso);

	}

}
