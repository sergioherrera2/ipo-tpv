package presentacion.paneles;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import presentacion.listeners.MiFocusListener;
import presentacion.messages.MessagesPnlDatosCliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JFormattedTextField;

public class pnlDatosCliente extends JPanel {
    private JLabel lblNombreYApellidos;
    private JTextField tfNombreApellidos;
    private JLabel lblTelefono;
    private JLabel lblDireccinDeEnvo;
    private JTextField tfDireccion;
    private JLabel lblAlergiasORestricciones;
    private JTextField tfAlergias;
    private JLabel lblAyuda;
    private JFormattedTextField ftfTelefono;

    /**
     * Create the panel.
     */
    public pnlDatosCliente() {
        setBorder(new TitledBorder(null,
                MessagesPnlDatosCliente
                        .getString("pnlDatosCliente.this.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        setBounds(new Rectangle(0, 0, 460, 400));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 10, 0, 125, 97, 10, 0 };
        gridBagLayout.rowHeights = new int[] { 10, 40, 30, 40, 30, 40, 30, 50,
                30, 10, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);
        {
            lblAyuda = new JLabel(""); //$NON-NLS-1$
            lblAyuda.addMouseListener(new LblAyudaMouseListener());
            lblAyuda.setIcon(new ImageIcon(pnlDatosCliente.class
                    .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
            GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
            gbc_lblAyuda.insets = new Insets(0, 0, 5, 0);
            gbc_lblAyuda.gridx = 4;
            gbc_lblAyuda.gridy = 0;
            add(lblAyuda, gbc_lblAyuda);
        }
        {
            lblNombreYApellidos = new JLabel(MessagesPnlDatosCliente
                    .getString("pnlDatosCliente.lblNombreYApellidos.text")); //$NON-NLS-1$
            lblNombreYApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_lblNombreYApellidos = new GridBagConstraints();
            gbc_lblNombreYApellidos.anchor = GridBagConstraints.SOUTHWEST;
            gbc_lblNombreYApellidos.insets = new Insets(0, 0, 5, 5);
            gbc_lblNombreYApellidos.gridx = 1;
            gbc_lblNombreYApellidos.gridy = 1;
            add(lblNombreYApellidos, gbc_lblNombreYApellidos);
        }
        {
            tfNombreApellidos = new JTextField();
            tfNombreApellidos
                    .addActionListener(new TfNombreApellidosActionListener());
            tfNombreApellidos
                    .addKeyListener(new TfNombreApellidosKeyListener());
            tfNombreApellidos.addFocusListener(new MiFocusListener());
            tfNombreApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_tfNombreApellidos = new GridBagConstraints();
            gbc_tfNombreApellidos.fill = GridBagConstraints.HORIZONTAL;
            gbc_tfNombreApellidos.insets = new Insets(0, 0, 5, 5);
            gbc_tfNombreApellidos.gridwidth = 3;
            gbc_tfNombreApellidos.gridx = 1;
            gbc_tfNombreApellidos.gridy = 2;
            add(tfNombreApellidos, gbc_tfNombreApellidos);
            tfNombreApellidos.setColumns(10);
        }
        {
            lblTelefono = new JLabel(MessagesPnlDatosCliente
                    .getString("pnlDatosCliente.lblTelefono.text")); //$NON-NLS-1$
            lblTelefono.setEnabled(false);
            lblTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
            gbc_lblTelefono.anchor = GridBagConstraints.SOUTHWEST;
            gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
            gbc_lblTelefono.gridx = 1;
            gbc_lblTelefono.gridy = 3;
            add(lblTelefono, gbc_lblTelefono);
        }
        {
            MaskFormatter formatoTlfno;
            try {
                formatoTlfno = new MaskFormatter("'(###')' ###' ###' ###");
                formatoTlfno.setPlaceholderCharacter('*');
                ftfTelefono = new JFormattedTextField(formatoTlfno);
                ftfTelefono.addActionListener(new FtfTelefonoActionListener());
                ftfTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ftfTelefono.setEnabled(false);
            ftfTelefono.addFocusListener(new MiFocusListener());
            GridBagConstraints gbc_ftfTelefono = new GridBagConstraints();
            gbc_ftfTelefono.gridwidth = 3;
            gbc_ftfTelefono.insets = new Insets(0, 0, 5, 5);
            gbc_ftfTelefono.fill = GridBagConstraints.HORIZONTAL;
            gbc_ftfTelefono.gridx = 1;
            gbc_ftfTelefono.gridy = 4;
            add(ftfTelefono, gbc_ftfTelefono);
        }
        {
            lblDireccinDeEnvo = new JLabel(MessagesPnlDatosCliente
                    .getString("pnlDatosCliente.lblDireccinDeEnvo.text")); //$NON-NLS-1$
            lblDireccinDeEnvo.setEnabled(false);
            lblDireccinDeEnvo.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_lblDireccinDeEnvo = new GridBagConstraints();
            gbc_lblDireccinDeEnvo.anchor = GridBagConstraints.SOUTHWEST;
            gbc_lblDireccinDeEnvo.insets = new Insets(0, 0, 5, 5);
            gbc_lblDireccinDeEnvo.gridx = 1;
            gbc_lblDireccinDeEnvo.gridy = 5;
            add(lblDireccinDeEnvo, gbc_lblDireccinDeEnvo);
        }
        {
            tfDireccion = new JTextField();
            tfDireccion.addActionListener(new TfDireccionActionListener());
            tfDireccion.setEnabled(false);
            tfDireccion.addFocusListener(new MiFocusListener());
            tfDireccion.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_tfDireccion = new GridBagConstraints();
            gbc_tfDireccion.insets = new Insets(0, 0, 5, 5);
            gbc_tfDireccion.gridwidth = 3;
            gbc_tfDireccion.fill = GridBagConstraints.HORIZONTAL;
            gbc_tfDireccion.gridx = 1;
            gbc_tfDireccion.gridy = 6;
            add(tfDireccion, gbc_tfDireccion);
            tfDireccion.setColumns(10);
        }
        {
            lblAlergiasORestricciones = new JLabel(
                    MessagesPnlDatosCliente.getString(
                            "pnlDatosCliente.lblAlergiasORestricciones.text")); //$NON-NLS-1$
            lblAlergiasORestricciones.setEnabled(false);
            lblAlergiasORestricciones
                    .setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_lblAlergiasORestricciones = new GridBagConstraints();
            gbc_lblAlergiasORestricciones.anchor = GridBagConstraints.SOUTHWEST;
            gbc_lblAlergiasORestricciones.insets = new Insets(0, 0, 5, 5);
            gbc_lblAlergiasORestricciones.gridx = 1;
            gbc_lblAlergiasORestricciones.gridy = 7;
            add(lblAlergiasORestricciones, gbc_lblAlergiasORestricciones);
        }
        {
            tfAlergias = new JTextField();
            tfAlergias.setEnabled(false);
            tfAlergias.addFocusListener(new MiFocusListener());
            tfAlergias.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
            GridBagConstraints gbc_tfAlergias = new GridBagConstraints();
            gbc_tfAlergias.insets = new Insets(0, 0, 5, 5);
            gbc_tfAlergias.gridwidth = 3;
            gbc_tfAlergias.fill = GridBagConstraints.HORIZONTAL;
            gbc_tfAlergias.gridx = 1;
            gbc_tfAlergias.gridy = 8;
            add(tfAlergias, gbc_tfAlergias);
            tfAlergias.setColumns(10);
        }

    }

    private class TfNombreApellidosKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            lblTelefono.setEnabled(true);
            ftfTelefono.setEnabled(true);
            lblDireccinDeEnvo.setEnabled(true);
            tfDireccion.setEnabled(true);
            lblAlergiasORestricciones.setEnabled(true);
            tfAlergias.setEnabled(true);
        }
    }

    private class LblAyudaMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPnlDatosCliente.getString("pnlDatosCliente.Ayuda") //$NON-NLS-1$
                            + MessagesPnlDatosCliente
                                    .getString("pnlDatosCliente.Ayuda2"), //$NON-NLS-1$
                    MessagesPnlDatosCliente
                            .getString("pnlDatosCliente.CabeceraAyuda"), //$NON-NLS-1$
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class TfNombreApellidosActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ftfTelefono.requestFocus();
        }
    }

    private class FtfTelefonoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tfDireccion.requestFocus();
        }
    }

    private class TfDireccionActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tfAlergias.requestFocus();
        }
    }
}
