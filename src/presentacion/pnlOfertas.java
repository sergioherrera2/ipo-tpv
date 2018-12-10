package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;

public class pnlOfertas extends JPanel {
	private JPanel pnlPromociones;
	private JPanel pnlOfertas;
	private JButton btnNuevaOferta;
	private JButton btnEditarOferta;
	private JButton btnBorrarOferta;
	private JButton btnSeleccionar;
	private JButton btnEnviarOferta;
	private JPanel pnlInfo;
	private JPanel pnlClientes;
	private JScrollPane spOfertas;
	private JTextArea taInfo;
	private JScrollPane spClientes;
	private JList lsClientes;
	private JScrollPane spPromociones;
	private JPanel pnlPromo1;
	private JLabel lblProducto1;
	private JLabel lblPostre1;
	private JTextField txtHamburguesaYHelado;
	private JPanel pnlOferta1;
	private JLabel lblOfertaBebida;
	private JTextField txtBebidaPorSolo;

	/**
	 * Create the panel.
	 */
	public pnlOfertas() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{771, 507, 100, 0};
		gridBagLayout.rowHeights = new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnlPromociones = new JPanel();
		pnlPromociones.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlPromociones.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Promociones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_pnlPromociones = new GridBagConstraints();
		gbc_pnlPromociones.gridheight = 5;
		gbc_pnlPromociones.gridwidth = 2;
		gbc_pnlPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPromociones.fill = GridBagConstraints.BOTH;
		gbc_pnlPromociones.gridx = 0;
		gbc_pnlPromociones.gridy = 0;
		add(pnlPromociones, gbc_pnlPromociones);
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[]{1156, 0};
		gbl_pnlPromociones.rowHeights = new int[]{220, 0};
		gbl_pnlPromociones.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlPromociones.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlPromociones.setLayout(gbl_pnlPromociones);
		
		spPromociones = new JScrollPane();
		GridBagConstraints gbc_spPromociones = new GridBagConstraints();
		gbc_spPromociones.fill = GridBagConstraints.BOTH;
		gbc_spPromociones.gridx = 0;
		gbc_spPromociones.gridy = 0;
		pnlPromociones.add(spPromociones, gbc_spPromociones);
		
		pnlPromo1 = new JPanel();
		spPromociones.setViewportView(pnlPromo1);
		GridBagLayout gbl_pnlPromo1 = new GridBagLayout();
		gbl_pnlPromo1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlPromo1.rowHeights = new int[]{0, 0, 0};
		gbl_pnlPromo1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlPromo1.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		pnlPromo1.setLayout(gbl_pnlPromo1);
		
		lblProducto1 = new JLabel("");
		lblProducto1.setIcon(new ImageIcon(pnlOfertas.class.getResource("/presentacion/iconos/hamburger.png")));
		GridBagConstraints gbc_lblProducto1 = new GridBagConstraints();
		gbc_lblProducto1.fill = GridBagConstraints.BOTH;
		gbc_lblProducto1.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducto1.gridx = 0;
		gbc_lblProducto1.gridy = 0;
		pnlPromo1.add(lblProducto1, gbc_lblProducto1);
		
		lblPostre1 = new JLabel("");
		lblPostre1.setIcon(new ImageIcon(pnlOfertas.class.getResource("/presentacion/iconos/ice-cream.png")));
		GridBagConstraints gbc_lblPostre1 = new GridBagConstraints();
		gbc_lblPostre1.fill = GridBagConstraints.BOTH;
		gbc_lblPostre1.insets = new Insets(0, 0, 5, 0);
		gbc_lblPostre1.gridx = 1;
		gbc_lblPostre1.gridy = 0;
		pnlPromo1.add(lblPostre1, gbc_lblPostre1);
		
		txtHamburguesaYHelado = new JTextField();
		txtHamburguesaYHelado.setEditable(false);
		txtHamburguesaYHelado.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		txtHamburguesaYHelado.setText("Hamburguesa y helado por 4,50\u20AC!");
		GridBagConstraints gbc_txtHamburguesaYHelado = new GridBagConstraints();
		gbc_txtHamburguesaYHelado.fill = GridBagConstraints.BOTH;
		gbc_txtHamburguesaYHelado.gridwidth = 2;
		gbc_txtHamburguesaYHelado.insets = new Insets(0, 0, 0, 5);
		gbc_txtHamburguesaYHelado.gridx = 0;
		gbc_txtHamburguesaYHelado.gridy = 1;
		pnlPromo1.add(txtHamburguesaYHelado, gbc_txtHamburguesaYHelado);
		txtHamburguesaYHelado.setColumns(10);
		
		btnNuevaOferta = new JButton("Nueva oferta");
		btnNuevaOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNuevaOferta = new GridBagConstraints();
		gbc_btnNuevaOferta.fill = GridBagConstraints.BOTH;
		gbc_btnNuevaOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnNuevaOferta.gridx = 2;
		gbc_btnNuevaOferta.gridy = 0;
		add(btnNuevaOferta, gbc_btnNuevaOferta);
		
		btnEditarOferta = new JButton("Editar oferta");
		btnEditarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
		gbc_btnEditarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarOferta.gridx = 2;
		gbc_btnEditarOferta.gridy = 1;
		add(btnEditarOferta, gbc_btnEditarOferta);
		
