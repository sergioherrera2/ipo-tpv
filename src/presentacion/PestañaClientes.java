package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import presentacion.formularios.FormularioCliente;
import presentacion.messages.MessagesPestanaClientes;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestañaClientes extends JPanel {
    private JPanel pnlTablaClientes;
    private JPanel pnlHistorialPedidos;
    private JPanel pnlPuntos;
    private JScrollPane spTablaClientes;
    private JTable tbClientes;
    private JButton btnAadirCliente;
    private JButton btnEditarCliente;
    private JButton btnBorrarCliente;
    private JScrollPane spHistorial;
    private JTable tbHistorial;
    private JLabel lblPuntosAcumulados;
    private JLabel label;
    private JLabel lblVlidosHasta;
    private JLabel label_1;
    private JLabel lblHelp;

    public JPanel getPnlTablaClientes() {
        return pnlTablaClientes;
    }

    public void setPnlTablaClientes(JPanel pnlTablaClientes) {
        this.pnlTablaClientes = pnlTablaClientes;
    }

    public JPanel getPnlHistorialPedidos() {
        return pnlHistorialPedidos;
    }

    public void setPnlHistorialPedidos(JPanel pnlHistorialPedidos) {
        this.pnlHistorialPedidos = pnlHistorialPedidos;
    }

    public JPanel getPnlPuntos() {
        return pnlPuntos;
    }

    public void setPnlPuntos(JPanel pnlPuntos) {
        this.pnlPuntos = pnlPuntos;
    }

    public JScrollPane getSpTablaClientes() {
        return spTablaClientes;
    }

    public void setSpTablaClientes(JScrollPane spTablaClientes) {
        this.spTablaClientes = spTablaClientes;
    }

    public JTable getTbClientes() {
        return tbClientes;
    }

    public void setTbClientes(JTable tbClientes) {
        this.tbClientes = tbClientes;
    }

    public JButton getBtnAadirCliente() {
        return btnAadirCliente;
    }

    public void setBtnAadirCliente(JButton btnAadirCliente) {
        this.btnAadirCliente = btnAadirCliente;
    }

    public JButton getBtnEditarCliente() {
        return btnEditarCliente;
    }

    public void setBtnEditarCliente(JButton btnEditarCliente) {
        this.btnEditarCliente = btnEditarCliente;
    }

    public JButton getBtnBorrarCliente() {
        return btnBorrarCliente;
    }

    public void setBtnBorrarCliente(JButton btnBorrarCliente) {
        this.btnBorrarCliente = btnBorrarCliente;
    }

    public JScrollPane getSpHistorial() {
        return spHistorial;
    }

    public void setSpHistorial(JScrollPane spHistorial) {
        this.spHistorial = spHistorial;
    }

    public JTable getTbHistorial() {
        return tbHistorial;
    }

    public void setTbHistorial(JTable tbHistorial) {
        this.tbHistorial = tbHistorial;
    }

    public JLabel getLblPuntosAcumulados() {
        return lblPuntosAcumulados;
    }

    public void setLblPuntosAcumulados(JLabel lblPuntosAcumulados) {
        this.lblPuntosAcumulados = lblPuntosAcumulados;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JLabel getLblVlidosHasta() {
        return lblVlidosHasta;
    }

    public void setLblVlidosHasta(JLabel lblVlidosHasta) {
        this.lblVlidosHasta = lblVlidosHasta;
    }

    public JLabel getLabel_1() {
        return label_1;
    }

    public void setLabel_1(JLabel label_1) {
        this.label_1 = label_1;
    }

    public JLabel getLblHelp() {
        return lblHelp;
    }

    public void setLblHelp(JLabel lblHelp) {
        this.lblHelp = lblHelp;
    }

    /**
     * Create the panel.
     */
    public PestañaClientes() {
        setBounds(new Rectangle(0, 0, 1280, 720));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 1106, 150, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 510, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0,
                Double.MIN_VALUE };
        setLayout(gridBagLayout);

        lblHelp = new JLabel(""); //$NON-NLS-1$
        lblHelp.addMouseListener(new LblHelpMouseListener());
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 2;
        gbc_lblHelp.gridy = 0;
        add(lblHelp, gbc_lblHelp);
        lblHelp.setIcon(new ImageIcon(PestañaClientes.class
                .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$

        pnlTablaClientes = new JPanel();
        pnlTablaClientes.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlTablaClientes.setBorder(new TitledBorder(null, MessagesPestanaClientes.getString("PestañaClientes.pnlTablaClientes.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlTablaClientes = new GridBagConstraints();
        gbc_pnlTablaClientes.gridwidth = 2;
        gbc_pnlTablaClientes.insets = new Insets(0, 0, 5, 5);
        gbc_pnlTablaClientes.fill = GridBagConstraints.BOTH;
        gbc_pnlTablaClientes.gridx = 0;
        gbc_pnlTablaClientes.gridy = 1;
        add(pnlTablaClientes, gbc_pnlTablaClientes);
        GridBagLayout gbl_pnlTablaClientes = new GridBagLayout();
        gbl_pnlTablaClientes.columnWidths = new int[] { 0, 100, 0 };
        gbl_pnlTablaClientes.rowHeights = new int[] { 50, 50, 0, 50, 0 };
        gbl_pnlTablaClientes.columnWeights = new double[] { 1.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlTablaClientes.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        pnlTablaClientes.setLayout(gbl_pnlTablaClientes);

        spTablaClientes = new JScrollPane();
        GridBagConstraints gbc_spTablaClientes = new GridBagConstraints();
        gbc_spTablaClientes.gridheight = 4;
        gbc_spTablaClientes.insets = new Insets(0, 0, 0, 5);
        gbc_spTablaClientes.fill = GridBagConstraints.BOTH;
        gbc_spTablaClientes.gridx = 0;
        gbc_spTablaClientes.gridy = 0;
        pnlTablaClientes.add(spTablaClientes, gbc_spTablaClientes);

        tbClientes = new JTable();
        tbClientes.setModel(new DefaultTableModel(new Object[][] { { "Sergio", //$NON-NLS-1$
                "Herrera Piqueras", "Calle Concepci\u00F3n Arenal, 7", //$NON-NLS-1$ //$NON-NLS-2$
                new Integer(666333444), "sergio.herrera2@alu.uclm.es", "", "" }, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                { "Luis", "Rodr\u00EDguez D\u00EDaz", "Calle Quijote, 32", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        new Integer(755532122), null, null, MessagesPestanaClientes.getString("PestañaClientes.RestriccionesTabla") }, //$NON-NLS-1$
                { "Jos\u00E9", "Mart\u00EDnez Fern\u00E1ndez", //$NON-NLS-1$ //$NON-NLS-2$
                        "Calle Toledo, 43", null, "jmfernandez@gmail.com", //$NON-NLS-1$ //$NON-NLS-2$
                        MessagesPestanaClientes.getString("PestañaClientes.PreferenciasTabla"), null }, //$NON-NLS-1$
                { "Federico", "Guti\u00E9rrez de la Vega", "Calle Ancha, 4", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        new Integer(611333222), "jgutierrezdlv@hotmail.es", //$NON-NLS-1$
                        null, MessagesPestanaClientes.getString("PestañaClientes.RestriccionesTabla2") }, }, //$NON-NLS-1$
                new String[] { MessagesPestanaClientes.getString("PestañaClientes.TablaNombre"), MessagesPestanaClientes.getString("PestañaClientes.TablaApellidos"), MessagesPestanaClientes.getString("PestañaClientes.TablaDireccion"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        MessagesPestanaClientes.getString("PestañaClientes.TablaTelefono"), MessagesPestanaClientes.getString("PestañaClientes.TablaCorreo"), MessagesPestanaClientes.getString("PestañaClientes.TablaRestricciones"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        MessagesPestanaClientes.getString("PestañaClientes.TablaAlergias") }) { //$NON-NLS-1$
            Class[] columnTypes = new Class[] { String.class, String.class,
                    String.class, Integer.class, String.class, String.class,
                    String.class };

            @Override
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        tbClientes.getColumnModel().getColumn(1).setPreferredWidth(115);
        tbClientes.getColumnModel().getColumn(4).setPreferredWidth(178);
        tbClientes.getColumnModel().getColumn(5).setPreferredWidth(122);
        tbClientes.getColumnModel().getColumn(6).setPreferredWidth(148);
        spTablaClientes.setViewportView(tbClientes);

        btnAadirCliente = new JButton(MessagesPestanaClientes.getString("PestañaClientes.btnAadirCliente.text")); //$NON-NLS-1$
        btnAadirCliente.addActionListener(new BtnAadirClienteActionListener());
        btnAadirCliente.setIcon(new ImageIcon(PestañaClientes.class
                .getResource("/presentacion/iconos/rounded-add-button.png"))); //$NON-NLS-1$
        btnAadirCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnAadirCliente = new GridBagConstraints();
        gbc_btnAadirCliente.fill = GridBagConstraints.BOTH;
        gbc_btnAadirCliente.insets = new Insets(0, 0, 5, 0);
        gbc_btnAadirCliente.gridx = 1;
        gbc_btnAadirCliente.gridy = 0;
        pnlTablaClientes.add(btnAadirCliente, gbc_btnAadirCliente);

        btnEditarCliente = new JButton(MessagesPestanaClientes.getString("PestañaClientes.btnEditarCliente.text")); //$NON-NLS-1$
        btnEditarCliente
                .addActionListener(new BtnEditarClienteActionListener());
        btnEditarCliente.setIcon(new ImageIcon(PestañaClientes.class
                .getResource("/presentacion/iconos/edit24.png"))); //$NON-NLS-1$
        btnEditarCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnEditarCliente = new GridBagConstraints();
        gbc_btnEditarCliente.fill = GridBagConstraints.BOTH;
        gbc_btnEditarCliente.insets = new Insets(0, 0, 5, 0);
        gbc_btnEditarCliente.gridx = 1;
        gbc_btnEditarCliente.gridy = 1;
        pnlTablaClientes.add(btnEditarCliente, gbc_btnEditarCliente);

        btnBorrarCliente = new JButton(MessagesPestanaClientes.getString("PestañaClientes.btnBorrarCliente.text")); //$NON-NLS-1$
        btnBorrarCliente
                .addActionListener(new BtnBorrarClienteActionListener());
        btnBorrarCliente
                .setIcon(new ImageIcon(PestañaClientes.class.getResource(
                        "/presentacion/iconos/rubbish-bin-delete-button.png"))); //$NON-NLS-1$
        btnBorrarCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_btnBorrarCliente = new GridBagConstraints();
        gbc_btnBorrarCliente.fill = GridBagConstraints.BOTH;
        gbc_btnBorrarCliente.gridx = 1;
        gbc_btnBorrarCliente.gridy = 3;
        pnlTablaClientes.add(btnBorrarCliente, gbc_btnBorrarCliente);

        pnlHistorialPedidos = new JPanel();
        pnlHistorialPedidos.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlHistorialPedidos
                .setBorder(new TitledBorder(null, MessagesPestanaClientes.getString("PestañaClientes.pnlHistorialPedidos.borderTitle"), //$NON-NLS-1$
                        TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlHistorialPedidos = new GridBagConstraints();
        gbc_pnlHistorialPedidos.insets = new Insets(0, 0, 0, 5);
        gbc_pnlHistorialPedidos.fill = GridBagConstraints.BOTH;
        gbc_pnlHistorialPedidos.gridx = 0;
        gbc_pnlHistorialPedidos.gridy = 2;
        add(pnlHistorialPedidos, gbc_pnlHistorialPedidos);
        GridBagLayout gbl_pnlHistorialPedidos = new GridBagLayout();
        gbl_pnlHistorialPedidos.columnWidths = new int[] { 0, 0 };
        gbl_pnlHistorialPedidos.rowHeights = new int[] { 0, 0 };
        gbl_pnlHistorialPedidos.columnWeights = new double[] { 1.0,
                Double.MIN_VALUE };
        gbl_pnlHistorialPedidos.rowWeights = new double[] { 1.0,
                Double.MIN_VALUE };
        pnlHistorialPedidos.setLayout(gbl_pnlHistorialPedidos);

        spHistorial = new JScrollPane();
        GridBagConstraints gbc_spHistorial = new GridBagConstraints();
        gbc_spHistorial.fill = GridBagConstraints.BOTH;
        gbc_spHistorial.gridx = 0;
        gbc_spHistorial.gridy = 0;
        pnlHistorialPedidos.add(spHistorial, gbc_spHistorial);

        tbHistorial = new JTable();
        tbHistorial.setModel(new DefaultTableModel(new Object[][] {
                { new Integer(1), MessagesPestanaClientes.getString("PestañaClientes.TipoEnvio"), MessagesPestanaClientes.getString("PestañaClientes.EstadoEnvio"), //$NON-NLS-1$ //$NON-NLS-2$
                        new Double(24.67), null, "21:37", null, "22:00", //$NON-NLS-1$ //$NON-NLS-2$
                        "Calle Concepci\u00F3n Arenal, N7, Ciudad Real" }, //$NON-NLS-1$
                { new Integer(2), MessagesPestanaClientes.getString("PestañaClientes.TipoEnvio2"), MessagesPestanaClientes.getString("PestañaClientes.EstadoEnvio2"), new Double(9.8), null, //$NON-NLS-1$ //$NON-NLS-2$
                        "20:07", "20:30", null, null }, }, //$NON-NLS-1$ //$NON-NLS-2$
                new String[] { MessagesPestanaClientes.getString("PestañaClientes.HistorialPedido"), MessagesPestanaClientes.getString("PestañaClientes.HistorialTipo"), MessagesPestanaClientes.getString("PestañaClientes.HistorialEstado"), MessagesPestanaClientes.getString("PestañaClientes.HistorialImporte"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                        MessagesPestanaClientes.getString("PestañaClientes.HistorialPagado"), MessagesPestanaClientes.getString("PestañaClientes.HistorialFechaHora"), MessagesPestanaClientes.getString("PestañaClientes.HistorialRecogida"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        MessagesPestanaClientes.getString("PestañaClientes.HistorialLlegada"), MessagesPestanaClientes.getString("PestañaClientes.HistorialDireccion") }) { //$NON-NLS-1$ //$NON-NLS-2$
            Class[] columnTypes = new Class[] { Integer.class, String.class,
                    String.class, Double.class, Boolean.class, String.class,
                    String.class, String.class, String.class };

            @Override
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        tbHistorial.getColumnModel().getColumn(4).setResizable(false);
        spHistorial.setViewportView(tbHistorial);

        pnlPuntos = new JPanel();
        pnlPuntos.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        pnlPuntos.setBorder(new TitledBorder(null, MessagesPestanaClientes.getString("PestañaClientes.pnlPuntos.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));

        GridBagConstraints gbc_pnlPuntos = new GridBagConstraints();
        gbc_pnlPuntos.insets = new Insets(0, 0, 0, 5);
        gbc_pnlPuntos.fill = GridBagConstraints.BOTH;
        gbc_pnlPuntos.gridx = 1;
        gbc_pnlPuntos.gridy = 2;

        add(pnlPuntos, gbc_pnlPuntos);
        GridBagLayout gbl_pnlPuntos = new GridBagLayout();
        gbl_pnlPuntos.columnWidths = new int[] { 0, 35, 0 };
        gbl_pnlPuntos.rowHeights = new int[] { 59, 0, 46, 0, 0 };
        gbl_pnlPuntos.columnWeights = new double[] { 0.0, 1.0,
                Double.MIN_VALUE };
        gbl_pnlPuntos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
                Double.MIN_VALUE };
        pnlPuntos.setLayout(gbl_pnlPuntos);

        lblPuntosAcumulados = new JLabel(MessagesPestanaClientes.getString("PestañaClientes.lblPuntosAcumulados.text")); //$NON-NLS-1$
        lblPuntosAcumulados.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        GridBagConstraints gbc_lblPuntosAcumulados = new GridBagConstraints();
        gbc_lblPuntosAcumulados.gridwidth = 2;
        gbc_lblPuntosAcumulados.insets = new Insets(0, 0, 5, 5);
        gbc_lblPuntosAcumulados.gridx = 0;
        gbc_lblPuntosAcumulados.gridy = 0;
        pnlPuntos.add(lblPuntosAcumulados, gbc_lblPuntosAcumulados);

        label = new JLabel("3"); //$NON-NLS-1$
        label.setFont(new Font("Segoe UI Black", Font.BOLD, 20)); //$NON-NLS-1$
        label.setForeground(Color.RED);
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.gridwidth = 2;
        gbc_label.insets = new Insets(0, 0, 5, 5);
        gbc_label.gridx = 0;
        gbc_label.gridy = 1;
        pnlPuntos.add(label, gbc_label);

        lblVlidosHasta = new JLabel(MessagesPestanaClientes.getString("PestañaClientes.lblVlidosHasta.text")); //$NON-NLS-1$
        lblVlidosHasta.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        GridBagConstraints gbc_lblVlidosHasta = new GridBagConstraints();
        gbc_lblVlidosHasta.gridwidth = 2;
        gbc_lblVlidosHasta.insets = new Insets(0, 0, 5, 5);
        gbc_lblVlidosHasta.gridx = 0;
        gbc_lblVlidosHasta.gridy = 2;
        pnlPuntos.add(lblVlidosHasta, gbc_lblVlidosHasta);

        label_1 = new JLabel(MessagesPestanaClientes.getString("PestañaClientes.label_1.text")); //$NON-NLS-1$
        label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20)); //$NON-NLS-1$
        label_1.setForeground(Color.RED);
        GridBagConstraints gbc_label_1 = new GridBagConstraints();
        gbc_label_1.gridwidth = 2;
        gbc_label_1.gridx = 0;
        gbc_label_1.gridy = 3;
        pnlPuntos.add(label_1, gbc_label_1);

    }

    private class BtnAadirClienteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FormularioCliente cliente = new FormularioCliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
        }
    }

    private class BtnEditarClienteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tbClientes.getSelectedRow() != -1) {
                FormularioCliente cliente = new FormularioCliente();
                cliente.setVisible(true);
                cliente.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(new JPanel(),
                        MessagesPestanaClientes.getString("PestañaClientes.DialogoAviso"), MessagesPestanaClientes.getString("PestañaClientes.CabeceraAviso"), //$NON-NLS-1$ //$NON-NLS-2$
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private class BtnBorrarClienteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tbClientes.getSelectedRow() != -1) {
                DefaultTableModel dtm = (DefaultTableModel) tbClientes
                        .getModel();
                if (JOptionPane.showConfirmDialog(new JPanel(),
                        MessagesPestanaClientes.getString("PestañaClientes.DialogoConfirmacion"), //$NON-NLS-1$
                        MessagesPestanaClientes.getString("PestañaClientes.CabeceraCuidado"), JOptionPane.YES_NO_OPTION) == 0) { //$NON-NLS-1$
                    dtm.removeRow(tbClientes.getSelectedRow());
                }
            } else {
                JOptionPane.showMessageDialog(new JPanel(),
                        MessagesPestanaClientes.getString("PestañaClientes.DialogoAviso2"), MessagesPestanaClientes.getString("PestañaClientes.CabeceraAviso"), //$NON-NLS-1$ //$NON-NLS-2$
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaClientes.getString("PestañaClientes.MensajeAyuda1") //$NON-NLS-1$
                            + MessagesPestanaClientes.getString("PestañaClientes.MensajeAyuda2") //$NON-NLS-1$
                            + MessagesPestanaClientes.getString("PestañaClientes.MensajeAyuda3") //$NON-NLS-1$
                            + MessagesPestanaClientes.getString("PestañaClientes.MensajeAyuda4") //$NON-NLS-1$
                            + MessagesPestanaClientes.getString("PestañaClientes.MensajeAyuda5"), //$NON-NLS-1$
                    MessagesPestanaClientes.getString("PestañaClientes.CabeceraAyuda"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }
}
