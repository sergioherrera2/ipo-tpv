package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.EmptyBorder;

import presentacion.formularios.MessagesFormularioCliente;
import presentacion.paneles.MessagesPnlControl;
import presentacion.paneles.MessagesPnlDatosCliente;
import presentacion.paneles.MessagesPnlOferta;
import presentacion.paneles.MessagesPnlPromocion;
import presentacion.paneles.MessagesPnlUsuario;
import presentacion.paneles.pnlControl;
import presentacion.paneles.pnlUsuario;

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
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VentanaPrincipal extends JFrame {
    private static VentanaPrincipal frame;

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
    private JMenuItem mntmSalir;
    private JMenuItem mntmAutor;
    private JMenuItem mntmVersin;

    private JMenu mnTamaoDeLetra;

    private JRadioButtonMenuItem rdbtnmntmPequea;

    private JRadioButtonMenuItem rdbtnmntmMediana;

    private JRadioButtonMenuItem rdbtnmntmGrande;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame = new VentanaPrincipal();
                    frame.setExtendedState(MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static VentanaPrincipal getFrame() {
        return frame;
    }

    public static void setFrame(VentanaPrincipal frame) {
        VentanaPrincipal.frame = frame;
    }

    /**
     * Create the frame.
     */
    public VentanaPrincipal() {
        setTitle(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.this.title")); //$NON-NLS-1$
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(VentanaPrincipal.class.getResource(
                        "/presentacion/imagenes/food-2074638_960_720 - resized.png"))); //$NON-NLS-1$
        setBounds(new Rectangle(0, 0, 1920, 1080));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (MessagesVentanaPrincipal.getIdioma().getLanguage()
                .equals(new Locale("en").getLanguage())) { //$NON-NLS-1$
            MessagesVentanaGestionPedidos.setIdioma("inglés");
            MessagesPestanaPedidos.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPestanaProductos.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPestanaClientes.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPestanaCallejero.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPestanaOfertas.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPnlUsuario.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPnlControl.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPnlOferta.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPnlDatosCliente.setIdioma("inglés"); //$NON-NLS-1$
            MessagesPnlPromocion.setIdioma("inglés"); //$NON-NLS-1$
            MessagesFormularioCliente.setIdioma("inglés"); //$NON-NLS-1$
        }

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnArchivo = new JMenu(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mnArchivo.text")); //$NON-NLS-1$
        menuBar.add(mnArchivo);

        mntmSalir = new JMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mntmSalir.text")); //$NON-NLS-1$
        mntmSalir.setIcon(new ImageIcon(VentanaPrincipal.class
                .getResource("/presentacion/iconos/exit-to-app-button.png"))); //$NON-NLS-1$
        mntmSalir.addActionListener(new MntmSalirActionListener());
        mnArchivo.add(mntmSalir);

        mnEdicin = new JMenu(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mnEdicin.text")); //$NON-NLS-1$
        menuBar.add(mnEdicin);

        mnVista = new JMenu(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mnVista.text")); //$NON-NLS-1$
        menuBar.add(mnVista);

        mnTamaoDeLetra = new JMenu(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mnTamaoDeLetra.text")); //$NON-NLS-1$
        mnVista.add(mnTamaoDeLetra);

        rdbtnmntmPequea = new JRadioButtonMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.rdbtnmntmPequea.text")); //$NON-NLS-1$
        mnTamaoDeLetra.add(rdbtnmntmPequea);

        rdbtnmntmMediana = new JRadioButtonMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.rdbtnmntmMediana.text")); //$NON-NLS-1$
        rdbtnmntmMediana.setSelected(true);
        mnTamaoDeLetra.add(rdbtnmntmMediana);

        rdbtnmntmGrande = new JRadioButtonMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.rdbtnmntmGrande.text")); //$NON-NLS-1$
        mnTamaoDeLetra.add(rdbtnmntmGrande);

        mnAcercaDe = new JMenu(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mnAcercaDe.text")); //$NON-NLS-1$
        menuBar.add(mnAcercaDe);

        mntmAutor = new JMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mntmAutor.text")); //$NON-NLS-1$
        mntmAutor.addActionListener(new MntmAutorActionListener());
        mnAcercaDe.add(mntmAutor);

        mntmVersin = new JMenuItem(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.mntmVersin.text")); //$NON-NLS-1$
        mntmVersin.addActionListener(new MntmVersinActionListener());
        mnAcercaDe.add(mntmVersin);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        pnlSuperior = new JPanel();
        contentPane.add(pnlSuperior, BorderLayout.NORTH);
        GridBagLayout gbl_pnlSuperior = new GridBagLayout();
        gbl_pnlSuperior.columnWidths = new int[] { 306, 56, 0, 0 };
        gbl_pnlSuperior.rowHeights = new int[] { 143, 0 };
        gbl_pnlSuperior.columnWeights = new double[] { 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
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
        gbl_pnlBanner.columnWeights = new double[] { 1.0, 1.0,
                Double.MIN_VALUE };
        gbl_pnlBanner.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
        pnlBanner.setLayout(gbl_pnlBanner);

        lblBanner = new JLabel(MessagesVentanaPrincipal
                .getString("VentanaPrincipal.lblBanner.text")); //$NON-NLS-1$
        lblBanner.setFont(new Font("Segoe UI Black", Font.PLAIN, 40)); //$NON-NLS-1$
        GridBagConstraints gbc_lblBanner = new GridBagConstraints();
        gbc_lblBanner.gridwidth = 2;
        gbc_lblBanner.insets = new Insets(0, 0, 0, 5);
        gbc_lblBanner.gridx = 0;
        gbc_lblBanner.gridy = 0;
        pnlBanner.add(lblBanner, gbc_lblBanner);

        pnlControl = new pnlControl();
        pnlControl.setMinimumSize(new Dimension(246, 99));
        GridBagConstraints gbc_pnlControl = new GridBagConstraints();
        gbc_pnlControl.fill = GridBagConstraints.BOTH;
        gbc_pnlControl.gridx = 2;
        gbc_pnlControl.gridy = 0;
        pnlSuperior.add(pnlControl, gbc_pnlControl);

        tbpCentral = new JTabbedPane(JTabbedPane.LEFT);
        contentPane.add(tbpCentral, BorderLayout.CENTER);

        pnlPedidos = new PestañaPedidos(frame);
        tbpCentral.addTab(MessagesVentanaPrincipal.getString(
                "VentanaPrincipal.TabPedidos"), null, pnlPedidos, null); //$NON-NLS-1$

        pnlOfertas = new PestañaOfertas();
        tbpCentral.addTab(MessagesVentanaPrincipal.getString(
                "VentanaPrincipal.TabOfertas"), null, pnlOfertas, null); //$NON-NLS-1$

        pnlProductos = new PestañaProductos();
        tbpCentral.addTab(
                MessagesVentanaPrincipal
                        .getString("VentanaPrincipal.TabProductos"), //$NON-NLS-1$
                null, pnlProductos, null);

        pnlClientes = new PestañaClientes();
        tbpCentral.addTab(
                MessagesVentanaPrincipal
                        .getString("VentanaPrincipal.TabClientes"), //$NON-NLS-1$
                null, pnlClientes, null);

        pnlCallejero = new PestañaCallejero();
        tbpCentral.addTab(
                MessagesVentanaPrincipal
                        .getString("VentanaPrincipal.TabCallejero"), //$NON-NLS-1$
                null, pnlCallejero, null);
    }

    private class MntmSalirActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(frame,
                    MessagesVentanaPrincipal
                            .getString("VentanaPrincipal.DialogoConfirmacion"), //$NON-NLS-1$
                    MessagesVentanaPrincipal
                            .getString("VentanaPrincipal.DialogoCuidado"), //$NON-NLS-1$
                    JOptionPane.YES_NO_OPTION) == 0) {
                System.exit(0);
            }
        }
    }

    private class MntmAutorActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame,
                    MessagesVentanaPrincipal
                            .getString("VentanaPrincipal.InfoAutor"), //$NON-NLS-1$
                    MessagesVentanaPrincipal
                            .getString("VentanaPrincipal.MenuAutor"), //$NON-NLS-1$
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MntmVersinActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "| 07/01/19 |\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.8.3\r\n" + "- Packages organized\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "TPV v0.8.2\r\n" + "- Menubar preview implemented\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "\r\n" + "TPV v0.8.1\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- GestionPedidos now has more help tips\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.8\r\n" + "- frmCliente added\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- Some listeners added\r\n" + "\r\n" + "TPV v0.7.9\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- Menus added to Login\r\n" //$NON-NLS-1$
                    + "- Some help tips added\r\n" + "- pnlClientes fixed\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "\r\n" + "TPV v0.7.8\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- pnlDatosCliente now is dynamic\r\n" //$NON-NLS-1$
                    + "- pnlControl now is working\r\n" //$NON-NLS-1$
                    + "- Some design improvements\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.7.7\r\n" + "- Feedback added to login window\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- pnlControl confirm dialog added (without action for now)\r\n" //$NON-NLS-1$
                    + "\r\n" + "TPV v0.7.6\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- Design style improved and better resource management\r\n" //$NON-NLS-1$
                    + "\r\n" + "| 11/12/18 |\r\n" + "\r\n" + "TPV v0.7.5\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    + "- Design improvements\r\n" + "\r\n" + "TPV v0.7.4\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- TPV is now maximized by default\r\n" //$NON-NLS-1$
                    + "- Version label updated\r\n" + "\r\n" + "TPV v0.7.3\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- Login: language is now shown\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.7.2\r\n" + "- Login: minor visual changes\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "\r\n" + "| 10/12/18 |\r\n" + "\r\n" + "TPV v0.7.1\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    + "- pnlOfertas: new proposal\r\n" + "\r\n" + "TPV v0.7\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- Login: font changes\r\n" //$NON-NLS-1$
                    + "- Login: demo implemented\r\n" //$NON-NLS-1$
                    + "- pnlCallejero: image changed\r\n" //$NON-NLS-1$
                    + "- Other style changes\r\n" + "\r\n" + "TPV v0.6\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- pnlCallejero first version\r\n" //$NON-NLS-1$
                    + "- Design improvements (font changes)\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.5\r\n" + "- pnlClientes first version\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "\r\n" + "TPV v0.4.1\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "- pnlProductos improvements\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "TPV v0.4\r\n" + "- pnlProductos first version\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "\r\n" + "TPV v0.3.3\r\n" + "- pnlOfertas rebased\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "\r\n" + "TPV v0.3.2\r\n" + "- pnlPedidos rebased\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "\r\n" + "TPV v0.3.1\r\n" + "- Minor design changes\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "\r\n" + "| 09/12/18 |\r\n" + "\r\n" + "TPV v0.3\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    + "- pnlOfertas first version\r\n" + "\r\n" + "TPV v0.2\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- pnlPedidos first version\r\n" + "\r\n" //$NON-NLS-1$ //$NON-NLS-2$
                    + "| 07/12/18 |\r\n" + "\r\n" + "TPV v0.1\r\n" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                    + "- Login form first version\r\n" + "- TPV created", //$NON-NLS-1$ //$NON-NLS-2$
                    MessagesVentanaPrincipal
                            .getString("VentanaPrincipal.ListaCambios"), //$NON-NLS-1$
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
