package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class pnlClientes extends JPanel {
	private JPanel pnlTablaClientes;
	private JPanel pnlHistorialPedidos;
	private JPanel pnlPuntos;
	private JScrollPane spTablaClientes;
	private JTable tbClientes;
	private JButton btnAadirCliente;
	private JButton btnEditarCliente;
	private JButton btnBorrarCliente;
	private JScrollPane spHistorial;
	private JTable tbHistorial;
	private JLabel lblPuntosAcumulados;
	private JLabel label;
	private JLabel lblVlidosHasta;
	private JLabel label_1;

	/**
	 * Create the panel.
	 */
	public pnlClientes() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{1106, 150, 0};
		gridBagLayout.rowHeights = new int[]{510, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnlTablaClientes = new JPanel();
		pnlTablaClientes.setBorder(new TitledBorder(null, "Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlTablaClientes = new GridBagConstraints();
		gbc_pnlTablaClientes.gridwidth = 2;
		gbc_pnlTablaClientes.insets = new Insets(0, 0, 5, 5);
		gbc_pnlTablaClientes.fill = GridBagConstraints.BOTH;
		gbc_pnlTablaClientes.gridx = 0;
		gbc_pnlTablaClientes.gridy = 0;
		add(pnlTablaClientes, gbc_pnlTablaClientes);
		GridBagLayout gbl_pnlTablaClientes = new GridBagLayout();
		gbl_pnlTablaClientes.columnWidths = new int[]{0, 100, 0};
		gbl_pnlTablaClientes.rowHeights = new int[]{50, 50, 0, 50, 0};
		gbl_pnlTablaClientes.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlTablaClientes.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlTablaClientes.setLayout(gbl_pnlTablaClientes);
		
		spTablaClientes = new JScrollPane();
		GridBagConstraints gbc_spTablaClientes = new GridBagConstraints();
		gbc_spTablaClientes.gridheight = 4;
		gbc_spTablaClientes.insets = new Insets(0, 0, 5, 5);
		gbc_spTablaClientes.fill = GridBagConstraints.BOTH;
		gbc_spTablaClientes.gridx = 0;
		gbc_spTablaClientes.gridy = 0;
		pnlTablaClientes.add(spTablaClientes, gbc_spTablaClientes);
		
		tbClientes = new JTable();
		tbClientes.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sergio", "Herrera Piqueras", "Calle Concepci\u00F3n Arenal, 7", new Integer(666333444), "sergio.herrera2@alu.uclm.es", "", ""},
				{"Luis", "Rodr\u00EDguez D\u00EDaz", "Calle Quijote, 32", new Integer(755532122), null, null, "Vegano"},
				{"Jos\u00E9", "Mart\u00EDnez Fern\u00E1ndez", "Calle Toledo, 43", null, "jmfernandez@gmail.com", "No hamburguesas", null},
				{"Federico", "Guti\u00E9rrez de la Vega", "Calle Ancha, 4", new Integer(611333222), "jgutierrezdlv@hotmail.es", null, "Cel\u00EDaco"},
			},
			new String[] {
				"Nombre", "Apellidos", "Direcci\u00F3n", "Tel\u00E9fono", "e-mail", "Restricciones alimentarias", "Alergias e intolerancias"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbClientes.getColumnModel().getColumn(1).setPreferredWidth(115);
		tbClientes.getColumnModel().getColumn(4).setPreferredWidth(178);
		tbClientes.getColumnModel().getColumn(5).setPreferredWidth(122);
		tbClientes.getColumnModel().getColumn(6).setPreferredWidth(148);
		spTablaClientes.setViewportView(tbClientes);
		
		btnAadirCliente = new JButton("A\u00F1adir cliente");
		GridBagConstraints gbc_btnAadirCliente = new GridBagConstraints();
		gbc_btnAadirCliente.fill = GridBagConstraints.BOTH;
		gbc_btnAadirCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnAadirCliente.gridx = 1;
		gbc_btnAadirCliente.gridy = 0;
		pnlTablaClientes.add(btnAadirCliente, gbc_btnAadirCliente);
		
		btnEditarCliente = new JButton("Editar cliente");
		GridBagConstraints gbc_btnEditarCliente = new GridBagConstraints();
		gbc_btnEditarCliente.fill = GridBagConstraints.BOTH;
		gbc_btnEditarCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarCliente.gridx = 1;
		gbc_btnEditarCliente.gridy = 1;
		pnlTablaClientes.add(btnEditarCliente, gbc_btnEditarCliente);
		
		btnBorrarCliente = new JButton("Borrar cliente");
		GridBagConstraints gbc_btnBorrarCliente = new GridBagConstraints();
		gbc_btnBorrarCliente.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarCliente.gridx = 1;
		gbc_btnBorrarCliente.gridy = 3;
		pnlTablaClientes.add(btnBorrarCliente, gbc_btnBorrarCliente);
		
		pnlHistorialPedidos = new JPanel();
		pnlHistorialPedidos.setBorder(new TitledBorder(null, "Historial de pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlHistorialPedidos = new GridBagConstraints();
		gbc_pnlHistorialPedidos.insets = new Insets(0, 0, 0, 5);
		gbc_pnlHistorialPedidos.fill = GridBagConstraints.BOTH;
		gbc_pnlHistorialPedidos.gridx = 0;
		gbc_pnlHistorialPedidos.gridy = 1;
		add(pnlHistorialPedidos, gbc_pnlHistorialPedidos);
		GridBagLayout gbl_pnlHistorialPedidos = new GridBagLayout();
		gbl_pnlHistorialPedidos.columnWidths = new int[]{0, 0};
		gbl_pnlHistorialPedidos.rowHeights = new int[]{0, 0};
		gbl_pnlHistorialPedidos.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlHistorialPedidos.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlHistorialPedidos.setLayout(gbl_pnlHistorialPedidos);
		
		spHistorial = new JScrollPane();
		GridBagConstraints gbc_spHistorial = new GridBagConstraints();
		gbc_spHistorial.fill = GridBagConstraints.BOTH;
		gbc_spHistorial.gridx = 0;
		gbc_spHistorial.gridy = 0;
		pnlHistorialPedidos.add(spHistorial, gbc_spHistorial);
		
		tbHistorial = new JTable();
		tbHistorial.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "A domicilio", "En elaboraci\u00F3n", new Double(24.67), null, "21:37", null, "22:00", "Calle Concepci\u00F3n Arenal, N7, Ciudad Real"},
				{new Integer(2), "Recogida", "Recogido", new Double(9.8), null, "20:07", "20:30", null, null},
			},
			new String[] {
				"Pedido", "Tipo", "Estado", "Importe total", "Pagado", "Fecha y hora", "Hora recogida", "Hora llegada", "Direcci\u00F3n env\u00EDo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Double.class, Boolean.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbHistorial.getColumnModel().getColumn(4).setResizable(false);
		spHistorial.setViewportView(tbHistorial);
		
		pnlPuntos = new JPanel();
		pnlPuntos.setBorder(new TitledBorder(null, "Puntos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlPuntos = new GridBagConstraints();
		gbc_pnlPuntos.fill = GridBagConstraints.BOTH;
		gbc_pnlPuntos.gridx = 1;
		gbc_pnlPuntos.gridy = 1;
		add(pnlPuntos, gbc_pnlPuntos);
		GridBagLayout gbl_pnlPuntos = new GridBagLayout();
		gbl_pnlPuntos.columnWidths = new int[]{0, 35, 0};
		gbl_pnlPuntos.rowHeights = new int[]{59, 0, 46, 0, 0};
		gbl_pnlPuntos.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlPuntos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlPuntos.setLayout(gbl_pnlPuntos);
		
		lblPuntosAcumulados = new JLabel("Puntos acumulados:");
		GridBagConstraints gbc_lblPuntosAcumulados = new GridBagConstraints();
		gbc_lblPuntosAcumulados.gridwidth = 2;
		gbc_lblPuntosAcumulados.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntosAcumulados.gridx = 0;
		gbc_lblPuntosAcumulados.gridy = 0;
		pnlPuntos.add(lblPuntosAcumulados, gbc_lblPuntosAcumulados);
		
		label = new JLabel("3");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setForeground(Color.RED);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		pnlPuntos.add(label, gbc_label);
		
		lblVlidosHasta = new JLabel("V\u00E1lidos hasta:");
		GridBagConstraints gbc_lblVlidosHasta = new GridBagConstraints();
		gbc_lblVlidosHasta.gridwidth = 2;
		gbc_lblVlidosHasta.insets = new Insets(0, 0, 5, 5);
		gbc_lblVlidosHasta.gridx = 0;
		gbc_lblVlidosHasta.gridy = 2;
		pnlPuntos.add(lblVlidosHasta, gbc_lblVlidosHasta);
		
		label_1 = new JLabel("21/12/18");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setForeground(Color.RED);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 2;
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 3;
		pnlPuntos.add(label_1, gbc_label_1);

	}

}
