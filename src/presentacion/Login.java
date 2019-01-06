package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
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
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Login extends JFrame {

    private static Login frame;
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
    private JLabel lblHelp;
    private JMenuItem mntmInformacinDelAutor;
    private JMenuItem mntmNewMenuItem;
    private JMenuItem mntmSalir;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static Login getFrame() {
        return frame;
    }

    public static void setFrame(Login frame) {
        Login.frame = frame;
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

        mntmSalir = new JMenuItem("Salir");
        mntmSalir.setIcon(new ImageIcon(Login.class.getResource("/presentacion/iconos/exit-to-app-button.png")));
        mntmSalir.addActionListener(new MntmSalirActionListener());
        mnArchivo.add(mntmSalir);

        mnEdicin = new JMenu("Edici\u00F3n");
        menuBar.add(mnEdicin);

        mnVista = new JMenu("Vista");
        menuBar.add(mnVista);

        mnAcercaDe = new JMenu("Acerca de...");
        menuBar.add(mnAcercaDe);

        mntmInformacinDelAutor = new JMenuItem("Autor");
        mntmInformacinDelAutor
                .addActionListener(new MntmInformacinDelAutorActionListener());
        mnAcercaDe.add(mntmInformacinDelAutor);

        mntmNewMenuItem = new JMenuItem("Version | v0.8beta");
        mntmNewMenuItem.addActionListener(new MntmNewMenuItemActionListener());
        mnAcercaDe.add(mntmNewMenuItem);
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
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setToolTipText("Pulse para mostrar la ayuda");
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
        txtIdentificacion.addKeyListener(new TxtIdentificacionKeyListener());
        txtIdentificacion
                .addActionListener(new TxtIdentificacionActionListener());
        txtIdentificacion.addFocusListener(new TxtFocusListener());
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
        lblContrasea.setEnabled(false);

        pwdContraseña = new JPasswordField();
        pwdContraseña.addActionListener(new PwdContraseñaActionListener());
        pwdContraseña.addFocusListener(new TxtFocusListener());
        pwdContraseña.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        GridBagConstraints gbc_pwdContraseña = new GridBagConstraints();
        gbc_pwdContraseña.insets = new Insets(0, 0, 5, 5);
        gbc_pwdContraseña.gridwidth = 2;
        gbc_pwdContraseña.fill = GridBagConstraints.HORIZONTAL;
        gbc_pwdContraseña.gridx = 2;
        gbc_pwdContraseña.gridy = 4;
        pnlCentral.add(pwdContraseña, gbc_pwdContraseña);
        pwdContraseña.setEnabled(false);

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
        btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnEntrar.setIcon(new ImageIcon(Login.class.getResource(
                "/presentacion/iconos/exit-to-app-button (1).png")));
        btnEntrar.addActionListener(new BtnEntrarActionListener());

        cbIdioma = new JComboBox();
        cbIdioma.setToolTipText(
                "Seleccione el idioma con el que desee usar la aplicación");
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
            if (txtIdentificacion.getText().equals("ipo")
                    && pwdContraseña.getText().equals("tpv")) {
                TPV tpv = new TPV();
                tpv.setExtendedState(MAXIMIZED_BOTH);
                frame.setVisible(false);
                tpv.setVisible(true);
            } else {
                if (txtIdentificacion.getText().equals("ipo")) {
                    JOptionPane.showMessageDialog(frame,
                            "Contraseña incorrecta", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Los datos introducidos no se corresponden con ningún usuario",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }

    private class TxtFocusListener extends FocusAdapter {
        @Override
        public void focusGained(FocusEvent e) {
            e.getComponent().setBackground(new Color(250, 250, 150));
        }

        @Override
        public void focusLost(FocusEvent e) {
            e.getComponent().setBackground(new Color(250, 250, 250));
        }
    }

    private class TxtIdentificacionActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            lblContrasea.setEnabled(true);
            pwdContraseña.setEnabled(true);
            pwdContraseña.requestFocus();
        }
    }

    private class PwdContraseñaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btnEntrar.requestFocus();
        }
    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(frame,
                    "Introduzca sus datos para entrar a la aplicación. \nEjemplo:"
                            + "\n\nIdentificación: ipo\n" + "Contraseña: tpv",
                    "Ayuda", JOptionPane.QUESTION_MESSAGE);

        }
    }

    private class TxtIdentificacionKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            lblContrasea.setEnabled(true);
            pwdContraseña.setEnabled(true);
        }
    }

    private class MntmInformacinDelAutorActionListener
            implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame,
                    "Este prototipo ha sido desarrollado por Sergio Herrera Piqueras, \nalumno de la Escuela Superior de Informática de Ciudad Real, \npara la práctica final de la asignatura Interacción Persona-Ordenador I.",
                    "Autor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MntmNewMenuItemActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "| 06/01/19 |\r\n" + "\r\n"
                    + "TPV v0.7.8\r\n" + "- pnlDatosCliente now is dynamic\r\n"
                    + "- pnlControl now is working\r\n"
                    + "- Some design improvements\r\n" + "\r\n"
                    + "TPV v0.7.7\r\n" + "- Feedback added to login window\r\n"
                    + "- pnlControl confirm dialog added (without action for now)\r\n"
                    + "\r\n" + "TPV v0.7.6\r\n"
                    + "- Design style improved and better resource management\r\n"
                    + "\r\n" + "| 11/12/18 |\r\n" + "\r\n" + "TPV v0.7.5\r\n"
                    + "- Design improvements\r\n" + "\r\n" + "TPV v0.7.4\r\n"
                    + "- TPV is now maximized by default\r\n"
                    + "- Version label updated\r\n" + "\r\n" + "TPV v0.7.3\r\n"
                    + "- Login: language is now shown\r\n" + "\r\n"
                    + "TPV v0.7.2\r\n" + "- Login: minor visual changes\r\n"
                    + "\r\n" + "| 10/12/18 |\r\n" + "\r\n" + "TPV v0.7.1\r\n"
                    + "- pnlOfertas: new proposal\r\n" + "\r\n" + "TPV v0.7\r\n"
                    + "- Login: font changes\r\n"
                    + "- Login: demo implemented\r\n"
                    + "- pnlCallejero: image changed\r\n"
                    + "- Other style changes\r\n" + "\r\n" + "TPV v0.6\r\n"
                    + "- pnlCallejero first version\r\n"
                    + "- Design improvements (font changes)\r\n" + "\r\n"
                    + "TPV v0.5\r\n" + "- pnlClientes first version\r\n"
                    + "\r\n" + "TPV v0.4.1\r\n"
                    + "- pnlProductos improvements\r\n" + "\r\n"
                    + "TPV v0.4\r\n" + "- pnlProductos first version\r\n"
                    + "\r\n" + "TPV v0.3.3\r\n" + "- pnlOfertas rebased\r\n"
                    + "\r\n" + "TPV v0.3.2\r\n" + "- pnlPedidos rebased\r\n"
                    + "\r\n" + "TPV v0.3.1\r\n" + "- Minor design changes\r\n"
                    + "\r\n" + "| 09/12/18 |\r\n" + "\r\n" + "TPV v0.3\r\n"
                    + "- pnlOfertas first version\r\n" + "\r\n" + "TPV v0.2\r\n"
                    + "- pnlPedidos first version\r\n" + "\r\n"
                    + "| 07/12/18 |\r\n" + "\r\n" + "TPV v0.1\r\n"
                    + "- Login form first version\r\n" + "- TPV created",
                    "Changelog", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MntmSalirActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(frame,
                    "¿Estás seguro de que quieres salir?", "Cuidado",
                    JOptionPane.YES_NO_OPTION) == 0) {
                System.exit(0);
            }
        }
    }
}
