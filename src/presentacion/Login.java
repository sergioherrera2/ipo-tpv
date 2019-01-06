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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame {

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
    private JLabel lblDemoPulseEntrar;
    private JLabel lblHelp;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
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
        setBackground(Color.DARK_GRAY);

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 570, 375);

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
        contentPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        pnlCentral = new JPanel();
        pnlCentral.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlCentral.setBorder(new TitledBorder(null, "Login",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        contentPane.add(pnlCentral, BorderLayout.CENTER);
        GridBagLayout gbl_pnlCentral = new GridBagLayout();
        gbl_pnlCentral.columnWidths = new int[] { 0, 238, 91, 111, 0, 0 };
        gbl_pnlCentral.rowHeights = new int[] { 0, 41, 36, 48, 0, 0, 0, 0 };
        gbl_pnlCentral.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0,
                Double.MIN_VALUE };
        gbl_pnlCentral.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, Double.MIN_VALUE };
        pnlCentral.setLayout(gbl_pnlCentral);

        lblHelp = new JLabel("");
        lblHelp.setIcon(new ImageIcon(Login.class
                .getResource("/presentacion/iconos/information.png")));
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 4;
        gbc_lblHelp.gridy = 0;
        pnlCentral.add(lblHelp, gbc_lblHelp);

        lblImage = new JLabel("");
        lblImage.setIcon(new ImageIcon(Login.class.getResource(
                "/presentacion/imagenes/food-2074638_960_720 - resized.png")));
        
        GridBagConstraints gbc_lblImage = new GridBagConstraints();
        gbc_lblImage.gridwidth = 2;
        gbc_lblImage.fill = GridBagConstraints.VERTICAL;
        gbc_lblImage.gridheight = 5;
        gbc_lblImage.insets = new Insets(0, 0, 5, 5);
        gbc_lblImage.gridx = 0;
        gbc_lblImage.gridy = 1;
        pnlCentral.add(lblImage, gbc_lblImage);

        lblIdentificacion = new JLabel("Identificaci\u00F3n:");
        lblIdentificacion.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        GridBagConstraints gbc_lblIdentificacion = new GridBagConstraints();
        gbc_lblIdentificacion.anchor = GridBagConstraints.EAST;
        gbc_lblIdentificacion.insets = new Insets(0, 0, 5, 5);
        gbc_lblIdentificacion.gridx = 2;
        gbc_lblIdentificacion.gridy = 1;
        pnlCentral.add(lblIdentificacion, gbc_lblIdentificacion);

        txtIdentificacion = new JTextField();
        txtIdentificacion.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        GridBagConstraints gbc_txtIdentificacion = new GridBagConstraints();
        gbc_txtIdentificacion.gridwidth = 2;
        gbc_txtIdentificacion.insets = new Insets(0, 0, 5, 5);
        gbc_txtIdentificacion.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtIdentificacion.gridx = 2;
        gbc_txtIdentificacion.gridy = 2;
        pnlCentral.add(txtIdentificacion, gbc_txtIdentificacion);
        txtIdentificacion.setColumns(10);

        lblContrasea = new JLabel("Contrase\u00F1a:");
        lblContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
        gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
        gbc_lblContrasea.gridx = 2;
        gbc_lblContrasea.gridy = 3;
        pnlCentral.add(lblContrasea, gbc_lblContrasea);

        pwdContraseña = new JPasswordField();
        pwdContraseña.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        GridBagConstraints gbc_pwdContraseña = new GridBagConstraints();
        gbc_pwdContraseña.insets = new Insets(0, 0, 5, 5);
        gbc_pwdContraseña.gridwidth = 2;
        gbc_pwdContraseña.fill = GridBagConstraints.HORIZONTAL;
        gbc_pwdContraseña.gridx = 2;
        gbc_pwdContraseña.gridy = 4;
        pnlCentral.add(pwdContraseña, gbc_pwdContraseña);

        lblDemoPulseEntrar = new JLabel(
                "Demo: pulse entrar sin introducir nada");
        lblDemoPulseEntrar.setForeground(Color.DARK_GRAY);
        GridBagConstraints gbc_lblDemoPulseEntrar = new GridBagConstraints();
        gbc_lblDemoPulseEntrar.gridwidth = 2;
        gbc_lblDemoPulseEntrar.insets = new Insets(0, 0, 0, 5);
        gbc_lblDemoPulseEntrar.gridx = 2;
        gbc_lblDemoPulseEntrar.gridy = 6;
        pnlCentral.add(lblDemoPulseEntrar, gbc_lblDemoPulseEntrar);
        lblDemoPulseEntrar.setFont(new Font("Segoe UI", Font.ITALIC, 13));

        pnlInferior = new JPanel();
        pnlInferior.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        contentPane.add(pnlInferior, BorderLayout.SOUTH);
        GridBagLayout gbl_pnlInferior = new GridBagLayout();
        gbl_pnlInferior.columnWidths = new int[] { 100, 262, 100, 0 };
        gbl_pnlInferior.rowHeights = new int[] { 50, 0 };
        gbl_pnlInferior.columnWeights = new double[] { 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlInferior.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
        pnlInferior.setLayout(gbl_pnlInferior);

        btnEntrar = new JButton("Entrar");
        btnEntrar.setIcon(new ImageIcon(Login.class.getResource("/presentacion/iconos/exit-to-app-button (1).png")));
        btnEntrar.addActionListener(new BtnEntrarActionListener());

        cbIdioma = new JComboBox();
        cbIdioma.setModel(new DefaultComboBoxModel(
                new String[] { "Espa\u00F1ol", "Ingl\u00E9s" }));
        cbIdioma.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        GridBagConstraints gbc_cbIdioma = new GridBagConstraints();
        gbc_cbIdioma.fill = GridBagConstraints.BOTH;
        gbc_cbIdioma.insets = new Insets(0, 0, 0, 5);
        gbc_cbIdioma.gridx = 0;
        gbc_cbIdioma.gridy = 0;
        pnlInferior.add(cbIdioma, gbc_cbIdioma);
        cbIdioma.setName("");
        btnEntrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
        gbc_btnEntrar.fill = GridBagConstraints.BOTH;
        gbc_btnEntrar.gridx = 2;
        gbc_btnEntrar.gridy = 0;
        pnlInferior.add(btnEntrar, gbc_btnEntrar);
    }

    private class BtnEntrarActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            TPV tpv = new TPV();
            tpv.setExtendedState(MAXIMIZED_BOTH);
            tpv.setVisible(true);
        }
    }
}
