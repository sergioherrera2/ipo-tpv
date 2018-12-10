package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class pnlProductos extends JPanel {
	private JPanel pnlProductos;
	private JPanel pnlDetalles;
	private JPanel pnlEdición;
	private JLabel lbProducto1;
	private JLabel lblBebida1;
	private JLabel lblPostre1;
	private JPanel pnlComida;
	private JPanel pnlBebidas;
	private JPanel pnlPostres;
	private JLabel lblProducto2;
	private JLabel lblProducto3;
	private JLabel lblProducto4;
	private JLabel lblProducto5;
	private JLabel lblProducto6;
	private JLabel lblProducto7;
	private JLabel lblProducto8;
	private JLabel lblProducto9;
	private JLabel lblBebida2;
	private JLabel lblBebida3;
	private JLabel lblBebida4;
	private JLabel lblBebida7;
	private JLabel lblBebida8;
	private JLabel lblBebida9;
	private JLabel lblBebida5;
	private JLabel lblBebida6;
	private JLabel lblPostre2;
	private JLabel lblPostre3;
	private JLabel lblPostre4;
	private JLabel lblPostre5;
	private JLabel lblPostre6;

	/**
	 * Create the panel.
	 */
	public pnlProductos() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 217, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 241, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pnlProductos = new JPanel();
		pnlProductos.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlProductos = new GridBagConstraints();
		gbc_pnlProductos.gridwidth = 2;
		gbc_pnlProductos.insets = new Insets(0, 0, 5, 0);
		gbc_pnlProductos.fill = GridBagConstraints.BOTH;
		gbc_pnlProductos.gridx = 0;
		gbc_pnlProductos.gridy = 0;
		add(pnlProductos, gbc_pnlProductos);
		GridBagLayout gbl_pnlProductos = new GridBagLayout();
		gbl_pnlProductos.columnWidths = new int[] { 150, 0, 0, 0, 150, 0, 0, 0, 150, 0, 0, 0 };
		gbl_pnlProductos.rowHeights = new int[] { 50, 0, 0, 0 };
		gbl_pnlProductos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_pnlProductos.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlProductos.setLayout(gbl_pnlProductos);

		pnlComida = new JPanel();
		pnlComida.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_pnlComida = new GridBagConstraints();
		gbc_pnlComida.gridwidth = 3;
		gbc_pnlComida.gridheight = 3;
		gbc_pnlComida.insets = new Insets(0, 0, 0, 5);
		gbc_pnlComida.fill = GridBagConstraints.BOTH;
		gbc_pnlComida.gridx = 0;
		gbc_pnlComida.gridy = 0;
		pnlProductos.add(pnlComida, gbc_pnlComida);
		GridBagLayout gbl_pnlComida = new GridBagLayout();
		gbl_pnlComida.columnWidths = new int[] { 150, 150, 150, 0 };
		gbl_pnlComida.rowHeights = new int[] { 50, 100, 100, 0 };
		gbl_pnlComida.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlComida.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlComida.setLayout(gbl_pnlComida);

		lbProducto1 = new JLabel("");
		GridBagConstraints gbc_lbProducto1 = new GridBagConstraints();
		gbc_lbProducto1.insets = new Insets(0, 0, 5, 5);
		gbc_lbProducto1.gridx = 0;
		gbc_lbProducto1.gridy = 0;
		pnlComida.add(lbProducto1, gbc_lbProducto1);
		lbProducto1.setIcon(new ImageIcon(pnlProductos.class.getResource("/presentacion/iconos/pizza (1).png")));

		lblProducto2 = new JLabel("-");
		GridBagConstraints gbc_lblProducto2 = new GridBagConstraints();
		gbc_lblProducto2.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto2.gridx = 1;
		gbc_lblProducto2.gridy = 0;
		pnlComida.add(lblProducto2, gbc_lblProducto2);

		lblProducto3 = new JLabel("-");
		GridBagConstraints gbc_lblProducto3 = new GridBagConstraints();
		gbc_lblProducto3.insets = new Insets(0, 0, 5, 0);
		gbc_lblProducto3.gridx = 2;
		gbc_lblProducto3.gridy = 0;
		pnlComida.add(lblProducto3, gbc_lblProducto3);
		
		lblProducto4 = new JLabel("-");
		GridBagConstraints gbc_lblProducto4 = new GridBagConstraints();
		gbc_lblProducto4.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto4.gridx = 0;
		gbc_lblProducto4.gridy = 1;
		pnlComida.add(lblProducto4, gbc_lblProducto4);
		
		lblProducto5 = new JLabel("-");
		GridBagConstraints gbc_lblProducto5 = new GridBagConstraints();
		gbc_lblProducto5.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto5.gridx = 1;
		gbc_lblProducto5.gridy = 1;
		pnlComida.add(lblProducto5, gbc_lblProducto5);
		
		lblProducto6 = new JLabel("-");
		GridBagConstraints gbc_lblProducto6 = new GridBagConstraints();
		gbc_lblProducto6.insets = new Insets(0, 0, 5, 0);
		gbc_lblProducto6.gridx = 2;
		gbc_lblProducto6.gridy = 1;
		pnlComida.add(lblProducto6, gbc_lblProducto6);
		
		lblProducto7 = new JLabel("-");
		GridBagConstraints gbc_lblProducto7 = new GridBagConstraints();
		gbc_lblProducto7.insets = new Insets(0, 0, 0, 5);
		gbc_lblProducto7.gridx = 0;
		gbc_lblProducto7.gridy = 2;
		pnlComida.add(lblProducto7, gbc_lblProducto7);
		
		lblProducto8 = new JLabel("-");
		GridBagConstraints gbc_lblProducto8 = new GridBagConstraints();
		gbc_lblProducto8.insets = new Insets(0, 0, 0, 5);
		gbc_lblProducto8.gridx = 1;
		gbc_lblProducto8.gridy = 2;
		pnlComida.add(lblProducto8, gbc_lblProducto8);
		
		lblProducto9 = new JLabel("-");
		GridBagConstraints gbc_lblProducto9 = new GridBagConstraints();
		gbc_lblProducto9.gridx = 2;
		gbc_lblProducto9.gridy = 2;
		pnlComida.add(lblProducto9, gbc_lblProducto9);

		pnlBebidas = new JPanel();
		pnlBebidas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_pnlBebidas = new GridBagConstraints();
		gbc_pnlBebidas.gridwidth = 3;
		gbc_pnlBebidas.gridheight = 3;
		gbc_pnlBebidas.insets = new Insets(0, 0, 0, 5);
		gbc_pnlBebidas.fill = GridBagConstraints.BOTH;
		gbc_pnlBebidas.gridx = 4;
		gbc_pnlBebidas.gridy = 0;
		pnlProductos.add(pnlBebidas, gbc_pnlBebidas);
		GridBagLayout gbl_pnlBebidas = new GridBagLayout();
		gbl_pnlBebidas.columnWidths = new int[] { 150, 150, 150, 0 };
		gbl_pnlBebidas.rowHeights = new int[] { 100, 100, 100, 0 };
		gbl_pnlBebidas.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlBebidas.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlBebidas.setLayout(gbl_pnlBebidas);

		lblBebida1 = new JLabel("");
		GridBagConstraints gbc_lblBebida1 = new GridBagConstraints();
		gbc_lblBebida1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBebida1.gridx = 0;
		gbc_lblBebida1.gridy = 0;
		pnlBebidas.add(lblBebida1, gbc_lblBebida1);
		lblBebida1.setIcon(new ImageIcon(pnlProductos.class.getResource("/presentacion/iconos/soft-drink.png")));
		
		lblBebida2 = new JLabel("-");
		GridBagConstraints gbc_lblBebida2 = new GridBagConstraints();
		gbc_lblBebida2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBebida2.gridx = 1;
		gbc_lblBebida2.gridy = 0;
		pnlBebidas.add(lblBebida2, gbc_lblBebida2);
		
		lblBebida3 = new JLabel("-");
		GridBagConstraints gbc_lblBebida3 = new GridBagConstraints();
		gbc_lblBebida3.insets = new Insets(0, 0, 5, 0);
		gbc_lblBebida3.gridx = 2;
		gbc_lblBebida3.gridy = 0;
		pnlBebidas.add(lblBebida3, gbc_lblBebida3);
		
		lblBebida4 = new JLabel("-");
		GridBagConstraints gbc_lblBebida4 = new GridBagConstraints();
		gbc_lblBebida4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBebida4.gridx = 0;
		gbc_lblBebida4.gridy = 1;
		pnlBebidas.add(lblBebida4, gbc_lblBebida4);
		
		lblBebida5 = new JLabel("-");
		GridBagConstraints gbc_lblBebida5 = new GridBagConstraints();
		gbc_lblBebida5.insets = new Insets(0, 0, 5, 5);
		gbc_lblBebida5.gridx = 1;
		gbc_lblBebida5.gridy = 1;
		pnlBebidas.add(lblBebida5, gbc_lblBebida5);
		
		lblBebida6 = new JLabel("-");
		GridBagConstraints gbc_lblBebida6 = new GridBagConstraints();
		gbc_lblBebida6.insets = new Insets(0, 0, 5, 0);
		gbc_lblBebida6.gridx = 2;
		gbc_lblBebida6.gridy = 1;
		pnlBebidas.add(lblBebida6, gbc_lblBebida6);
		
		lblBebida7 = new JLabel("-");
		GridBagConstraints gbc_lblBebida7 = new GridBagConstraints();
		gbc_lblBebida7.insets = new Insets(0, 0, 0, 5);
		gbc_lblBebida7.gridx = 0;
		gbc_lblBebida7.gridy = 2;
		pnlBebidas.add(lblBebida7, gbc_lblBebida7);
		
		lblBebida8 = new JLabel("-");
		GridBagConstraints gbc_lblBebida8 = new GridBagConstraints();
		gbc_lblBebida8.insets = new Insets(0, 0, 0, 5);
		gbc_lblBebida8.gridx = 1;
		gbc_lblBebida8.gridy = 2;
		pnlBebidas.add(lblBebida8, gbc_lblBebida8);
		
		lblBebida9 = new JLabel("-");
		GridBagConstraints gbc_lblBebida9 = new GridBagConstraints();
		gbc_lblBebida9.gridx = 2;
		gbc_lblBebida9.gridy = 2;
		pnlBebidas.add(lblBebida9, gbc_lblBebida9);

		pnlPostres = new JPanel();
		pnlPostres.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_pnlPostres = new GridBagConstraints();
		gbc_pnlPostres.gridwidth = 3;
		gbc_pnlPostres.gridheight = 3;
		gbc_pnlPostres.insets = new Insets(0, 0, 0, 5);
		gbc_pnlPostres.fill = GridBagConstraints.BOTH;
		gbc_pnlPostres.gridx = 8;
		gbc_pnlPostres.gridy = 0;
		pnlProductos.add(pnlPostres, gbc_pnlPostres);
		GridBagLayout gbl_pnlPostres = new GridBagLayout();
		gbl_pnlPostres.columnWidths = new int[] { 150, 150, 0 };
		gbl_pnlPostres.rowHeights = new int[] { 50, 100, 100, 0 };
		gbl_pnlPostres.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlPostres.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlPostres.setLayout(gbl_pnlPostres);

		lblPostre1 = new JLabel("");
		GridBagConstraints gbc_lblPostre1 = new GridBagConstraints();
		gbc_lblPostre1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostre1.gridx = 0;
		gbc_lblPostre1.gridy = 0;
		pnlPostres.add(lblPostre1, gbc_lblPostre1);
		lblPostre1.setIcon(new ImageIcon(pnlProductos.class.getResource("/presentacion/iconos/ice-cream.png")));
		
		lblPostre2 = new JLabel("-");
		GridBagConstraints gbc_lblPostre2 = new GridBagConstraints();
		gbc_lblPostre2.insets = new Insets(0, 0, 5, 0);
		gbc_lblPostre2.gridx = 1;
		gbc_lblPostre2.gridy = 0;
		pnlPostres.add(lblPostre2, gbc_lblPostre2);
		
		lblPostre3 = new JLabel("-");
		GridBagConstraints gbc_lblPostre3 = new GridBagConstraints();
		gbc_lblPostre3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPostre3.gridx = 0;
		gbc_lblPostre3.gridy = 1;
		pnlPostres.add(lblPostre3, gbc_lblPostre3);
		
		lblPostre4 = new JLabel("-");
		GridBagConstraints gbc_lblPostre4 = new GridBagConstraints();
		gbc_lblPostre4.insets = new Insets(0, 0, 5, 0);
		gbc_lblPostre4.gridx = 1;
		gbc_lblPostre4.gridy = 1;
		pnlPostres.add(lblPostre4, gbc_lblPostre4);
		
		lblPostre5 = new JLabel("-");
		GridBagConstraints gbc_lblPostre5 = new GridBagConstraints();
		gbc_lblPostre5.insets = new Insets(0, 0, 0, 5);
		gbc_lblPostre5.gridx = 0;
		gbc_lblPostre5.gridy = 2;
		pnlPostres.add(lblPostre5, gbc_lblPostre5);
		
		lblPostre6 = new JLabel("-");
		GridBagConstraints gbc_lblPostre6 = new GridBagConstraints();
		gbc_lblPostre6.gridx = 1;
		gbc_lblPostre6.gridy = 2;
		pnlPostres.add(lblPostre6, gbc_lblPostre6);

		pnlDetalles = new JPanel();
		pnlDetalles.setBorder(new TitledBorder(null, "Detalles", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlDetalles = new GridBagConstraints();
		gbc_pnlDetalles.insets = new Insets(0, 0, 0, 5);
		gbc_pnlDetalles.fill = GridBagConstraints.BOTH;
		gbc_pnlDetalles.gridx = 0;
		gbc_pnlDetalles.gridy = 1;
		add(pnlDetalles, gbc_pnlDetalles);

		pnlEdición = new JPanel();
		pnlEdición.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Edici\u00F3n",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_pnlEdición = new GridBagConstraints();
		gbc_pnlEdición.fill = GridBagConstraints.BOTH;
		gbc_pnlEdición.gridx = 1;
		gbc_pnlEdición.gridy = 1;
		add(pnlEdición, gbc_pnlEdición);

	}

}
