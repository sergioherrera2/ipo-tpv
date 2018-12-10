package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class pnlPedidos extends JPanel {
	private JPanel pnlTablaPedidos;
	private JScrollPane spTablaPedidos;
	private JTable tbPedidos;
	private JPanel pnlProductos;
	private JPanel pnlCliente;
	private JButton btnNuevoPedido;
	private JButton btnEditarPedido;
	private JButton btnVerPedido;
	private JButton btnBorrarPedido;
	private JScrollPane spTablaProductos;
	private JTable tbProductos;
	private JButton btnImprimirTicket;
	private JLabel lblTotal;
	private JTextField tfPrecio;
	private JLabel lblNombreYApellidos;
	private JTextField tfNombreApellidos;
	private JLabel lblTelfono;
	private JTextField tfTelefono;
	private JLabel lblDireccinDeEnvo;
	private JTextField tfDireccionEnvio;
	private JLabel lblAlergiasORestricciones;
	private JTextField tfAlergias;

	/**
	 * Create the panel.
	 */
	public pnlPedidos() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 871, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 316, 431, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		pnlTablaPedidos = new JPanel();
		pnlTablaPedidos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlTablaPedidos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pedidos",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_pnlTablaPedidos = new GridBagConstraints();
		gbc_pnlTablaPedidos.gridwidth = 2;
		gbc_pnlTablaPedidos.insets = new Insets(0, 0, 5, 0);
		gbc_pnlTablaPedidos.fill = GridBagConstraints.BOTH;
		gbc_pnlTablaPedidos.gridx = 0;
		gbc_pnlTablaPedidos.gridy = 0;
		add(pnlTablaPedidos, gbc_pnlTablaPedidos);
		GridBagLayout gbl_pnlTablaPedidos = new GridBagLayout();
		gbl_pnlTablaPedidos.columnWidths = new int[] { 0, 100, 0 };
		gbl_pnlTablaPedidos.rowHeights = new int[] { 50, 50, 50, 50, 50, 50, 0 };
		gbl_pnlTablaPedidos.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlTablaPedidos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlTablaPedidos.setLayout(gbl_pnlTablaPedidos);

		spTablaPedidos = new JScrollPane();
		GridBagConstraints gbc_spTablaPedidos = new GridBagConstraints();
		gbc_spTablaPedidos.gridheight = 6;
		gbc_spTablaPedidos.insets = new Insets(0, 0, 5, 5);
		gbc_spTablaPedidos.fill = GridBagConstraints.BOTH;
		gbc_spTablaPedidos.gridx = 0;
		gbc_spTablaPedidos.gridy = 0;
		pnlTablaPedidos.add(spTablaPedidos, gbc_spTablaPedidos);

		tbPedidos = new JTable();
		tbPedidos.setModel(new DefaultTableModel(new Object[][] {
				{ new Integer(1), "A domicilio", "En elaboraci\u00F3n", new Double(24.67), null, "21:37", null, "22:00",
						"Calle Concepci\u00F3n Arenal, 7, Ciudad Real" },
				{ new Integer(2), "Local", "Pagado", new Double(44.5), Boolean.TRUE, "20:30", null, null, null },
				{ new Integer(3), "Recogida", "Recogido", new Double(9.8), null, "20:07", "20:30", null, null },
				{ new Integer(4), "Local", null, new Double(4.99), Boolean.TRUE, "19:46", null, null, null }, },
				new String[] { "Pedido", "Tipo", "Estado", "Importe total", "Pagado", "Fecha y hora", "Hora recogida",
						"Hora llegada", "Direcci\u00F3n env\u00EDo" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, Double.class, Boolean.class,
					String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbPedidos.getColumnModel().getColumn(2).setPreferredWidth(95);
		tbPedidos.getColumnModel().getColumn(3).setPreferredWidth(89);
		tbPedidos.getColumnModel().getColumn(5).setPreferredWidth(89);
		tbPedidos.getColumnModel().getColumn(6).setPreferredWidth(99);
		tbPedidos.getColumnModel().getColumn(7).setPreferredWidth(84);
		tbPedidos.getColumnModel().getColumn(8).setPreferredWidth(103);
		spTablaPedidos.setViewportView(tbPedidos);

		btnNuevoPedido = new JButton("Nuevo pedido");
		btnNuevoPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNuevoPedido = new GridBagConstraints();
		gbc_btnNuevoPedido.fill = GridBagConstraints.BOTH;
		gbc_btnNuevoPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnNuevoPedido.gridx = 1;
		gbc_btnNuevoPedido.gridy = 0;
		pnlTablaPedidos.add(btnNuevoPedido, gbc_btnNuevoPedido);

		btnEditarPedido = new JButton("Editar pedido");
		btnEditarPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEditarPedido = new GridBagConstraints();
		gbc_btnEditarPedido.fill = GridBagConstraints.BOTH;
		gbc_btnEditarPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarPedido.gridx = 1;
		gbc_btnEditarPedido.gridy = 1;
		pnlTablaPedidos.add(btnEditarPedido, gbc_btnEditarPedido);

		btnVerPedido = new JButton("Ver pedido");
		btnVerPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnVerPedido = new GridBagConstraints();
		gbc_btnVerPedido.fill = GridBagConstraints.BOTH;
		gbc_btnVerPedido.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerPedido.gridx = 1;
		gbc_btnVerPedido.gridy = 2;
		pnlTablaPedidos.add(btnVerPedido, gbc_btnVerPedido);

		btnBorrarPedido = new JButton("Borrar pedido");
		btnBorrarPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnBorrarPedido = new GridBagConstraints();
		gbc_btnBorrarPedido.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarPedido.gridx = 1;
		gbc_btnBorrarPedido.gridy = 5;
		pnlTablaPedidos.add(btnBorrarPedido, gbc_btnBorrarPedido);

		pnlProductos = new JPanel();
		pnlProductos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlProductos.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlProductos = new GridBagConstraints();
		gbc_pnlProductos.insets = new Insets(0, 0, 0, 5);
		gbc_pnlProductos.fill = GridBagConstraints.BOTH;
		gbc_pnlProductos.gridx = 0;
		gbc_pnlProductos.gridy = 1;
		add(pnlProductos, gbc_pnlProductos);
		GridBagLayout gbl_pnlProductos = new GridBagLayout();
		gbl_pnlProductos.columnWidths = new int[] { 606, 50, 50, 0 };
		gbl_pnlProductos.rowHeights = new int[] { 0, 0, 50, 0 };
		gbl_pnlProductos.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlProductos.rowWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlProductos.setLayout(gbl_pnlProductos);

		spTablaProductos = new JScrollPane();
		GridBagConstraints gbc_spTablaProductos = new GridBagConstraints();
		gbc_spTablaProductos.gridheight = 3;
		gbc_spTablaProductos.insets = new Insets(0, 0, 0, 5);
		gbc_spTablaProductos.fill = GridBagConstraints.BOTH;
		gbc_spTablaProductos.gridx = 0;
		gbc_spTablaProductos.gridy = 0;
		pnlProductos.add(spTablaProductos, gbc_spTablaProductos);

		tbProductos = new JTable();
		tbProductos.setModel(new DefaultTableModel(
				new Object[][] { { "Hamburguesa", new Double(6.95), new Integer(1), new Double(6.95) },
						{ "Pizza 4 Quesos", new Double(8.0), new Integer(2), new Double(16.0) },
						{ "Coca Cola Zero", new Double(1.5), new Integer(3), new Double(4.5) },
						{ "Pizza Barbacoa", new Double(8.5), new Integer(2), new Double(17.0) }, },
				new String[] { "Producto", "Precio", "Uds", "Importe total" }) {
			Class[] columnTypes = new Class[] { String.class, Double.class, Integer.class, Double.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbProductos.getColumnModel().getColumn(0).setPreferredWidth(107);
		tbProductos.getColumnModel().getColumn(3).setPreferredWidth(95);
		spTablaProductos.setViewportView(tbProductos);

		lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.anchor = GridBagConstraints.EAST;
		gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotal.gridx = 1;
		gbc_lblTotal.gridy = 1;
		pnlProductos.add(lblTotal, gbc_lblTotal);

		tfPrecio = new JTextField();
		tfPrecio.setForeground(Color.RED);
		tfPrecio.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
		tfPrecio.setEditable(false);
		tfPrecio.setText("44.50\u20AC");
		GridBagConstraints gbc_tfPrecio = new GridBagConstraints();
		gbc_tfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPrecio.insets = new Insets(0, 0, 5, 0);
		gbc_tfPrecio.gridx = 2;
		gbc_tfPrecio.gridy = 1;
		pnlProductos.add(tfPrecio, gbc_tfPrecio);
		tfPrecio.setColumns(10);

		btnImprimirTicket = new JButton("Imprimir ticket");
		btnImprimirTicket.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnImprimirTicket = new GridBagConstraints();
		gbc_btnImprimirTicket.gridwidth = 2;
		gbc_btnImprimirTicket.fill = GridBagConstraints.BOTH;
		gbc_btnImprimirTicket.gridx = 1;
		gbc_btnImprimirTicket.gridy = 2;
		pnlProductos.add(btnImprimirTicket, gbc_btnImprimirTicket);

		pnlCliente = new JPanel();
		pnlCliente.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlCliente = new GridBagConstraints();
		gbc_pnlCliente.fill = GridBagConstraints.BOTH;
		gbc_pnlCliente.gridx = 1;
		gbc_pnlCliente.gridy = 1;
		add(pnlCliente, gbc_pnlCliente);
		GridBagLayout gbl_pnlCliente = new GridBagLayout();
		gbl_pnlCliente.columnWidths = new int[] { 178, 120, 120, 0 };
		gbl_pnlCliente.rowHeights = new int[] { 50, 50, 50, 50, 50, 50, 50, 0 };
		gbl_pnlCliente.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pnlCliente.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlCliente.setLayout(gbl_pnlCliente);

		lblNombreYApellidos = new JLabel("Nombre y apellidos:");
		lblNombreYApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreYApellidos = new GridBagConstraints();
		gbc_lblNombreYApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreYApellidos.gridx = 0;
		gbc_lblNombreYApellidos.gridy = 0;
		pnlCliente.add(lblNombreYApellidos, gbc_lblNombreYApellidos);

		tfNombreApellidos = new JTextField();
		tfNombreApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_tfNombreApellidos = new GridBagConstraints();
		gbc_tfNombreApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombreApellidos.gridwidth = 3;
		gbc_tfNombreApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_tfNombreApellidos.gridx = 0;
		gbc_tfNombreApellidos.gridy = 1;
		pnlCliente.add(tfNombreApellidos, gbc_tfNombreApellidos);
		tfNombreApellidos.setColumns(10);

		lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
		gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelfono.gridx = 0;
		gbc_lblTelfono.gridy = 2;
		pnlCliente.add(lblTelfono, gbc_lblTelfono);

		tfTelefono = new JTextField();
		tfTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_tfTelefono = new GridBagConstraints();
		gbc_tfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTelefono.gridwidth = 2;
		gbc_tfTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_tfTelefono.gridx = 1;
		gbc_tfTelefono.gridy = 2;
		pnlCliente.add(tfTelefono, gbc_tfTelefono);
		tfTelefono.setColumns(10);

		lblDireccinDeEnvo = new JLabel("Direcci\u00F3n de env\u00EDo:");
		lblDireccinDeEnvo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDireccinDeEnvo = new GridBagConstraints();
		gbc_lblDireccinDeEnvo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccinDeEnvo.gridx = 0;
		gbc_lblDireccinDeEnvo.gridy = 3;
		pnlCliente.add(lblDireccinDeEnvo, gbc_lblDireccinDeEnvo);

		tfDireccionEnvio = new JTextField();
		tfDireccionEnvio.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_tfDireccionEnvio = new GridBagConstraints();
		gbc_tfDireccionEnvio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDireccionEnvio.gridwidth = 3;
		gbc_tfDireccionEnvio.insets = new Insets(0, 0, 5, 0);
		gbc_tfDireccionEnvio.gridx = 0;
		gbc_tfDireccionEnvio.gridy = 4;
		pnlCliente.add(tfDireccionEnvio, gbc_tfDireccionEnvio);
		tfDireccionEnvio.setColumns(10);

		lblAlergiasORestricciones = new JLabel("Alergias o restricciones:");
		lblAlergiasORestricciones.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_lblAlergiasORestricciones = new GridBagConstraints();
		gbc_lblAlergiasORestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlergiasORestricciones.gridx = 0;
		gbc_lblAlergiasORestricciones.gridy = 5;
		pnlCliente.add(lblAlergiasORestricciones, gbc_lblAlergiasORestricciones);

		tfAlergias = new JTextField();
		tfAlergias.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		GridBagConstraints gbc_tfAlergias = new GridBagConstraints();
		gbc_tfAlergias.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAlergias.gridwidth = 3;
		gbc_tfAlergias.insets = new Insets(0, 0, 0, 5);
		gbc_tfAlergias.gridx = 0;
		gbc_tfAlergias.gridy = 6;
		pnlCliente.add(tfAlergias, gbc_tfAlergias);
		tfAlergias.setColumns(10);

	}

}
