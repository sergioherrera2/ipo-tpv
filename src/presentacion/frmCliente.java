package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmCliente extends JFrame {
    private static frmCliente frame;

    private JPanel contentPane;
    private JLabel lblNombre;
    private JLabel lblApellidos;
    private JLabel lblDireccin;
    private JLabel lblTelfonos;
    private JLabel lblCorreoElectrnico;
    private JLabel lblRestriccionesAlimentarias;
    private JLabel lblAlergiasEIntolerancias;
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtDireccin;
    private JTextField txtTelfono1;
    private JTextField txtCorreo;
    private JTextField txtTelfono2;
    private JTextArea taRestricciones;
    private JTextArea taAlergias;
    private JButton btnAceptar;
    private JLabel lblAyuda;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new frmCliente();
                    frame.setLocationRelativeTo(null);
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
    public frmCliente() {
        setResizable(false);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(frmCliente.class.getResource(
                        "/presentacion/imagenes/food-2074638_960_720 - resized.png")));
        setTitle("Cliente");
        setBounds(new Rectangle(0, 0, 1280, 720));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new TitledBorder(null, "Cliente",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] { 0, 230, 229, 0, 100, 10, 0 };
        gbl_contentPane.rowHeights = new int[] { 10, 50, 50, 50, 50, 50, 150,
                50, 0 };
        gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
                0.0, Double.MIN_VALUE };
        gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 1.0, 0.0, Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);
        {
            lblAyuda = new JLabel("");
            lblAyuda.addMouseListener(new LblAyudaMouseListener());
            lblAyuda.setIcon(new ImageIcon(frmCliente.class
                    .getResource("/presentacion/iconos/information.png")));
            GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
            gbc_lblAyuda.insets = new Insets(0, 0, 5, 0);
            gbc_lblAyuda.gridx = 5;
            gbc_lblAyuda.gridy = 0;
            contentPane.add(lblAyuda, gbc_lblAyuda);
        }
        {
            lblNombre = new JLabel("Nombre:");
            lblNombre.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblNombre = new GridBagConstraints();
            gbc_lblNombre.anchor = GridBagConstraints.EAST;
            gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
            gbc_lblNombre.gridx = 0;
            gbc_lblNombre.gridy = 1;
            contentPane.add(lblNombre, gbc_lblNombre);
        }
        {
            txtNombre = new JTextField();
            txtNombre.addFocusListener(new MiFocusListener());
            txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtNombre = new GridBagConstraints();
            gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
            gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtNombre.gridx = 1;
            gbc_txtNombre.gridy = 1;
            contentPane.add(txtNombre, gbc_txtNombre);
            txtNombre.setColumns(10);
        }
        {
            lblApellidos = new JLabel("Apellidos:");
            lblApellidos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
            gbc_lblApellidos.anchor = GridBagConstraints.EAST;
            gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
            gbc_lblApellidos.gridx = 0;
            gbc_lblApellidos.gridy = 2;
            contentPane.add(lblApellidos, gbc_lblApellidos);
        }
        {
            txtApellidos = new JTextField();
            txtApellidos.addFocusListener(new MiFocusListener());
            txtApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
            gbc_txtApellidos.gridwidth = 2;
            gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
            gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtApellidos.gridx = 1;
            gbc_txtApellidos.gridy = 2;
            contentPane.add(txtApellidos, gbc_txtApellidos);
            txtApellidos.setColumns(10);
        }
        {
            lblDireccin = new JLabel("Dirección");
            lblDireccin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
            gbc_lblDireccin.anchor = GridBagConstraints.EAST;
            gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
            gbc_lblDireccin.gridx = 0;
            gbc_lblDireccin.gridy = 3;
            contentPane.add(lblDireccin, gbc_lblDireccin);
        }
        {
            txtDireccin = new JTextField();
            txtDireccin.addFocusListener(new MiFocusListener());
            txtDireccin.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtDireccin = new GridBagConstraints();
            gbc_txtDireccin.gridwidth = 2;
            gbc_txtDireccin.insets = new Insets(0, 0, 5, 5);
            gbc_txtDireccin.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtDireccin.gridx = 1;
            gbc_txtDireccin.gridy = 3;
            contentPane.add(txtDireccin, gbc_txtDireccin);
            txtDireccin.setColumns(10);
        }
        {
            lblTelfonos = new JLabel("Teléfono/s:");
            lblTelfonos.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblTelfonos = new GridBagConstraints();
            gbc_lblTelfonos.anchor = GridBagConstraints.EAST;
            gbc_lblTelfonos.insets = new Insets(0, 0, 5, 5);
            gbc_lblTelfonos.gridx = 0;
            gbc_lblTelfonos.gridy = 4;
            contentPane.add(lblTelfonos, gbc_lblTelfonos);
        }
        {
            txtTelfono1 = new JTextField();
            txtTelfono1.addFocusListener(new MiFocusListener());
            txtTelfono1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtTelfono1 = new GridBagConstraints();
            gbc_txtTelfono1.insets = new Insets(0, 0, 5, 5);
            gbc_txtTelfono1.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtTelfono1.gridx = 1;
            gbc_txtTelfono1.gridy = 4;
            contentPane.add(txtTelfono1, gbc_txtTelfono1);
            txtTelfono1.setColumns(10);
        }
        {
            txtTelfono2 = new JTextField();
            txtTelfono2.addFocusListener(new MiFocusListener());
            txtTelfono2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtTelfono2 = new GridBagConstraints();
            gbc_txtTelfono2.insets = new Insets(0, 0, 5, 5);
            gbc_txtTelfono2.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtTelfono2.gridx = 2;
            gbc_txtTelfono2.gridy = 4;
            contentPane.add(txtTelfono2, gbc_txtTelfono2);
            txtTelfono2.setColumns(10);
        }
        {
            lblCorreoElectrnico = new JLabel("Correo electrónico:");
            lblCorreoElectrnico
                    .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
            gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
            gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
            gbc_lblCorreoElectrnico.gridx = 0;
            gbc_lblCorreoElectrnico.gridy = 5;
            contentPane.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
        }
        {
            txtCorreo = new JTextField();
            txtCorreo.addFocusListener(new MiFocusListener());
            txtCorreo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
            gbc_txtCorreo.gridwidth = 2;
            gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
            gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
            gbc_txtCorreo.gridx = 1;
            gbc_txtCorreo.gridy = 5;
            contentPane.add(txtCorreo, gbc_txtCorreo);
            txtCorreo.setColumns(10);
        }
        {
            lblRestriccionesAlimentarias = new JLabel(
                    "Restricciones alimentarias:");
            lblRestriccionesAlimentarias
                    .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblRestriccionesAlimentarias = new GridBagConstraints();
            gbc_lblRestriccionesAlimentarias.anchor = GridBagConstraints.EAST;
            gbc_lblRestriccionesAlimentarias.insets = new Insets(0, 0, 5, 5);
            gbc_lblRestriccionesAlimentarias.gridx = 0;
            gbc_lblRestriccionesAlimentarias.gridy = 6;
            contentPane.add(lblRestriccionesAlimentarias,
                    gbc_lblRestriccionesAlimentarias);
        }
        {
            taRestricciones = new JTextArea();
            taRestricciones.addFocusListener(new MiFocusListener());
            taRestricciones.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_taRestricciones = new GridBagConstraints();
            gbc_taRestricciones.gridwidth = 3;
            gbc_taRestricciones.insets = new Insets(0, 0, 5, 5);
            gbc_taRestricciones.fill = GridBagConstraints.BOTH;
            gbc_taRestricciones.gridx = 1;
            gbc_taRestricciones.gridy = 6;
            contentPane.add(taRestricciones, gbc_taRestricciones);
        }
        {
            lblAlergiasEIntolerancias = new JLabel("Alergias e intolerancias:");
            lblAlergiasEIntolerancias
                    .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            GridBagConstraints gbc_lblAlergiasEIntolerancias = new GridBagConstraints();
            gbc_lblAlergiasEIntolerancias.anchor = GridBagConstraints.EAST;
            gbc_lblAlergiasEIntolerancias.insets = new Insets(0, 0, 0, 5);
            gbc_lblAlergiasEIntolerancias.gridx = 0;
            gbc_lblAlergiasEIntolerancias.gridy = 7;
            contentPane.add(lblAlergiasEIntolerancias,
                    gbc_lblAlergiasEIntolerancias);
        }
        {
            taAlergias = new JTextArea();
            taAlergias.addFocusListener(new MiFocusListener());
            taAlergias.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_taAlergias = new GridBagConstraints();
            gbc_taAlergias.gridwidth = 3;
            gbc_taAlergias.anchor = GridBagConstraints.NORTH;
            gbc_taAlergias.insets = new Insets(0, 0, 0, 5);
            gbc_taAlergias.fill = GridBagConstraints.HORIZONTAL;
            gbc_taAlergias.gridx = 1;
            gbc_taAlergias.gridy = 7;
            contentPane.add(taAlergias, gbc_taAlergias);
        }
        {
            btnAceptar = new JButton("Aceptar");
            btnAceptar.addActionListener(new BtnAceptarActionListener());
            btnAceptar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
            btnAceptar.setIcon(new ImageIcon(frmCliente.class
                    .getResource("/presentacion/iconos/check-symbol.png")));
            GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
            gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
            gbc_btnAceptar.fill = GridBagConstraints.BOTH;
            gbc_btnAceptar.gridx = 4;
            gbc_btnAceptar.gridy = 7;
            contentPane.add(btnAceptar, gbc_btnAceptar);
        }
    }

    private class BtnAceptarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
        }
    }

    private class LblAyudaMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(frame,
                    "Este formulario nos permite la adición o modificación de datos del cliente.\nEn la aplicación final, el botón aceptar crearía un cliente.",
                    "Ayuda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
