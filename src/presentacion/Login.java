package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnEdicin;
	private JMenu mnVista;
	private JMenu mnAcercaDe;
	private JPanel pnlCentral;
	private JLabel lblImage;
	private JLabel lblIdentificacion;
	private JLabel lblContrasea;
	private JTextField txtIdentificacion;
	private JPasswordField pwdContraseña;
	private JComboBox cbIdioma;
	private JButton btnEntrar;
	private JPanel pnlInferior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/food-2074638_960_720 - resized.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		pnlCentral = new JPanel();
		pnlCentral.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pnlCentral, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCentral = new GridBagLayout();
		gbl_pnlCentral.columnWidths = new int[] { 0, 238, 91, 111, 0, 0 };
		gbl_pnlCentral.rowHeights = new int[] { 0, 41, 36, 48, 0, 0 };
		gbl_pnlCentral.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_pnlCentral.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlCentral.setLayout(gbl_pnlCentral);

		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Login.class.getResource("/presentacion/food-2074638_960_720 - resized.png")));
		// lblImage.setIcon(new
		// ImageIcon(Login.class.getResource("/presentacion/food-2074638_960_720.png")));
		GridBagConstraints gbc_lblImage = new GridBagConstraints();
		gbc_lblImage.gridheight = 4;
		gbc_lblImage.insets = new Insets(0, 0, 0, 5);
		gbc_lblImage.gridx = 1;
		gbc_lblImage.gridy = 1;
		pnlCentral.add(lblImage, gbc_lblImage);
		
		lblIdentificacion = new JLabel("Identificaci\u00F3n:");
		GridBagConstraints gbc_lblIdentificacion = new GridBagConstraints();
		gbc_lblIdentificacion.anchor = GridBagConstraints.EAST;
		gbc_lblIdentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificacion.gridx = 2;
		gbc_lblIdentificacion.gridy = 2;
		pnlCentral.add(lblIdentificacion, gbc_lblIdentificacion);
		
		txtIdentificacion = new JTextField();
		GridBagConstraints gbc_txtIdentificacion = new GridBagConstraints();
		gbc_txtIdentificacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdentificacion.gridx = 3;
		gbc_txtIdentificacion.gridy = 2;
		pnlCentral.add(txtIdentificacion, gbc_txtIdentificacion);
		txtIdentificacion.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 2;
		gbc_lblContrasea.gridy = 3;
		pnlCentral.add(lblContrasea, gbc_lblContrasea);
		
		pwdContraseña = new JPasswordField();
		GridBagConstraints gbc_pwdContraseña = new GridBagConstraints();
		gbc_pwdContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_pwdContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_pwdContraseña.gridx = 3;
		gbc_pwdContraseña.gridy = 3;
		pnlCentral.add(pwdContraseña, gbc_pwdContraseña);
		
		pnlInferior = new JPanel();
		contentPane.add(pnlInferior, BorderLayout.SOUTH);
		
		cbIdioma = new JComboBox();
		pnlInferior.add(cbIdioma);
		cbIdioma.setName("");
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setHorizontalAlignment(SwingConstants.RIGHT);
		pnlInferior.add(btnEntrar);
	}

}