		pnlOfertas = new JPanel();
		pnlOfertas.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlOfertas.setBorder(new TitledBorder(null, "Ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlOfertas = new GridBagConstraints();
		gbc_pnlOfertas.gridheight = 5;
		gbc_pnlOfertas.gridwidth = 2;
		gbc_pnlOfertas.insets = new Insets(0, 0, 5, 5);
		gbc_pnlOfertas.fill = GridBagConstraints.BOTH;
		gbc_pnlOfertas.gridx = 0;
		gbc_pnlOfertas.gridy = 5;
		add(pnlOfertas, gbc_pnlOfertas);
		GridBagLayout gbl_pnlOfertas = new GridBagLayout();
		gbl_pnlOfertas.columnWidths = new int[]{583, 0};
		gbl_pnlOfertas.rowHeights = new int[]{2, 0};
		gbl_pnlOfertas.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlOfertas.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlOfertas.setLayout(gbl_pnlOfertas);
		
		spOfertas = new JScrollPane();
		GridBagConstraints gbc_spOfertas = new GridBagConstraints();
		gbc_spOfertas.fill = GridBagConstraints.BOTH;
		gbc_spOfertas.gridx = 0;
		gbc_spOfertas.gridy = 0;
		pnlOfertas.add(spOfertas, gbc_spOfertas);
		
		pnlOferta1 = new JPanel();
		spOfertas.setViewportView(pnlOferta1);
		GridBagLayout gbl_pnlOferta1 = new GridBagLayout();
		gbl_pnlOferta1.columnWidths = new int[]{214, 0};
		gbl_pnlOferta1.rowHeights = new int[]{30, 0, 0};
		gbl_pnlOferta1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlOferta1.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		pnlOferta1.setLayout(gbl_pnlOferta1);
		
		lblOfertaBebida = new JLabel("");
		lblOfertaBebida.setIcon(new ImageIcon(pnlOfertas.class.getResource("/presentacion/iconos/soft-drink.png")));
		GridBagConstraints gbc_lblOfertaBebida = new GridBagConstraints();
		gbc_lblOfertaBebida.fill = GridBagConstraints.VERTICAL;
		gbc_lblOfertaBebida.insets = new Insets(0, 0, 5, 0);
		gbc_lblOfertaBebida.gridx = 0;
		gbc_lblOfertaBebida.gridy = 0;
		pnlOferta1.add(lblOfertaBebida, gbc_lblOfertaBebida);
		
		txtBebidaPorSolo = new JTextField();
		txtBebidaPorSolo.setText("Bebida por solo 1,30\u20AC!");
		GridBagConstraints gbc_txtBebidaPorSolo = new GridBagConstraints();
		gbc_txtBebidaPorSolo.fill = GridBagConstraints.BOTH;
		gbc_txtBebidaPorSolo.gridx = 0;
		gbc_txtBebidaPorSolo.gridy = 1;
		pnlOferta1.add(txtBebidaPorSolo, gbc_txtBebidaPorSolo);
		txtBebidaPorSolo.setColumns(10);
		
		btnBorrarOferta = new JButton("Borrar oferta");
		btnBorrarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
		gbc_btnBorrarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnBorrarOferta.gridx = 2;
		gbc_btnBorrarOferta.gridy = 9;
		add(btnBorrarOferta, gbc_btnBorrarOferta);
		
		pnlInfo = new JPanel();
		pnlInfo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlInfo.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlInfo = new GridBagConstraints();
		gbc_pnlInfo.gridheight = 4;
		gbc_pnlInfo.insets = new Insets(0, 0, 0, 5);
		gbc_pnlInfo.fill = GridBagConstraints.BOTH;
		gbc_pnlInfo.gridx = 0;
		gbc_pnlInfo.gridy = 10;
		add(pnlInfo, gbc_pnlInfo);
		pnlInfo.setLayout(new GridLayout(0, 1, 0, 0));
		
		taInfo = new JTextArea();
		taInfo.setFont(new Font("Segoe UI", Font.BOLD, 13));
		taInfo.setEditable(false);
		taInfo.setText("Oferta v\u00E1lida hasta el 31 de diciembre de 2018...");
		taInfo.setEnabled(false);
		pnlInfo.add(taInfo);
		
		pnlClientes = new JPanel();
		pnlClientes.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		pnlClientes.setBorder(new TitledBorder(null, "Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlClientes = new GridBagConstraints();
		gbc_pnlClientes.gridheight = 4;
		gbc_pnlClientes.insets = new Insets(0, 0, 0, 5);
		gbc_pnlClientes.fill = GridBagConstraints.BOTH;
		gbc_pnlClientes.gridx = 1;
		gbc_pnlClientes.gridy = 10;
		add(pnlClientes, gbc_pnlClientes);
		pnlClientes.setLayout(new GridLayout(1, 0, 0, 0));
		
		spClientes = new JScrollPane();
		pnlClientes.add(spClientes);
		
		lsClientes = new JList();
		lsClientes.setModel(new AbstractListModel() {
			String[] values = new String[] {"sergio.herrera2@alu.uclm.es", "manolofergn@gmail.com"};
			@Override
			public int getSize() {
				return values.length;
			}
			@Override
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spClientes.setViewportView(lsClientes);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.fill = GridBagConstraints.BOTH;
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionar.gridx = 2;
		gbc_btnSeleccionar.gridy = 12;
		add(btnSeleccionar, gbc_btnSeleccionar);
		
		btnEnviarOferta = new JButton("Enviar oferta");
		btnEnviarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnEnviarOferta = new GridBagConstraints();
		gbc_btnEnviarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnEnviarOferta.gridx = 2;
		gbc_btnEnviarOferta.gridy = 13;
		add(btnEnviarOferta, gbc_btnEnviarOferta);

	}
}
