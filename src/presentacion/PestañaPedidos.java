package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import presentacion.paneles.pnlDatosCliente;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestañaPedidos extends JPanel {
    private VentanaPrincipal tpv;

    private JPanel pnlTablaPedidos;
    private JScrollPane spTablaPedidos;
    private JTable tbPedidos;
    private JPanel pnlProductos;
    private JButton btnNuevoPedido;
    private JButton btnEditarPedido;
    private JButton btnVerPedido;
    private JButton btnBorrarPedido;
    private JScrollPane spTablaProductos;
    private JTable tbProductos;
    private JButton btnImprimirTicket;
    private JLabel lblTotal;
    private JTextField tfPrecio;
    private JLabel lblHelp;
    private JPanel panel;
    private JLabel lblAyuda;

    /**
     * Create the panel.
     */
    public PestañaPedidos(VentanaPrincipal tpv) {
        this.tpv = tpv;
        setBounds(new Rectangle(0, 0, 1280, 720));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 871, 0, 0, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 375, 431, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0,
                Double.MIN_VALUE };
        setLayout(gridBagLayout);

        lblHelp = new JLabel("");
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/information.png")));
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 2;
        gbc_lblHelp.gridy = 0;
        add(lblHelp, gbc_lblHelp);

        pnlTablaPedidos = new JPanel();
        pnlTablaPedidos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlTablaPedidos.setBorder(
                new TitledBorder(UIManager.getBorder("TitledBorder.border"),
                        MessagesPestanaPedidos.getString("PestañaPedidos.pnlTablaPedidos.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, //$NON-NLS-1$
                        new Color(0, 0, 0)));
        GridBagConstraints gbc_pnlTablaPedidos = new GridBagConstraints();
        gbc_pnlTablaPedidos.gridwidth = 2;
        gbc_pnlTablaPedidos.insets = new Insets(0, 0, 5, 5);
        gbc_pnlTablaPedidos.fill = GridBagConstraints.BOTH;
        gbc_pnlTablaPedidos.gridx = 0;
        gbc_pnlTablaPedidos.gridy = 1;
        add(pnlTablaPedidos, gbc_pnlTablaPedidos);
        GridBagLayout gbl_pnlTablaPedidos = new GridBagLayout();
        gbl_pnlTablaPedidos.columnWidths = new int[] { 0, 100, 0 };
        gbl_pnlTablaPedidos.rowHeights = new int[] { 50, 50, 50, 50, 50, 50,
                0 };
        gbl_pnlTablaPedidos.columnWeights = new double[] { 1.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlTablaPedidos.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
                0.0, Double.MIN_VALUE };
        pnlTablaPedidos.setLayout(gbl_pnlTablaPedidos);

        spTablaPedidos = new JScrollPane();
        GridBagConstraints gbc_spTablaPedidos = new GridBagConstraints();
        gbc_spTablaPedidos.gridheight = 6;
        gbc_spTablaPedidos.insets = new Insets(0, 0, 5, 5);
        gbc_spTablaPedidos.fill = GridBagConstraints.BOTH;
        gbc_spTablaPedidos.gridx = 0;
        gbc_spTablaPedidos.gridy = 0;
        pnlTablaPedidos.add(spTablaPedidos, gbc_spTablaPedidos);

        tbPedidos = new JTable();
        tbPedidos.setModel(new DefaultTableModel(new Object[][] {
                { new Integer(1), "A domicilio", "En elaboraci\u00F3n",
                        new Double(24.67), null, "21:37", null, "22:00",
                        "Calle Concepci\u00F3n Arenal, 7, Ciudad Real" },
                { new Integer(2), "Local", "Pagado", new Double(44.5),
                        Boolean.TRUE, "20:30", null, null, null },
                { new Integer(3), "Recogida", "Recogido", new Double(9.8), null,
                        "20:07", "20:30", null, null },
                { new Integer(4), "Local", null, new Double(4.99), Boolean.TRUE,
                        "19:46", null, null, null }, },
                new String[] { "Pedido", "Tipo", "Estado", "Importe total",
                        "Pagado", "Fecha y hora", "Hora recogida",
                        "Hora llegada", "Direcci\u00F3n env\u00EDo" }) {
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
        tbPedidos.getColumnModel().getColumn(2).setPreferredWidth(95);
        tbPedidos.getColumnModel().getColumn(3).setPreferredWidth(89);
        tbPedidos.getColumnModel().getColumn(5).setPreferredWidth(89);
        tbPedidos.getColumnModel().getColumn(6).setPreferredWidth(99);
        tbPedidos.getColumnModel().getColumn(7).setPreferredWidth(84);
        tbPedidos.getColumnModel().getColumn(8).setPreferredWidth(103);
        spTablaPedidos.setViewportView(tbPedidos);

        btnNuevoPedido = new JButton(MessagesPestanaPedidos.getString("PestañaPedidos.btnNuevoPedido.text")); //$NON-NLS-1$
        btnNuevoPedido.addActionListener(new BtnNuevoPedidoActionListener());
        btnNuevoPedido.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/rounded-add-button.png")));
        btnNuevoPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnNuevoPedido = new GridBagConstraints();
        gbc_btnNuevoPedido.fill = GridBagConstraints.BOTH;
        gbc_btnNuevoPedido.insets = new Insets(0, 0, 5, 0);
        gbc_btnNuevoPedido.gridx = 1;
        gbc_btnNuevoPedido.gridy = 0;
        pnlTablaPedidos.add(btnNuevoPedido, gbc_btnNuevoPedido);

        btnEditarPedido = new JButton(MessagesPestanaPedidos.getString("PestañaPedidos.btnEditarPedido.text")); //$NON-NLS-1$
        btnEditarPedido.addActionListener(new BtnEditarPedidoActionListener());
        btnEditarPedido.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/edit24.png")));
        btnEditarPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnEditarPedido = new GridBagConstraints();
        gbc_btnEditarPedido.fill = GridBagConstraints.BOTH;
        gbc_btnEditarPedido.insets = new Insets(0, 0, 5, 0);
        gbc_btnEditarPedido.gridx = 1;
        gbc_btnEditarPedido.gridy = 1;
        pnlTablaPedidos.add(btnEditarPedido, gbc_btnEditarPedido);

        btnVerPedido = new JButton(MessagesPestanaPedidos.getString("PestañaPedidos.btnVerPedido.text")); //$NON-NLS-1$
        btnVerPedido.addActionListener(new BtnVerPedidoActionListener());
        btnVerPedido.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/show-more-button.png")));
        btnVerPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnVerPedido = new GridBagConstraints();
        gbc_btnVerPedido.fill = GridBagConstraints.BOTH;
        gbc_btnVerPedido.insets = new Insets(0, 0, 5, 0);
        gbc_btnVerPedido.gridx = 1;
        gbc_btnVerPedido.gridy = 2;
        pnlTablaPedidos.add(btnVerPedido, gbc_btnVerPedido);

        btnBorrarPedido = new JButton(MessagesPestanaPedidos.getString("PestañaPedidos.btnBorrarPedido.text")); //$NON-NLS-1$
        btnBorrarPedido.addActionListener(new BtnBorrarPedidoActionListener());
        btnBorrarPedido.setIcon(new ImageIcon(PestañaPedidos.class.getResource(
                "/presentacion/iconos/rubbish-bin-delete-button.png")));
        btnBorrarPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnBorrarPedido = new GridBagConstraints();
        gbc_btnBorrarPedido.fill = GridBagConstraints.BOTH;
        gbc_btnBorrarPedido.gridx = 1;
        gbc_btnBorrarPedido.gridy = 5;
        pnlTablaPedidos.add(btnBorrarPedido, gbc_btnBorrarPedido);

        pnlProductos = new JPanel();
        pnlProductos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlProductos.setBorder(new TitledBorder(null, MessagesPestanaPedidos.getString("PestañaPedidos.pnlProductos.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlProductos = new GridBagConstraints();
        gbc_pnlProductos.insets = new Insets(0, 0, 0, 5);
        gbc_pnlProductos.fill = GridBagConstraints.BOTH;
        gbc_pnlProductos.gridx = 0;
        gbc_pnlProductos.gridy = 2;
        add(pnlProductos, gbc_pnlProductos);
        GridBagLayout gbl_pnlProductos = new GridBagLayout();
        gbl_pnlProductos.columnWidths = new int[] { 606, 50, 50, 10, 0 };
        gbl_pnlProductos.rowHeights = new int[] { 10, 0, 0, 50, 0 };
        gbl_pnlProductos.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0,
                Double.MIN_VALUE };
        gbl_pnlProductos.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0,
                Double.MIN_VALUE };
        pnlProductos.setLayout(gbl_pnlProductos);

        lblAyuda = new JLabel("");
        lblAyuda.addMouseListener(new LblAyudaMouseListener());
        lblAyuda.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/information.png")));
        GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
        gbc_lblAyuda.insets = new Insets(0, 0, 5, 0);
        gbc_lblAyuda.gridx = 3;
        gbc_lblAyuda.gridy = 0;
        pnlProductos.add(lblAyuda, gbc_lblAyuda);

        spTablaProductos = new JScrollPane();
        GridBagConstraints gbc_spTablaProductos = new GridBagConstraints();
        gbc_spTablaProductos.gridheight = 3;
        gbc_spTablaProductos.insets = new Insets(0, 0, 0, 5);
        gbc_spTablaProductos.fill = GridBagConstraints.BOTH;
        gbc_spTablaProductos.gridx = 0;
        gbc_spTablaProductos.gridy = 1;
        pnlProductos.add(spTablaProductos, gbc_spTablaProductos);

        tbProductos = new JTable();
        tbProductos.setModel(new DefaultTableModel(
                new Object[][] {
                        { "Hamburguesa", new Double(6.95), new Integer(1),
                                new Double(6.95) },
                        { "Pizza 4 Quesos", new Double(8.0), new Integer(2),
                                new Double(16.0) },
                        { "Coca Cola Zero", new Double(1.5), new Integer(3),
                                new Double(4.5) },
                        { "Pizza Barbacoa", new Double(8.5), new Integer(2),
                                new Double(17.0) }, },
                new String[] { "Producto", "Precio", "Uds", "Importe total" }) {
            Class[] columnTypes = new Class[] { String.class, Double.class,
                    Integer.class, Double.class };

            @Override
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        tbProductos.getColumnModel().getColumn(0).setPreferredWidth(107);
        tbProductos.getColumnModel().getColumn(3).setPreferredWidth(95);
        spTablaProductos.setViewportView(tbProductos);

        lblTotal = new JLabel(MessagesPestanaPedidos.getString("PestañaPedidos.lblTotal.text")); //$NON-NLS-1$
        lblTotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        GridBagConstraints gbc_lblTotal = new GridBagConstraints();
        gbc_lblTotal.anchor = GridBagConstraints.EAST;
        gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
        gbc_lblTotal.gridx = 1;
        gbc_lblTotal.gridy = 2;
        pnlProductos.add(lblTotal, gbc_lblTotal);

        tfPrecio = new JTextField();
        tfPrecio.setForeground(Color.RED);
        tfPrecio.setFont(new Font("Segoe UI Black", Font.PLAIN, 13));
        tfPrecio.setEditable(false);
        tfPrecio.setText("44.50\u20AC");
        GridBagConstraints gbc_tfPrecio = new GridBagConstraints();
        gbc_tfPrecio.fill = GridBagConstraints.HORIZONTAL;
        gbc_tfPrecio.insets = new Insets(0, 0, 5, 5);
        gbc_tfPrecio.gridx = 2;
        gbc_tfPrecio.gridy = 2;
        pnlProductos.add(tfPrecio, gbc_tfPrecio);
        tfPrecio.setColumns(10);

        btnImprimirTicket = new JButton(MessagesPestanaPedidos.getString("PestañaPedidos.btnImprimirTicket.text")); //$NON-NLS-1$
        btnImprimirTicket
                .addActionListener(new BtnImprimirTicketActionListener());
        btnImprimirTicket.setIcon(new ImageIcon(PestañaPedidos.class
                .getResource("/presentacion/iconos/receipt.png")));
        btnImprimirTicket
                .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnImprimirTicket = new GridBagConstraints();
        gbc_btnImprimirTicket.insets = new Insets(0, 0, 0, 5);
        gbc_btnImprimirTicket.gridwidth = 2;
        gbc_btnImprimirTicket.fill = GridBagConstraints.BOTH;
        gbc_btnImprimirTicket.gridx = 1;
        gbc_btnImprimirTicket.gridy = 3;
        pnlProductos.add(btnImprimirTicket, gbc_btnImprimirTicket);

        panel = new pnlDatosCliente();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets(0, 0, 0, 5);
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 2;
        add(panel, gbc_panel);

    }

    private class BtnNuevoPedidoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VentanaGestionPedidos gp = new VentanaGestionPedidos();
            gp.setLocationRelativeTo(null);
            gp.setVisible(true);
        }
    }

    private class BtnEditarPedidoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tbPedidos.getSelectedRow() > -1) {
                VentanaGestionPedidos gp = new VentanaGestionPedidos();
                gp.setLocationRelativeTo(null);
                gp.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(tpv,
                        "Primero tienes que seleccionar una fila.", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private class BtnVerPedidoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tbPedidos.getSelectedRow() > -1) {
                VentanaGestionPedidos gp = new VentanaGestionPedidos();
                gp.setLocationRelativeTo(null);
                gp.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(tpv,
                        "Primero tienes que seleccionar una fila.", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private class BtnBorrarPedidoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel dtm = (DefaultTableModel) tbPedidos.getModel();
            if (tbPedidos.getSelectedRow() > -1) {
                if (JOptionPane.showConfirmDialog(tpv,
                        "¿Estás seguro de que quieres borrar el pedido?",
                        "Cuidado", JOptionPane.YES_NO_OPTION) == 0) {
                    dtm.removeRow(tbPedidos.getSelectedRow());
                }
            } else {
                JOptionPane.showMessageDialog(tpv,
                        "Primero tienes que seleccionar una fila.", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(tpv,
                    "En esta pestaña puedes ver todos los pedidos que hay en el sistema.\r\n"
                            + "            Sobre la tabla de pedidos se puede:\r\n"
                            + "            - Crear un nuevo pedido en una nueva ventana al pulsar en Nuevo Pedido.\r\n"
                            + "            - Editar el pedido seleccionado en una nueva ventana.\r\n"
                            + "            - Ver la información detallada del pedido en otra ventana.\r\n"
                            + "            - Borrar el pedido seleccionado.\r\n"
                            + "             \r\n"
                            + "            Cuando pulsas en un pedido, aparece la información de sus productos en la tabla inferior, del cual podríamos imprimir el ticket. \r\n"
                            + "             \r\n"
                            + "            Por último, la información del cliente será mostrada automáticamente al seleccionar un pedido mediante la base de datos.",
                    "Ayuda", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class BtnImprimirTicketActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(tpv, "Módulo no implementado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class LblAyudaMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(tpv,
                    "En este panel podemos ver la información del pedido e imprimir su ticket.",
                    "Ayuda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
