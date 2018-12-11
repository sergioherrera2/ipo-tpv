package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class TPV extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnEdicin;
	private JMenu mnVista;
	private JMenu mnAcercaDe;
	private JPanel pnlSuperior;
	private JPanel pnlUsuario;
	private JPanel pnlBanner;
	private JLabel lblBanner;
	private JPanel pnlControl;
	private JTabbedPane tbpCentral;
	private JPanel pnlPedidos;
	private JPanel pnlOfertas;
	private JPanel pnlProductos;
	private JPanel pnlClientes;
	private JPanel pnlCallejero;
	private JLabel lbldemoV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TPV frame = new TPV();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public TPV() {
		setTitle("TPV");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(TPV.class.getResource("/presentacion/iconos/food-2074638_960_720 - resized.png")));
		setBounds(new Rectangle(0, 0, 1920, 1080));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mnEdicin = new JMenu("Edici\u00F3n");
		menuBar.add(mnEdicin);

		mnVista = new JMenu("Vista");
		menuBar.add(mnVista);

		mnAcercaDe = new JMenu("Acerca de...");
		menuBar.add(mnAcercaDe);
		// setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		pnlSuperior = new JPanel();
		contentPane.add(pnlSuperior, BorderLayout.NORTH);
		GridBagLayout gbl_pnlSuperior = new GridBagLayout();
		gbl_pnlSuperior.columnWidths = new int[] { 306, 56, 0, 0 };
		gbl_pnlSuperior.rowHeights = new int[] { 143, 0 };
		gbl_pnlSuperior.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlSuperior.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pnlSuperior.setLayout(gbl_pnlSuperior);

		pnlUsuario = new pnlUsuario();
		GridBagConstraints gbc_pnlUsuario = new GridBagConstraints();
		gbc_pnlUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_pnlUsuario.anchor = GridBagConstraints.WEST;
		gbc_pnlUsuario.insets = new Insets(0, 0, 0, 5);
		gbc_pnlUsuario.gridx = 0;
		gbc_pnlUsuario.gridy = 0;
		pnlSuperior.add(pnlUsuario, gbc_pnlUsuario);

		pnlBanner = new JPanel();
		GridBagConstraints gbc_pnlBanner = new GridBagConstraints();
		gbc_pnlBanner.fill = GridBagConstraints.BOTH;
		gbc_pnlBanner.insets = new Insets(0, 0, 0, 5);
		gbc_pnlBanner.gridx = 1;
		gbc_pnlBanner.gridy = 0;
		pnlSuperior.add(pnlBanner, gbc_pnlBanner);
		GridBagLayout gbl_pnlBanner = new GridBagLayout();
		gbl_pnlBanner.columnWidths = new int[] { 575, 0, 0 };
		gbl_pnlBanner.rowHeights = new int[] { 55, 0 };
		gbl_pnlBanner.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_pnlBanner.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pnlBanner.setLayout(gbl_pnlBanner);

		lblBanner = new JLabel("\u00A1Bienvenido/a!");
		lblBanner.setFont(new Font("Segoe UI Black", Font.PLAIN, 40));
		GridBagConstraints gbc_lblBanner = new GridBagConstraints();
		gbc_lblBanner.insets = new Insets(0, 0, 0, 5);
		gbc_lblBanner.gridx = 0;
		gbc_lblBanner.gridy = 0;
		pnlBanner.add(lblBanner, gbc_lblBanner);

		lbldemoV = new JLabel("(Demo - v0.7.1)");
		lbldemoV.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		GridBagConstraints gbc_lbldemoV = new GridBagConstraints();
		gbc_lbldemoV.gridx = 1;
		gbc_lbldemoV.gridy = 0;
		pnlBanner.add(lbldemoV, gbc_lbldemoV);

		pnlControl = new pnlControl();
		pnlControl.setMinimumSize(new Dimension(246, 99));
		GridBagConstraints gbc_pnlControl = new GridBagConstraints();
		gbc_pnlControl.fill = GridBagConstraints.BOTH;
		gbc_pnlControl.gridx = 2;
		gbc_pnlControl.gridy = 0;
		pnlSuperior.add(pnlControl, gbc_pnlControl);

		tbpCentral = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tbpCentral, BorderLayout.CENTER);

		pnlPedidos = new pnlPedidos();
		tbpCentral.addTab("Pedidos", null, pnlPedidos, null);

		pnlOfertas = new pnlOfertas();
		tbpCentral.addTab("Ofertas", null, pnlOfertas, null);

		pnlProductos = new pnlProductos();
		tbpCentral.addTab("Productos", null, pnlProductos, null);

		pnlClientes = new pnlClientes();
		tbpCentral.addTab("Clientes", null, pnlClientes, null);

		pnlCallejero = new pnlCallejero();
		tbpCentral.addTab("Callejero", null, pnlCallejero, null);
	}

}
