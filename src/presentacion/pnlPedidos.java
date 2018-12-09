package presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class pnlPedidos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8123446580882958773L;
	private JPanel pnlTablaPedidos;
	private JTable tblPedidos;
	private JPanel pnlBotones;
	private JButton btnNuevoPedido;
	private JButton btnEditarPedido;
	private JButton btnVerPedido;
	private JButton btnBorrarPedido;
	private JPanel pnlProductos;
	private JTable tblProductos;
	private JLabel lblTotal;
	private JLabel label;
	private JButton btnImprimirTicket;
	private JPanel pnlCliente;
	private JLabel lblNombreApellidos;
	private JLabel lblTelefono;
	private JLabel lblDireccinDeEnvo;
	private JLabel lblAlergiasORestricciones;
	private JTextField tfNombreApellidos;
	private JTextField tfTelefono;
	private JTextField tfDireccinDeEnvo;
	private JTextField tfAlergiasORestricciones;

	/**
	 * Create the panel.
	 */
	public pnlPedidos() {
		setLayout(new BorderLayout(0, 0));
		
		pnlTablaPedidos = new JPanel();
		add(pnlTablaPedidos, BorderLayout.NORTH);
		pnlTablaPedidos.setBorder(new TitledBorder(null, "Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		tblPedidos = new JTable();
		tblPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblPedidos.setCellSelectionEnabled(true);
		tblPedidos.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "A domicilio", "En elaboraci\u00F3n", new Double(24.67), Boolean.FALSE, "21:37", "", "22:00", "Calle Concepci\u00F3n Arenal, N7, Ciudad Real"},
				{new Integer(2), "Local", "Pagado", new Double(44.5), Boolean.TRUE, "20:30", null, null, null},
				{new Integer(3), "Recogida", "Recogido", new Double(9.8), null, "20:07", "20:30", null, null},
				{new Integer(4), "Local", null, new Double(4.99), Boolean.TRUE, "19:46", null, null, null},
				{null, null, "", null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Pedido", "Tipo", "Estado", "Importe total", "Pagado", "Fecha y hora", "Hora recogida", "Hora llegada", "Direcci\u00F3n de env\u00EDo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Double.class, Boolean.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblPedidos.getColumnModel().getColumn(0).setPreferredWidth(57);
		tblPedidos.getColumnModel().getColumn(3).setPreferredWidth(90);
		tblPedidos.getColumnModel().getColumn(5).setPreferredWidth(84);
		tblPedidos.getColumnModel().getColumn(6).setPreferredWidth(95);
		tblPedidos.getColumnModel().getColumn(7).setPreferredWidth(87);
		tblPedidos.getColumnModel().getColumn(8).setPreferredWidth(122);
		pnlTablaPedidos.add(tblPedidos);
		
		pnlBotones = new JPanel();
		pnlTablaPedidos.add(pnlBotones);
		pnlBotones.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnNuevoPedido = new JButton("Nuevo pedido");
		pnlBotones.add(btnNuevoPedido);
		
		btnEditarPedido = new JButton("Editar pedido");
		pnlBotones.add(btnEditarPedido);
		
		btnVerPedido = new JButton("Ver pedido");
		pnlBotones.add(btnVerPedido);
		
		btnBorrarPedido = new JButton("Borrar pedido");
		pnlBotones.add(btnBorrarPedido);
		
		pnlProductos = new JPanel();
		add(pnlProductos, BorderLayout.WEST);
		pnlProductos.setBorder(new TitledBorder(null, "Productos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		tblProductos = new JTable();
		tblProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblProductos.setModel(new DefaultTableModel(
			new Object[][] {
				{"Hamburguesa", new Double(6.95), new Integer(1), new Double(6.95)},
				{"Pizza 4 Quesos", new Double(8.0), new Integer(2), new Double(16.0)},
				{"Coca Cola Zero", new Double(1.5), new Integer(3), new Double(4.5)},
				{"Pizza Barbacoa", new Double(8.5), new Integer(2), new Double(17.0)},
			},
			new String[] {
				"Producto", "Precio", "Unidades", "Importe total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblProductos.getColumnModel().getColumn(0).setPreferredWidth(122);
		tblProductos.getColumnModel().getColumn(3).setPreferredWidth(94);
		pnlProductos.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		tblProductos.setCellSelectionEnabled(true);
		pnlProductos.add(tblProductos);
		
		btnImprimirTicket = new JButton("Imprimir ticket");
		pnlProductos.add(btnImprimirTicket);
		
		lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		pnlProductos.add(lblTotal);
		
		label = new JLabel("44.50\u20AC");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setForeground(Color.RED);
		pnlProductos.add(label);
		
		pnlCliente = new JPanel();
		pnlCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(pnlCliente, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCliente = new GridBagLayout();
		gbl_pnlCliente.columnWidths = new int[]{135, 109, 50, 104, 133, 0};
		gbl_pnlCliente.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pnlCliente.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlCliente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlCliente.setLayout(gbl_pnlCliente);
		
		lblNombreApellidos = new JLabel("Nombre y apellidos");
		GridBagConstraints gbc_lblNombreApellidos = new GridBagConstraints();
		gbc_lblNombreApellidos.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNombreApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreApellidos.gridx = 1;
		gbc_lblNombreApellidos.gridy = 1;
		pnlCliente.add(lblNombreApellidos, gbc_lblNombreApellidos);
		
		tfNombreApellidos = new JTextField();
		tfNombreApellidos.setEditable(false);
		GridBagConstraints gbc_tfNombreApellidos = new GridBagConstraints();
		gbc_tfNombreApellidos.anchor = GridBagConstraints.NORTH;
		gbc_tfNombreApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_tfNombreApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombreApellidos.gridx = 2;
		gbc_tfNombreApellidos.gridy = 1;
		pnlCliente.add(tfNombreApellidos, gbc_tfNombreApellidos);
		tfNombreApellidos.setColumns(10);
		
		lblTelefono = new JLabel("Tel\u00E9fono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 2;
		pnlCliente.add(lblTelefono, gbc_lblTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setEditable(false);
		GridBagConstraints gbc_tfTelefono = new GridBagConstraints();
		gbc_tfTelefono.anchor = GridBagConstraints.NORTH;
		gbc_tfTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_tfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTelefono.gridx = 2;
		gbc_tfTelefono.gridy = 2;
		pnlCliente.add(tfTelefono, gbc_tfTelefono);
		tfTelefono.setColumns(10);
		
		lblDireccinDeEnvo = new JLabel("Direcci\u00F3n de env\u00EDo");
		GridBagConstraints gbc_lblDireccinDeEnvo = new GridBagConstraints();
		gbc_lblDireccinDeEnvo.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblDireccinDeEnvo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccinDeEnvo.gridx = 1;
		gbc_lblDireccinDeEnvo.gridy = 3;
		pnlCliente.add(lblDireccinDeEnvo, gbc_lblDireccinDeEnvo);
		
		tfDireccinDeEnvo = new JTextField();
		tfDireccinDeEnvo.setEditable(false);
		GridBagConstraints gbc_tfDireccinDeEnvo = new GridBagConstraints();
		gbc_tfDireccinDeEnvo.insets = new Insets(0, 0, 5, 5);
		gbc_tfDireccinDeEnvo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDireccinDeEnvo.gridx = 2;
		gbc_tfDireccinDeEnvo.gridy = 3;
		pnlCliente.add(tfDireccinDeEnvo, gbc_tfDireccinDeEnvo);
		tfDireccinDeEnvo.setColumns(10);
		
		lblAlergiasORestricciones = new JLabel("Alergias o restricciones");
		GridBagConstraints gbc_lblAlergiasORestricciones = new GridBagConstraints();
		gbc_lblAlergiasORestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlergiasORestricciones.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblAlergiasORestricciones.gridx = 1;
		gbc_lblAlergiasORestricciones.gridy = 4;
		pnlCliente.add(lblAlergiasORestricciones, gbc_lblAlergiasORestricciones);
		
		tfAlergiasORestricciones = new JTextField();
		tfAlergiasORestricciones.setEditable(false);
		GridBagConstraints gbc_tfAlergiasORestricciones = new GridBagConstraints();
		gbc_tfAlergiasORestricciones.insets = new Insets(0, 0, 5, 5);
		gbc_tfAlergiasORestricciones.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfAlergiasORestricciones.gridx = 2;
		gbc_tfAlergiasORestricciones.gridy = 4;
		pnlCliente.add(tfAlergiasORestricciones, gbc_tfAlergiasORestricciones);
		tfAlergiasORestricciones.setColumns(10);

	}
}
