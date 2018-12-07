package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Dimension;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TPV frame = new TPV();
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
				.getImage(TPV.class.getResource("/presentacion/food-2074638_960_720 - resized.png")));
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

		pnlUsuario = new pnlUsuario();
		pnlSuperior.add(pnlUsuario);

		pnlBanner = new JPanel();
		pnlSuperior.add(pnlBanner);

		lblBanner = new JLabel("BANNER");
		pnlBanner.add(lblBanner);

		pnlControl = new pnlControl();
		pnlControl.setMinimumSize(new Dimension(246, 99));
		pnlSuperior.add(pnlControl);
		
		tbpCentral = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tbpCentral, BorderLayout.CENTER);
		
		pnlPedidos = new JPanel();
		tbpCentral.addTab("Pedidos", null, pnlPedidos, null);
		
		pnlOfertas = new JPanel();
		tbpCentral.addTab("Ofertas", null, pnlOfertas, null);
		
		pnlProductos = new JPanel();
		tbpCentral.addTab("Productos", null, pnlProductos, null);
		
		pnlClientes = new JPanel();
		tbpCentral.addTab("Clientes", null, pnlClientes, null);
		
		pnlCallejero = new JPanel();
		tbpCentral.addTab("Callejero", null, pnlCallejero, null);
	}

}
