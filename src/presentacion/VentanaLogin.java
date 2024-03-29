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

import presentacion.listeners.MiFocusListener;
import presentacion.messages.MessagesVentanaLogin;
import presentacion.messages.MessagesVentanaPrincipal;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class VentanaLogin extends JFrame {

    private static VentanaLogin frame;
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
    private JButton btnEntrar;
    private JPanel pnlInferior;
    private JLabel lblHelp;
    private JMenuItem mntmInformacinDelAutor;
    private JMenuItem mntmNewMenuItem;
    private JMenuItem mntmSalir;
    private JMenu mnTamaoDeLetra;
    private JRadioButtonMenuItem rdbtnmntmPequea;
    private JRadioButtonMenuItem rdbtnmntmMediana;
    private JRadioButtonMenuItem rdbtnmntmGrande;
    private JRadioButton rdbtnEspaol;
    private JRadioButton rdbtnEnglish;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JLabel lblVersion;
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new VentanaLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static VentanaLogin getFrame() {
        return frame;
    }

    public static void setFrame(VentanaLogin frame) {
        VentanaLogin.frame = frame;
    }

    /**
     * Create the frame.
     */
    public VentanaLogin() {
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(VentanaLogin.class.getResource(
                        "/presentacion/imagenes/food-2074638_960_720 - resized.png"))); //$NON-NLS-1$
        setBackground(Color.DARK_GRAY);

        setTitle("Login"); //$NON-NLS-1$
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 570, 375);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnArchivo = new JMenu(
                MessagesVentanaLogin.getString("VentanaLogin.mnArchivo.text")); //$NON-NLS-1$
        menuBar.add(mnArchivo);

        mntmSalir = new JMenuItem(
                MessagesVentanaLogin.getString("VentanaLogin.mntmSalir.text")); //$NON-NLS-1$
        mntmSalir.setIcon(new ImageIcon(VentanaLogin.class
                .getResource("/presentacion/iconos/exit-to-app-button.png"))); //$NON-NLS-1$
        mntmSalir.addActionListener(new MntmSalirActionListener());
        mnArchivo.add(mntmSalir);

        mnEdicin = new JMenu(
                MessagesVentanaLogin.getString("VentanaLogin.mnEdicin.text")); //$NON-NLS-1$
        menuBar.add(mnEdicin);

        mnVista = new JMenu(
                MessagesVentanaLogin.getString("VentanaLogin.mnVista.text")); //$NON-NLS-1$
        menuBar.add(mnVista);

        mnTamaoDeLetra = new JMenu(MessagesVentanaLogin
                .getString("VentanaLogin.mnTamaoDeLetra.text")); //$NON-NLS-1$
        mnVista.add(mnTamaoDeLetra);

        rdbtnmntmPequea = new JRadioButtonMenuItem(MessagesVentanaLogin
                .getString("VentanaLogin.rdbtnmntmPequea.text")); //$NON-NLS-1$
        buttonGroup_1.add(rdbtnmntmPequea);
        mnTamaoDeLetra.add(rdbtnmntmPequea);

        rdbtnmntmMediana = new JRadioButtonMenuItem(MessagesVentanaLogin
                .getString("VentanaLogin.rdbtnmntmMediana.text")); //$NON-NLS-1$
        buttonGroup_1.add(rdbtnmntmMediana);
        rdbtnmntmMediana.setSelected(true);
        mnTamaoDeLetra.add(rdbtnmntmMediana);

        rdbtnmntmGrande = new JRadioButtonMenuItem(MessagesVentanaLogin
                .getString("VentanaLogin.rdbtnmntmGrande.text")); //$NON-NLS-1$
        buttonGroup_1.add(rdbtnmntmGrande);
        mnTamaoDeLetra.add(rdbtnmntmGrande);

        mnAcercaDe = new JMenu(
                MessagesVentanaLogin.getString("VentanaLogin.mnAcercaDe.text")); //$NON-NLS-1$
        menuBar.add(mnAcercaDe);

        mntmInformacinDelAutor = new JMenuItem(MessagesVentanaLogin
                .getString("VentanaLogin.mntmInformacinDelAutor.text")); //$NON-NLS-1$
        mntmInformacinDelAutor
                .addActionListener(new MntmInformacinDelAutorActionListener());
        mnAcercaDe.add(mntmInformacinDelAutor);

        mntmNewMenuItem = new JMenuItem(MessagesVentanaLogin
                .getString("VentanaLogin.mntmNewMenuItem.text")); //$NON-NLS-1$
        mntmNewMenuItem.addActionListener(new MntmNewMenuItemActionListener());
        mnAcercaDe.add(mntmNewMenuItem);
        contentPane = new JPanel();
        contentPane.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        pnlCentral = new JPanel();
        pnlCentral.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlCentral.setBorder(new TitledBorder(null, "Login", //$NON-NLS-1$
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

        lblHelp = new JLabel((String) null);
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setToolTipText(MessagesVentanaLogin
                .getString("VentanaLogin.lblHelp.toolTipText")); //$NON-NLS-1$
        lblHelp.setIcon(new ImageIcon(VentanaLogin.class
                .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 4;
        gbc_lblHelp.gridy = 0;
        pnlCentral.add(lblHelp, gbc_lblHelp);

        lblImage = new JLabel(""); //$NON-NLS-1$
        lblImage.setIcon(new ImageIcon(VentanaLogin.class.getResource(
                "/presentacion/imagenes/food-2074638_960_720 - resized.png"))); //$NON-NLS-1$

        GridBagConstraints gbc_lblImage = new GridBagConstraints();
        gbc_lblImage.gridwidth = 2;
        gbc_lblImage.fill = GridBagConstraints.VERTICAL;
        gbc_lblImage.gridheight = 5;
        gbc_lblImage.insets = new Insets(0, 0, 5, 5);
        gbc_lblImage.gridx = 0;
        gbc_lblImage.gridy = 1;
        pnlCentral.add(lblImage, gbc_lblImage);

        lblIdentificacion = new JLabel(MessagesVentanaLogin
                .getString("VentanaLogin.lblIdentificacion.text")); //$NON-NLS-1$
        lblIdentificacion.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
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
        txtIdentificacion.addFocusListener(new MiFocusListener());
        txtIdentificacion.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
        GridBagConstraints gbc_txtIdentificacion = new GridBagConstraints();
        gbc_txtIdentificacion.gridwidth = 2;
        gbc_txtIdentificacion.insets = new Insets(0, 0, 5, 5);
        gbc_txtIdentificacion.fill = GridBagConstraints.HORIZONTAL;
        gbc_txtIdentificacion.gridx = 2;
        gbc_txtIdentificacion.gridy = 2;
        pnlCentral.add(txtIdentificacion, gbc_txtIdentificacion);
        txtIdentificacion.setColumns(10);

        lblContrasea = new JLabel(MessagesVentanaLogin
                .getString("VentanaLogin.lblContrasea.text")); //$NON-NLS-1$
        lblContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
        GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
        gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
        gbc_lblContrasea.gridx = 2;
        gbc_lblContrasea.gridy = 3;
        pnlCentral.add(lblContrasea, gbc_lblContrasea);
        lblContrasea.setEnabled(false);

        pwdContraseña = new JPasswordField();
        pwdContraseña.addActionListener(new PwdContraseñaActionListener());
        pwdContraseña.addFocusListener(new MiFocusListener());
        pwdContraseña.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
        GridBagConstraints gbc_pwdContraseña = new GridBagConstraints();
        gbc_pwdContraseña.insets = new Insets(0, 0, 5, 5);
        gbc_pwdContraseña.gridwidth = 2;
        gbc_pwdContraseña.fill = GridBagConstraints.HORIZONTAL;
        gbc_pwdContraseña.gridx = 2;
        gbc_pwdContraseña.gridy = 4;
        pnlCentral.add(pwdContraseña, gbc_pwdContraseña);
        pwdContraseña.setEnabled(false);

        pnlInferior = new JPanel();
        pnlInferior.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        contentPane.add(pnlInferior, BorderLayout.SOUTH);
        GridBagLayout gbl_pnlInferior = new GridBagLayout();
        gbl_pnlInferior.columnWidths = new int[] { 100, 100, 262, 0, 100, 0 };
        gbl_pnlInferior.rowHeights = new int[] { 50, 0 };
        gbl_pnlInferior.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlInferior.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
        pnlInferior.setLayout(gbl_pnlInferior);

        btnEntrar = new JButton(
                MessagesVentanaLogin.getString("VentanaLogin.btnEntrar.text")); //$NON-NLS-1$
        btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnEntrar.setIcon(new ImageIcon(VentanaLogin.class.getResource(
                "/presentacion/iconos/exit-to-app-button (1).png"))); //$NON-NLS-1$
        btnEntrar.addActionListener(new BtnEntrarActionListener());

        rdbtnEspaol = new JRadioButton(MessagesVentanaLogin
                .getString("VentanaLogin.rdbtnEspaol.text")); //$NON-NLS-1$
        rdbtnEspaol.addActionListener(new RdbtnEspaolActionListener());
        rdbtnEspaol.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
        rdbtnEspaol.setSelected(true);
        buttonGroup.add(rdbtnEspaol);
        GridBagConstraints gbc_rdbtnEspaol = new GridBagConstraints();
        gbc_rdbtnEspaol.insets = new Insets(0, 0, 0, 5);
        gbc_rdbtnEspaol.gridx = 0;
        gbc_rdbtnEspaol.gridy = 0;
        pnlInferior.add(rdbtnEspaol, gbc_rdbtnEspaol);

        rdbtnEnglish = new JRadioButton(MessagesVentanaLogin
                .getString("VentanaLogin.rdbtnEnglish.text")); //$NON-NLS-1$
        rdbtnEnglish.addActionListener(new RdbtnEnglishActionListener());
        rdbtnEnglish.setFont(new Font("Segoe UI", Font.PLAIN, 14)); //$NON-NLS-1$
        buttonGroup.add(rdbtnEnglish);
        GridBagConstraints gbc_rdbtnEnglish = new GridBagConstraints();
        gbc_rdbtnEnglish.insets = new Insets(0, 0, 0, 5);
        gbc_rdbtnEnglish.gridx = 1;
        gbc_rdbtnEnglish.gridy = 0;
        pnlInferior.add(rdbtnEnglish, gbc_rdbtnEnglish);

        lblVersion = new JLabel(MessagesVentanaLogin
                .getString("VentanaLogin.lblNewLabel.text")); //$NON-NLS-1$
        lblVersion.setFont(new Font("Montserrat", Font.PLAIN, 12));
        GridBagConstraints gbc_lblVersion = new GridBagConstraints();
        gbc_lblVersion.insets = new Insets(0, 0, 0, 5);
        gbc_lblVersion.gridx = 3;
        gbc_lblVersion.gridy = 0;
        pnlInferior.add(lblVersion, gbc_lblVersion);
        btnEntrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
        gbc_btnEntrar.fill = GridBagConstraints.BOTH;
        gbc_btnEntrar.gridx = 4;
        gbc_btnEntrar.gridy = 0;
        pnlInferior.add(btnEntrar, gbc_btnEntrar);
    }

    private class BtnEntrarActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if (txtIdentificacion.getText().equals("ipo") //$NON-NLS-1$
                    && pwdContraseña.getText().equals("tpv")) { //$NON-NLS-1$
                VentanaPrincipal tpv;

                if (rdbtnEnglish.isSelected()) {
                    MessagesVentanaPrincipal.setIdioma("inglés"); //$NON-NLS-1$
                    frame.setVisible(false);
                    tpv = new VentanaPrincipal();
                    tpv.setExtendedState(MAXIMIZED_BOTH);
                    tpv.setVisible(true);
                    dispose();
                } else {
                    frame.setVisible(false);
                    tpv = new VentanaPrincipal();
                    tpv.setExtendedState(MAXIMIZED_BOTH);
                    tpv.setVisible(true);
                    dispose();
                }

            } else {
                if (txtIdentificacion.getText().equals("ipo")) { //$NON-NLS-1$
                    JOptionPane.showMessageDialog(frame,
                            MessagesVentanaLogin.getString("VentanaLogin.0"), //$NON-NLS-1$
                            "Error", //$NON-NLS-1$
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame,
                            MessagesVentanaLogin.getString("VentanaLogin.24"), //$NON-NLS-1$
                            "Error", JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$
                }
            }

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
                    MessagesVentanaLogin.getString("VentanaLogin.26") //$NON-NLS-1$
                            + MessagesVentanaLogin.getString("VentanaLogin.1") //$NON-NLS-1$
                            + MessagesVentanaLogin.getString("VentanaLogin.28"), //$NON-NLS-1$
                    MessagesVentanaLogin.getString("VentanaLogin.29"), //$NON-NLS-1$
                    JOptionPane.QUESTION_MESSAGE);

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
            String desc = MessagesVentanaLogin.getString("VentanaLogin.30"); //$NON-NLS-1$
            JOptionPane.showMessageDialog(frame, desc,
                    MessagesVentanaLogin.getString("VentanaLogin.31"), //$NON-NLS-1$
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MntmNewMenuItemActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String desc = "| 08/01/19 |\r\n" + "\r\n" + "TPV v1.0\r\n"
                    + "- Prototype ready\r\n" + "\r\n" + "TPV v0.9.6\r\n"
                    + "- Forms feedback improved and changelog updated\r\n"
                    + "\r\n" + "TPV v0.9.5\r\n" + "- Mains not used removed\r\n"
                    + "\r\n" + "TPV v0.9.4\r\n"
                    + "- Reallocation of resources\r\n" + "\r\n"
                    + "TPV v0.9.3\r\n"
                    + "- App now have full support of english\r\n" + "\r\n"
                    + "| 07/01/19 |\r\n" + "\r\n" + "TPV v0.9.2\r\n"
                    + "- Bug fixes in closing windows\r\n" + "\r\n"
                    + "TPV v0.9.1\r\n"
                    + "- pnlControl and pnlDatosCliente now have full support of english\r\n"
                    + "\r\n" + "TPV v0.9\r\n"
                    + "- VentanaPrincipal now have full support of english\r\n"
                    + "\r\n" + "TPV v0.8.9\r\n"
                    + "- Login window now have full support of english\r\n"
                    + "\r\n" + "TPV v0.8.8\r\n"
                    + "- All components in UI now supports english language\r\n"
                    + "\r\n" + "TPV v0.8.7\r\n"
                    + "- First tabs internationalized in real-time (but PestanaPedidos)\r\n"
                    + "\r\n" + "TPV v0.8.6\r\n"
                    + "- All panels and forms internationalized\r\n" + "\r\n"
                    + "TPV v0.8.5\r\n"
                    + "- VentanaPrincipal internationalized\r\n" + "\r\n"
                    + "TPV v0.8.4\r\n" + "- Login internationalized\r\n"
                    + "\r\n" + "TPV v0.8.3\r\n" + "- Packages organized\r\n"
                    + "\r\n" + "TPV v0.8.2\r\n"
                    + "- Menubar preview implemented\r\n" + "\r\n"
                    + "TPV v0.8.1\r\n"
                    + "- GestionPedidos now has more help tips\r\n" + "\r\n"
                    + "TPV v0.8\r\n" + "- frmCliente added\r\n"
                    + "- Some listeners added\r\n" + "\r\n" + "TPV v0.7.9\r\n"
                    + "- Menus added to Login\r\n"
                    + "- Some help tips added\r\n" + "- pnlClientes fixed\r\n"
                    + "\r\n" + "TPV v0.7.8\r\n"
                    + "- pnlDatosCliente now is dynamic\r\n"
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
                    + "- Login form first version\r\n" + "- TPV created";
            JOptionPane.showMessageDialog(frame, desc,
                    MessagesVentanaLogin.getString("VentanaLogin.125"), //$NON-NLS-1$
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MntmSalirActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(frame,
                    MessagesVentanaLogin.getString("VentanaLogin.126"), //$NON-NLS-1$
                    MessagesVentanaLogin.getString("VentanaLogin.127"), //$NON-NLS-1$
                    JOptionPane.YES_NO_OPTION) == 0) {
                System.exit(0);
            }
        }
    }

    private class RdbtnEnglishActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MessagesVentanaLogin.setIdioma("inglés"); //$NON-NLS-1$
            MessagesVentanaPrincipal.setIdioma("inglés"); //$NON-NLS-1$
            frame.dispose();
            frame = new VentanaLogin();
            frame.rdbtnEnglish.setSelected(true);
            frame.setVisible(true);

        }
    }

    private class RdbtnEspaolActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MessagesVentanaLogin.setIdioma("español"); //$NON-NLS-1$
            MessagesVentanaPrincipal.setIdioma("español"); //$NON-NLS-1$
            frame.dispose();
            frame = new VentanaLogin();
            frame.rdbtnEspaol.setSelected(true);
            frame.setVisible(true);
        }
    }
}
