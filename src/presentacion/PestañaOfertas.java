package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;

import presentacion.paneles.pnlOferta;
import presentacion.paneles.pnlPromocion;

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
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestañaOfertas extends JPanel {
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
    private JPanel pnlOferta1;
    private JLabel lblHelp;

    /**
     * Create the panel.
     */
    public PestañaOfertas() {
        setBounds(new Rectangle(0, 0, 1280, 720));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 771, 507, 100, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 50, 50, 50, 50, 50, 50, 50,
                50, 50, 50, 50, 50, 50, 50, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);

        lblHelp = new JLabel(""); //$NON-NLS-1$
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 3;
        gbc_lblHelp.gridy = 0;
        add(lblHelp, gbc_lblHelp);

        pnlPromociones = new JPanel();
        pnlPromociones.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlPromociones.setBorder(
                new TitledBorder(UIManager.getBorder("TitledBorder.border"), //$NON-NLS-1$
                        MessagesPestanaOfertas.getString("PestañaOfertas.pnlPromociones.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, //$NON-NLS-1$
                        null, new Color(0, 0, 0)));
        GridBagConstraints gbc_pnlPromociones = new GridBagConstraints();
        gbc_pnlPromociones.gridheight = 5;
        gbc_pnlPromociones.gridwidth = 2;
        gbc_pnlPromociones.insets = new Insets(0, 0, 5, 5);
        gbc_pnlPromociones.fill = GridBagConstraints.BOTH;
        gbc_pnlPromociones.gridx = 0;
        gbc_pnlPromociones.gridy = 1;
        add(pnlPromociones, gbc_pnlPromociones);
        GridBagLayout gbl_pnlPromociones = new GridBagLayout();
        gbl_pnlPromociones.columnWidths = new int[] { 1156, 0 };
        gbl_pnlPromociones.rowHeights = new int[] { 220, 0 };
        gbl_pnlPromociones.columnWeights = new double[] { 0.0,
                Double.MIN_VALUE };
        gbl_pnlPromociones.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
        pnlPromociones.setLayout(gbl_pnlPromociones);

        spPromociones = new JScrollPane();
        GridBagConstraints gbc_spPromociones = new GridBagConstraints();
        gbc_spPromociones.fill = GridBagConstraints.BOTH;
        gbc_spPromociones.gridx = 0;
        gbc_spPromociones.gridy = 0;
        pnlPromociones.add(spPromociones, gbc_spPromociones);

        pnlPromo1 = new pnlPromocion();
        spPromociones.setViewportView(pnlPromo1);
        GridBagLayout gbl_pnlPromo1 = new GridBagLayout();
        gbl_pnlPromo1.columnWidths = new int[] { 0, 0, 0 };
        gbl_pnlPromo1.rowHeights = new int[] { 0, 0, 0 };
        gbl_pnlPromo1.columnWeights = new double[] { 0.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlPromo1.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
        pnlPromo1.setLayout(gbl_pnlPromo1);

        btnNuevaOferta = new JButton(MessagesPestanaOfertas.getString("PestañaOfertas.btnNuevaOferta.text")); //$NON-NLS-1$
        btnNuevaOferta.addActionListener(new BtnNuevaOfertaActionListener());
        btnNuevaOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/rounded-add-button.png"))); //$NON-NLS-1$
        btnNuevaOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnNuevaOferta = new GridBagConstraints();
        gbc_btnNuevaOferta.fill = GridBagConstraints.BOTH;
        gbc_btnNuevaOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnNuevaOferta.gridx = 2;
        gbc_btnNuevaOferta.gridy = 1;
        add(btnNuevaOferta, gbc_btnNuevaOferta);

        btnEditarOferta = new JButton(MessagesPestanaOfertas.getString("PestañaOfertas.btnEditarOferta.text")); //$NON-NLS-1$
        btnEditarOferta.addActionListener(new BtnEditarOfertaActionListener());
        btnEditarOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/edit24.png"))); //$NON-NLS-1$
        btnEditarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
        gbc_btnEditarOferta.fill = GridBagConstraints.BOTH;
        gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnEditarOferta.gridx = 2;
        gbc_btnEditarOferta.gridy = 2;
        add(btnEditarOferta, gbc_btnEditarOferta);

        pnlOfertas = new JPanel();
        pnlOfertas.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlOfertas.setBorder(new TitledBorder(null, MessagesPestanaOfertas.getString("PestañaOfertas.pnlOfertas.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlOfertas = new GridBagConstraints();
        gbc_pnlOfertas.gridheight = 5;
        gbc_pnlOfertas.gridwidth = 2;
        gbc_pnlOfertas.insets = new Insets(0, 0, 5, 5);
        gbc_pnlOfertas.fill = GridBagConstraints.BOTH;
        gbc_pnlOfertas.gridx = 0;
        gbc_pnlOfertas.gridy = 6;
        add(pnlOfertas, gbc_pnlOfertas);
        GridBagLayout gbl_pnlOfertas = new GridBagLayout();
        gbl_pnlOfertas.columnWidths = new int[] { 583, 0 };
        gbl_pnlOfertas.rowHeights = new int[] { 2, 0 };
        gbl_pnlOfertas.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_pnlOfertas.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
        pnlOfertas.setLayout(gbl_pnlOfertas);

        spOfertas = new JScrollPane();
        GridBagConstraints gbc_spOfertas = new GridBagConstraints();
        gbc_spOfertas.fill = GridBagConstraints.BOTH;
        gbc_spOfertas.gridx = 0;
        gbc_spOfertas.gridy = 0;
        pnlOfertas.add(spOfertas, gbc_spOfertas);

        pnlOferta1 = new pnlOferta();
        spOfertas.setViewportView(pnlOferta1);
        GridBagLayout gbl_pnlOferta1 = new GridBagLayout();
        gbl_pnlOferta1.columnWidths = new int[] { 214, 0 };
        gbl_pnlOferta1.rowHeights = new int[] { 30, 0, 0 };
        gbl_pnlOferta1.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
        gbl_pnlOferta1.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
        pnlOferta1.setLayout(gbl_pnlOferta1);

        btnBorrarOferta = new JButton(MessagesPestanaOfertas.getString("PestañaOfertas.btnBorrarOferta.text")); //$NON-NLS-1$
        btnBorrarOferta.addActionListener(new BtnBorrarPromoActionListener());
        btnBorrarOferta.setIcon(new ImageIcon(PestañaOfertas.class.getResource(
                "/presentacion/iconos/rubbish-bin-delete-button.png"))); //$NON-NLS-1$
        btnBorrarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
        gbc_btnBorrarOferta.fill = GridBagConstraints.BOTH;
        gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnBorrarOferta.gridx = 2;
        gbc_btnBorrarOferta.gridy = 10;
        add(btnBorrarOferta, gbc_btnBorrarOferta);

        pnlInfo = new JPanel();
        pnlInfo.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlInfo.setBorder(new TitledBorder(null, MessagesPestanaOfertas.getString("PestañaOfertas.pnlInfo.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlInfo = new GridBagConstraints();
        gbc_pnlInfo.gridheight = 4;
        gbc_pnlInfo.insets = new Insets(0, 0, 0, 5);
        gbc_pnlInfo.fill = GridBagConstraints.BOTH;
        gbc_pnlInfo.gridx = 0;
        gbc_pnlInfo.gridy = 11;
        add(pnlInfo, gbc_pnlInfo);
        pnlInfo.setLayout(new GridLayout(0, 1, 0, 0));

        taInfo = new JTextArea();
        taInfo.setFont(new Font("Segoe UI", Font.BOLD, 13)); //$NON-NLS-1$
        taInfo.setEditable(false);
        taInfo.setText(
                MessagesPestanaOfertas.getString("PestañaOfertas.taInfo.text")); //$NON-NLS-1$
        taInfo.setEnabled(false);
        pnlInfo.add(taInfo);

        pnlClientes = new JPanel();
        pnlClientes.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlClientes.setBorder(new TitledBorder(null, MessagesPestanaOfertas.getString("PestañaOfertas.pnlClientes.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlClientes = new GridBagConstraints();
        gbc_pnlClientes.gridheight = 4;
        gbc_pnlClientes.insets = new Insets(0, 0, 0, 5);
        gbc_pnlClientes.fill = GridBagConstraints.BOTH;
        gbc_pnlClientes.gridx = 1;
        gbc_pnlClientes.gridy = 11;
        add(pnlClientes, gbc_pnlClientes);
        pnlClientes.setLayout(new GridLayout(1, 0, 0, 0));

        spClientes = new JScrollPane();
        pnlClientes.add(spClientes);

        lsClientes = new JList();
        lsClientes.setModel(new AbstractListModel() {
            String[] values = new String[] { "sergio.herrera2@alu.uclm.es", //$NON-NLS-1$
                    "manolofergn@gmail.com" }; //$NON-NLS-1$

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

        btnSeleccionar = new JButton(MessagesPestanaOfertas.getString("PestañaOfertas.btnSeleccionar.text")); //$NON-NLS-1$
        btnSeleccionar.addActionListener(new BtnSeleccionarActionListener());
        btnSeleccionar.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/select-all.png"))); //$NON-NLS-1$
        btnSeleccionar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
        gbc_btnSeleccionar.fill = GridBagConstraints.BOTH;
        gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeleccionar.gridx = 2;
        gbc_btnSeleccionar.gridy = 13;
        add(btnSeleccionar, gbc_btnSeleccionar);

        btnEnviarOferta = new JButton(MessagesPestanaOfertas.getString("PestañaOfertas.btnEnviarOferta.text")); //$NON-NLS-1$
        btnEnviarOferta.addActionListener(new BtnEnviarOfertaActionListener());
        btnEnviarOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/send-button.png"))); //$NON-NLS-1$
        btnEnviarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnEnviarOferta = new GridBagConstraints();
        gbc_btnEnviarOferta.insets = new Insets(0, 0, 0, 5);
        gbc_btnEnviarOferta.fill = GridBagConstraints.BOTH;
        gbc_btnEnviarOferta.gridx = 2;
        gbc_btnEnviarOferta.gridy = 14;
        add(btnEnviarOferta, gbc_btnEnviarOferta);

    }

    private class BtnNuevaOfertaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaOfertas.getString("PestañaOfertas.ModuloNoImplementado") //$NON-NLS-1$
                            + MessagesPestanaOfertas.getString("PestañaOfertas.ModuloMensaje"), //$NON-NLS-1$
                    MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraAviso"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
        }
    }

    private class BtnBorrarPromoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (pnlPromo1.getBackground().equals(new Color(250, 250, 150))) {
                if (JOptionPane.showConfirmDialog(new JPanel(),
                        MessagesPestanaOfertas.getString("PestañaOfertas.DialogoConfirmacion"), //$NON-NLS-1$
                        MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraCuidado"), JOptionPane.YES_NO_OPTION) == 0) { //$NON-NLS-1$
                    pnlPromo1.setBackground(new Color(250, 250, 250));
                    pnlPromo1.setVisible(false);
                }
            } else if (pnlOferta1.getBackground()
                    .equals(new Color(250, 250, 150))) {
                if (JOptionPane.showConfirmDialog(new JPanel(),
                        MessagesPestanaOfertas.getString("PestañaOfertas.DialogoConfirmacion2"), //$NON-NLS-1$
                        MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraCuidado2"), JOptionPane.YES_NO_OPTION) == 0) { //$NON-NLS-1$
                    pnlOferta1.setBackground(new Color(250, 250, 250));
                    pnlOferta1.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(new JPanel(),
                        MessagesPestanaOfertas.getString("PestañaOfertas.DialogoAviso"), //$NON-NLS-1$
                        MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraCuidado"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
            }

        }
    }

    private class BtnEditarOfertaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaOfertas.getString("PestañaOfertas.ModuloNoImplementado2") //$NON-NLS-1$
                            + MessagesPestanaOfertas.getString("PestañaOfertas.ModuloMensaje2"), //$NON-NLS-1$
                    MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraAviso3"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
        }
    }

    private class BtnSeleccionarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaOfertas.getString("PestañaOfertas.ModuloNoImplementado3") //$NON-NLS-1$
                            + MessagesPestanaOfertas.getString("PestañaOfertas.ModuloMensaje3"), //$NON-NLS-1$
                    MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraAviso4"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
        }
    }

    private class BtnEnviarOfertaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(new JPanel(),
                    MessagesPestanaOfertas.getString("PestañaOfertas.DialogoConfirmacion3"), //$NON-NLS-1$
                    MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraCuidado2"), JOptionPane.YES_NO_OPTION) == 0) { //$NON-NLS-1$
                JOptionPane.showMessageDialog(new JPanel(),
                        MessagesPestanaOfertas.getString("PestañaOfertas.MensajeInfo"), MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraInformacion"), //$NON-NLS-1$ //$NON-NLS-2$
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaOfertas.getString("PestañaOfertas.MensajeAyuda1") //$NON-NLS-1$
                            + MessagesPestanaOfertas.getString("PestañaOfertas.MensajeAyuda2") //$NON-NLS-1$
                            + MessagesPestanaOfertas.getString("PestañaOfertas.MensajeAyuda3"), //$NON-NLS-1$
                    MessagesPestanaOfertas.getString("PestañaOfertas.CabeceraAyuda4"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }
}
