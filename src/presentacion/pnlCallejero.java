package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JRadioButton;

public class pnlCallejero extends JPanel {
	private JPanel pnlCallejero;
	private JLabel lblMapa;
	private JLabel lblPrximosDestinos;
	private JScrollPane spListas;
	private JList lstHoras;
	private JList lstDirecciones;
	private JLabel lblInfoDelPedido;
	private JRadioButton rdbtnPagado;
	private JRadioButton rdbtnCaliente;
	private JRadioButton rdbtnVip;

	/**
	 * Create the panel.
	 */
	public pnlCallejero() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 1028, 121, 131 };
		gridBagLayout.rowHeights = new int[] { 42, 47, 194, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pnlCallejero = new JPanel();
		pnlCallejero.setBorder(new TitledBorder(null, "Callejero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlCallejero = new GridBagConstraints();
		gbc_pnlCallejero.gridheight = 7;
		gbc_pnlCallejero.insets = new Insets(0, 0, 0, 5);
		gbc_pnlCallejero.fill = GridBagConstraints.BOTH;
		gbc_pnlCallejero.gridx = 0;
		gbc_pnlCallejero.gridy = 0;
		add(pnlCallejero, gbc_pnlCallejero);
		GridBagLayout gbl_pnlCallejero = new GridBagLayout();
		gbl_pnlCallejero.columnWidths = new int[] { 0, 0 };
		gbl_pnlCallejero.rowHeights = new int[] { 0, 0 };
		gbl_pnlCallejero.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pnlCallejero.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlCallejero.setLayout(gbl_pnlCallejero);

		lblMapa = new JLabel("");
		lblMapa.setIcon(
				new ImageIcon(pnlCallejero.class.getResource("/presentacion/iconos/mapa03.jpg")));
		GridBagConstraints gbc_lblMapa = new GridBagConstraints();
		gbc_lblMapa.fill = GridBagConstraints.BOTH;
		gbc_lblMapa.gridx = 0;
		gbc_lblMapa.gridy = 0;
		pnlCallejero.add(lblMapa, gbc_lblMapa);

		lblPrximosDestinos = new JLabel("Pr\u00F3ximos destinos:");
		lblPrximosDestinos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrximosDestinos = new GridBagConstraints();
		gbc_lblPrximosDestinos.gridwidth = 2;
		gbc_lblPrximosDestinos.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrximosDestinos.gridx = 1;
		gbc_lblPrximosDestinos.gridy = 0;
		add(lblPrximosDestinos, gbc_lblPrximosDestinos);

		spListas = new JScrollPane();
		GridBagConstraints gbc_spListas = new GridBagConstraints();
		gbc_spListas.gridheight = 2;
		gbc_spListas.insets = new Insets(0, 0, 5, 0);
		gbc_spListas.gridwidth = 2;
		gbc_spListas.fill = GridBagConstraints.BOTH;
		gbc_spListas.gridx = 1;
		gbc_spListas.gridy = 1;
		add(spListas, gbc_spListas);

		lstHoras = new JList();
		lstHoras.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lstHoras.setModel(new AbstractListModel() {
			String[] values = new String[] { "20:48", "21:03" };

			@Override
			public int getSize() {
				return values.length;
			}

			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spListas.setRowHeaderView(lstHoras);

		lstDirecciones = new JList();
		lstDirecciones.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lstDirecciones.setModel(new AbstractListModel() {
			String[] values = new String[] { "Calle Calatrava, 48", "Calle Toledo, 5" };

			@Override
			public int getSize() {
				return values.length;
			}

			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spListas.setViewportView(lstDirecciones);

		lblInfoDelPedido = new JLabel("Info del pedido:");
		lblInfoDelPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_lblInfoDelPedido = new GridBagConstraints();
		gbc_lblInfoDelPedido.fill = GridBagConstraints.VERTICAL;
		gbc_lblInfoDelPedido.gridwidth = 2;
		gbc_lblInfoDelPedido.insets = new Insets(0, 0, 5, 0);
		gbc_lblInfoDelPedido.gridx = 1;
		gbc_lblInfoDelPedido.gridy = 3;
		add(lblInfoDelPedido, gbc_lblInfoDelPedido);

		rdbtnPagado = new JRadioButton("Pagado");
		rdbtnPagado.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_rdbtnPagado = new GridBagConstraints();
		gbc_rdbtnPagado.fill = GridBagConstraints.BOTH;
		gbc_rdbtnPagado.gridwidth = 2;
		gbc_rdbtnPagado.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnPagado.gridx = 1;
		gbc_rdbtnPagado.gridy = 4;
		add(rdbtnPagado, gbc_rdbtnPagado);

		rdbtnCaliente = new JRadioButton("Caliente");
		rdbtnCaliente.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_rdbtnCaliente = new GridBagConstraints();
		gbc_rdbtnCaliente.fill = GridBagConstraints.BOTH;
		gbc_rdbtnCaliente.gridwidth = 2;
		gbc_rdbtnCaliente.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnCaliente.gridx = 1;
		gbc_rdbtnCaliente.gridy = 5;
		add(rdbtnCaliente, gbc_rdbtnCaliente);

		rdbtnVip = new JRadioButton("VIP");
		rdbtnVip.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		GridBagConstraints gbc_rdbtnVip = new GridBagConstraints();
		gbc_rdbtnVip.fill = GridBagConstraints.BOTH;
		gbc_rdbtnVip.gridwidth = 2;
		gbc_rdbtnVip.gridx = 1;
		gbc_rdbtnVip.gridy = 6;
		add(rdbtnVip, gbc_rdbtnVip);

	}

}
