package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import presentacion.formularios.FormularioCliente;
import presentacion.listeners.MiFocusListener;
import presentacion.paneles.pnlDatosCliente;

import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaGestionPedidos extends JFrame {
    private static VentanaGestionPedidos frame;

    private JPanel contentPane;
    private JPanel pnlPedido;
    private JLabel lblAyudapedido;
    private JLabel lblTipo;
    private JComboBox cbTipo;
    private JLabel lblClienteVip;
    private JRadioButton rdbtnVip;
    private JButton button;
    private JComponent lblHoraDeRecogida;
    private JTextField txtHorarecogida;
    private JLabel lblHoraDeLlegada;
    private JTextField txtHorallegada;
    private JPanel pnlCliente;
    private JPanel pnlResumen;
    private JTable tResumen;
    private JScrollPane scrollPane;
    private JButton btnConfirmar;
    private JButton btnEliminar;
    private JLabel lblTotal;
    private JTextField textField;
    private JButton btnTerminar;
    private JPanel pnlProductos;
    private JLabel lblComida;
    private JLabel lblBebida;
    private JLabel lblPostre;
    private JLabel lblAyuda;
    private JLabel lblAyuda_1;

    public JTable gettResumen() {
        return tResumen;
    }

    public void settResumen(JTable tResumen) {
        this.tResumen = tResumen;
    }

    public JPanel getPnlCliente() {
        return pnlCliente;
    }

    public void setPnlCliente(JPanel pnlCliente) {
        this.pnlCliente = pnlCliente;
    }

    public JTextField getTxtHorarecogida() {
        return txtHorarecogida;
    }

    public void setTxtHorarecogida(JTextField txtHorarecogida) {
        this.txtHorarecogida = txtHorarecogida;
    }

    public JTextField getTxtHorallegada() {
        return txtHorallegada;
    }

    public void setTxtHorallegada(JTextField txtHorallegada) {
        this.txtHorallegada = txtHorallegada;
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new VentanaGestionPedidos();
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
    public VentanaGestionPedidos() {
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(VentanaGestionPedidos.class.getResource(
                        "/presentacion/imagenes/food-2074638_960_720 - resized.png"))); //$NON-NLS-1$
        setTitle(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.this.title")); //$NON-NLS-1$
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] { 0, 123, 0, 0 };
        gbl_contentPane.rowHeights = new int[] { 416, 362, 0 };
        gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0,
                Double.MIN_VALUE };
        gbl_contentPane.rowWeights = new double[] { 0.0, 0.0,
                Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);
        {
            pnlPedido = new JPanel();
            pnlPedido.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
            pnlPedido.setBorder(new TitledBorder(null, MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.pnlPedido.borderTitle"), //$NON-NLS-1$
                    TitledBorder.LEADING, TitledBorder.TOP, null, null));
            GridBagConstraints gbc_pnlPedido = new GridBagConstraints();
            gbc_pnlPedido.insets = new Insets(0, 0, 5, 5);
            gbc_pnlPedido.fill = GridBagConstraints.BOTH;
            gbc_pnlPedido.gridx = 0;
            gbc_pnlPedido.gridy = 0;
            getContentPane().add(pnlPedido, gbc_pnlPedido);
            GridBagLayout gbl_pnlPedido = new GridBagLayout();
            gbl_pnlPedido.columnWidths = new int[] { 10, 0, 122, 0, 10, 0 };
            gbl_pnlPedido.rowHeights = new int[] { 10, 50, 50, 50, 50, 10, 0 };
            gbl_pnlPedido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
                    0.0, Double.MIN_VALUE };
            gbl_pnlPedido.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0,
                    1.0, Double.MIN_VALUE };
            pnlPedido.setLayout(gbl_pnlPedido);
            {
                lblAyudapedido = new JLabel(""); //$NON-NLS-1$
                lblAyudapedido
                        .addMouseListener(new LblAyudapedidoMouseListener());
                lblAyudapedido.setIcon(new ImageIcon(VentanaGestionPedidos.class
                        .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
                GridBagConstraints gbc_lblAyudapedido = new GridBagConstraints();
                gbc_lblAyudapedido.insets = new Insets(0, 0, 5, 0);
                gbc_lblAyudapedido.gridx = 4;
                gbc_lblAyudapedido.gridy = 0;
                pnlPedido.add(lblAyudapedido, gbc_lblAyudapedido);
            }
            {
                lblTipo = new JLabel(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.lblTipo.text")); //$NON-NLS-1$
                lblTipo.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
                GridBagConstraints gbc_lblTipo = new GridBagConstraints();
                gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
                gbc_lblTipo.anchor = GridBagConstraints.WEST;
                gbc_lblTipo.gridx = 1;
                gbc_lblTipo.gridy = 1;
                pnlPedido.add(lblTipo, gbc_lblTipo);
            }
            {
                cbTipo = new JComboBox();
                cbTipo.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
                cbTipo.setModel(new DefaultComboBoxModel(
                        new String[] { MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ComboTipo1"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ComboTipo2"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ComboTipo3") })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                GridBagConstraints gbc_cbTipo = new GridBagConstraints();
                gbc_cbTipo.gridwidth = 2;
                gbc_cbTipo.insets = new Insets(0, 0, 5, 5);
                gbc_cbTipo.fill = GridBagConstraints.HORIZONTAL;
                gbc_cbTipo.gridx = 2;
                gbc_cbTipo.gridy = 1;
                pnlPedido.add(cbTipo, gbc_cbTipo);
            }
            {
                lblClienteVip = new JLabel(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.lblClienteVip.text")); //$NON-NLS-1$
                lblClienteVip.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
                GridBagConstraints gbc_lblClienteVip = new GridBagConstraints();
                gbc_lblClienteVip.anchor = GridBagConstraints.WEST;
                gbc_lblClienteVip.insets = new Insets(0, 0, 5, 5);
                gbc_lblClienteVip.gridx = 1;
                gbc_lblClienteVip.gridy = 2;
                pnlPedido.add(lblClienteVip, gbc_lblClienteVip);
            }
            {
                rdbtnVip = new JRadioButton(""); //$NON-NLS-1$
                rdbtnVip.setHorizontalTextPosition(SwingConstants.LEFT);
                GridBagConstraints gbc_rdbtnVip = new GridBagConstraints();
                gbc_rdbtnVip.insets = new Insets(0, 0, 5, 5);
                gbc_rdbtnVip.gridx = 2;
                gbc_rdbtnVip.gridy = 2;
                pnlPedido.add(rdbtnVip, gbc_rdbtnVip);
            }
            {
                button = new JButton(""); //$NON-NLS-1$
                button.addActionListener(new ButtonActionListener());
                button.setIcon(
                        new ImageIcon(VentanaGestionPedidos.class.getResource(
                                "/presentacion/iconos/rounded-add-button.png"))); //$NON-NLS-1$
                GridBagConstraints gbc_button = new GridBagConstraints();
                gbc_button.insets = new Insets(0, 0, 5, 5);
                gbc_button.gridx = 3;
                gbc_button.gridy = 2;
                pnlPedido.add(button, gbc_button);
            }
            {
                lblHoraDeRecogida = new JLabel(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.lblHoraDeRecogida.text")); //$NON-NLS-1$
                lblHoraDeRecogida.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
                GridBagConstraints gbc_lblHoraDeRecogida = new GridBagConstraints();
                gbc_lblHoraDeRecogida.anchor = GridBagConstraints.WEST;
                gbc_lblHoraDeRecogida.insets = new Insets(0, 0, 5, 5);
                gbc_lblHoraDeRecogida.gridx = 1;
                gbc_lblHoraDeRecogida.gridy = 3;
                pnlPedido.add(lblHoraDeRecogida, gbc_lblHoraDeRecogida);
            }
            {
                txtHorarecogida = new JTextField();
                txtHorarecogida.addFocusListener(new MiFocusListener());
                GridBagConstraints gbc_txtHorarecogida = new GridBagConstraints();
                gbc_txtHorarecogida.gridwidth = 2;
                gbc_txtHorarecogida.insets = new Insets(0, 0, 5, 5);
                gbc_txtHorarecogida.fill = GridBagConstraints.HORIZONTAL;
                gbc_txtHorarecogida.gridx = 2;
                gbc_txtHorarecogida.gridy = 3;
                pnlPedido.add(txtHorarecogida, gbc_txtHorarecogida);
                txtHorarecogida.setColumns(10);
            }
            {
                lblHoraDeLlegada = new JLabel(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.lblHoraDeLlegada.text")); //$NON-NLS-1$
                lblHoraDeLlegada.setFont(new Font("Segoe UI", Font.PLAIN, 15)); //$NON-NLS-1$
                GridBagConstraints gbc_lblHoraDeLlegada = new GridBagConstraints();
                gbc_lblHoraDeLlegada.anchor = GridBagConstraints.WEST;
                gbc_lblHoraDeLlegada.insets = new Insets(0, 0, 5, 5);
                gbc_lblHoraDeLlegada.gridx = 1;
                gbc_lblHoraDeLlegada.gridy = 4;
                pnlPedido.add(lblHoraDeLlegada, gbc_lblHoraDeLlegada);
            }
            {
                txtHorallegada = new JTextField();
                txtHorallegada.addFocusListener(new MiFocusListener());
                GridBagConstraints gbc_txtHorallegada = new GridBagConstraints();
                gbc_txtHorallegada.insets = new Insets(0, 0, 5, 5);
                gbc_txtHorallegada.gridwidth = 2;
                gbc_txtHorallegada.fill = GridBagConstraints.HORIZONTAL;
                gbc_txtHorallegada.gridx = 2;
                gbc_txtHorallegada.gridy = 4;
                pnlPedido.add(txtHorallegada, gbc_txtHorallegada);
                txtHorallegada.setColumns(10);
            }
        }
        {
            pnlCliente = new pnlDatosCliente();
            GridBagConstraints gbc_pnlCliente = new GridBagConstraints();
            gbc_pnlCliente.insets = new Insets(0, 0, 5, 5);
            gbc_pnlCliente.fill = GridBagConstraints.BOTH;
            gbc_pnlCliente.gridx = 1;
            gbc_pnlCliente.gridy = 0;
            contentPane.add(pnlCliente, gbc_pnlCliente);
        }
        {
            pnlResumen = new JPanel();
            pnlResumen.setBorder(new TitledBorder(null, MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.pnlResumen.borderTitle"), //$NON-NLS-1$
                    TitledBorder.LEADING, TitledBorder.TOP, null, null));
            GridBagConstraints gbc_pnlResumen = new GridBagConstraints();
            gbc_pnlResumen.insets = new Insets(0, 0, 5, 0);
            gbc_pnlResumen.fill = GridBagConstraints.BOTH;
            gbc_pnlResumen.gridx = 2;
            gbc_pnlResumen.gridy = 0;
            contentPane.add(pnlResumen, gbc_pnlResumen);
            GridBagLayout gbl_pnlResumen = new GridBagLayout();
            gbl_pnlResumen.columnWidths = new int[] { 0, 50, 50, 10, 0 };
            gbl_pnlResumen.rowHeights = new int[] { 10, 50, 50, 127, 25, 34, 50,
                    0 };
            gbl_pnlResumen.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0,
                    Double.MIN_VALUE };
            gbl_pnlResumen.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
                    0.0, 0.0, Double.MIN_VALUE };
            pnlResumen.setLayout(gbl_pnlResumen);
            {
                lblAyuda = new JLabel(""); //$NON-NLS-1$
                lblAyuda.setIcon(new ImageIcon(VentanaGestionPedidos.class
                        .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
                lblAyuda.addMouseListener(new LblAyudaMouseListener());
                GridBagConstraints gbc_lblAyuda = new GridBagConstraints();
                gbc_lblAyuda.insets = new Insets(0, 0, 5, 0);
                gbc_lblAyuda.gridx = 3;
                gbc_lblAyuda.gridy = 0;
                pnlResumen.add(lblAyuda, gbc_lblAyuda);
            }
            {
                {
                    scrollPane = new JScrollPane();
                    GridBagConstraints gbc_scrollPane = new GridBagConstraints();
                    gbc_scrollPane.gridheight = 6;
                    gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
                    gbc_scrollPane.fill = GridBagConstraints.BOTH;
                    gbc_scrollPane.gridx = 0;
                    gbc_scrollPane.gridy = 1;
                    pnlResumen.add(scrollPane, gbc_scrollPane);
                    tResumen = new JTable();
                    scrollPane.setViewportView(tResumen);
                    tResumen.setModel(new DefaultTableModel(new Object[][] {
                            { MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.Producto1"), new Double(6.99), new Integer(3), //$NON-NLS-1$
                                    new Double(6.95) },
                            { MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.Producto2"), new Double(1.5), new Integer(2), //$NON-NLS-1$
                                    new Double(3.0) },
                            { MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.Producto3"), new Double(1.4), new Integer(1), //$NON-NLS-1$
                                    new Double(1.4) }, },
                            new String[] { MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ColumnaProducto"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ColumnaPrecio"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ColumnaUds"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ColumnaTotal") }) { //$NON-NLS-1$
                        Class[] columnTypes = new Class[] { String.class,
                                Double.class, Integer.class, Double.class };

                        public Class getColumnClass(int columnIndex) {
                            return columnTypes[columnIndex];
                        }

                        @Override
                        public boolean isCellEditable(int rowIndex,
                                int columnIndex) {
                            return false;
                        }
                    });
                    {
                        btnConfirmar = new JButton(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.btnConfirmar.text")); //$NON-NLS-1$
                        btnConfirmar.addActionListener(
                                new BtnConfirmarActionListener());
                        btnConfirmar.setIcon(new ImageIcon(
                                VentanaGestionPedidos.class.getResource(
                                        "/presentacion/iconos/right-arrow-forward.png"))); //$NON-NLS-1$
                        btnConfirmar.setFont(
                                new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
                        GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
                        gbc_btnConfirmar.fill = GridBagConstraints.BOTH;
                        gbc_btnConfirmar.gridwidth = 2;
                        gbc_btnConfirmar.insets = new Insets(0, 0, 5, 5);
                        gbc_btnConfirmar.gridx = 1;
                        gbc_btnConfirmar.gridy = 1;
                        pnlResumen.add(btnConfirmar, gbc_btnConfirmar);
                    }
                    {
                        btnEliminar = new JButton(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.btnEliminar.text")); //$NON-NLS-1$
                        btnEliminar.addActionListener(
                                new BtnEliminarActionListener());
                        btnEliminar.setIcon(new ImageIcon(
                                VentanaGestionPedidos.class.getResource(
                                        "/presentacion/iconos/rubbish-bin-delete-button.png"))); //$NON-NLS-1$
                        btnEliminar.setFont(
                                new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
                        GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
                        gbc_btnEliminar.fill = GridBagConstraints.BOTH;
                        gbc_btnEliminar.gridwidth = 2;
                        gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
                        gbc_btnEliminar.gridx = 1;
                        gbc_btnEliminar.gridy = 2;
                        pnlResumen.add(btnEliminar, gbc_btnEliminar);
                    }
                    {
                        lblTotal = new JLabel(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.lblTotal.text")); //$NON-NLS-1$
                        GridBagConstraints gbc_lblTotal = new GridBagConstraints();
                        gbc_lblTotal.gridwidth = 2;
                        gbc_lblTotal.insets = new Insets(0, 0, 5, 5);
                        gbc_lblTotal.gridx = 1;
                        gbc_lblTotal.gridy = 4;
                        pnlResumen.add(lblTotal, gbc_lblTotal);
                    }
                    {
                        textField = new JTextField();
                        textField.setHorizontalAlignment(SwingConstants.CENTER);
                        textField.setText("25,37€"); //$NON-NLS-1$
                        textField.setEditable(false);
                        textField.setForeground(Color.RED);
                        textField.setFont(
                                new Font("Segoe UI Semibold", Font.PLAIN, 14)); //$NON-NLS-1$
                        GridBagConstraints gbc_textField = new GridBagConstraints();
                        gbc_textField.gridwidth = 2;
                        gbc_textField.insets = new Insets(0, 0, 5, 5);
                        gbc_textField.fill = GridBagConstraints.BOTH;
                        gbc_textField.gridx = 1;
                        gbc_textField.gridy = 5;
                        pnlResumen.add(textField, gbc_textField);
                        textField.setColumns(10);
                    }
                    {
                        btnTerminar = new JButton(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.btnTerminar.text")); //$NON-NLS-1$
                        btnTerminar.addActionListener(
                                new BtnTerminarActionListener());
                        btnTerminar.setIcon(new ImageIcon(
                                VentanaGestionPedidos.class.getResource(
                                        "/presentacion/iconos/check-symbol.png"))); //$NON-NLS-1$
                        btnTerminar.setFont(
                                new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
                        GridBagConstraints gbc_btnTerminar = new GridBagConstraints();
                        gbc_btnTerminar.insets = new Insets(0, 0, 0, 5);
                        gbc_btnTerminar.fill = GridBagConstraints.BOTH;
                        gbc_btnTerminar.gridwidth = 2;
                        gbc_btnTerminar.gridx = 1;
                        gbc_btnTerminar.gridy = 6;
                        pnlResumen.add(btnTerminar, gbc_btnTerminar);
                    }
                    {
                        pnlProductos = new JPanel();
                        pnlProductos.setBorder(new TitledBorder(null,
                                MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.pnlProductos.borderTitle"), TitledBorder.LEADING, //$NON-NLS-1$
                                TitledBorder.TOP, null, null));
                        GridBagConstraints gbc_pnlProductos = new GridBagConstraints();
                        gbc_pnlProductos.gridwidth = 3;
                        gbc_pnlProductos.insets = new Insets(0, 0, 0, 5);
                        gbc_pnlProductos.fill = GridBagConstraints.BOTH;
                        gbc_pnlProductos.gridx = 0;
                        gbc_pnlProductos.gridy = 1;
                        contentPane.add(pnlProductos, gbc_pnlProductos);
                        GridBagLayout gbl_pnlProductos = new GridBagLayout();
                        gbl_pnlProductos.columnWidths = new int[] { 100, 100,
                                100, 10, 100, 100, 100, 10, 100, 100, 100, 10,
                                0 };
                        gbl_pnlProductos.rowHeights = new int[] { 10, 75, 75,
                                75, 0 };
                        gbl_pnlProductos.columnWeights = new double[] { 0.0,
                                0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                                0.0, 0.0, Double.MIN_VALUE };
                        gbl_pnlProductos.rowWeights = new double[] { 0.0, 0.0,
                                0.0, 0.0, Double.MIN_VALUE };
                        pnlProductos.setLayout(gbl_pnlProductos);
                        {
                            lblComida = new JLabel(""); //$NON-NLS-1$
                            lblComida.addMouseListener(
                                    new LblNewLabelMouseListener());
                            {
                                lblAyuda_1 = new JLabel(""); //$NON-NLS-1$
                                lblAyuda_1.addMouseListener(
                                        new LblAyuda_1MouseListener());
                                lblAyuda_1.setIcon(new ImageIcon(
                                        VentanaGestionPedidos.class.getResource(
                                                "/presentacion/iconos/information.png"))); //$NON-NLS-1$
                                GridBagConstraints gbc_lblAyuda_1 = new GridBagConstraints();
                                gbc_lblAyuda_1.insets = new Insets(0, 0, 5, 0);
                                gbc_lblAyuda_1.gridx = 11;
                                gbc_lblAyuda_1.gridy = 0;
                                pnlProductos.add(lblAyuda_1, gbc_lblAyuda_1);
                            }
                            lblComida.setIcon(new ImageIcon(
                                    VentanaGestionPedidos.class.getResource(
                                            "/presentacion/imagenes/hamburger.png"))); //$NON-NLS-1$
                            GridBagConstraints gbc_lblComida = new GridBagConstraints();
                            gbc_lblComida.insets = new Insets(0, 0, 5, 5);
                            gbc_lblComida.gridx = 0;
                            gbc_lblComida.gridy = 1;
                            pnlProductos.add(lblComida, gbc_lblComida);
                        }
                        {
                            lblBebida = new JLabel(""); //$NON-NLS-1$
                            lblBebida.addMouseListener(
                                    new LblNewLabelMouseListener());
                            lblBebida.setIcon(new ImageIcon(
                                    VentanaGestionPedidos.class.getResource(
                                            "/presentacion/imagenes/soft-drink.png"))); //$NON-NLS-1$
                            GridBagConstraints gbc_lblBebida = new GridBagConstraints();
                            gbc_lblBebida.insets = new Insets(0, 0, 5, 5);
                            gbc_lblBebida.gridx = 4;
                            gbc_lblBebida.gridy = 1;
                            pnlProductos.add(lblBebida, gbc_lblBebida);
                        }
                        {
                            lblPostre = new JLabel(""); //$NON-NLS-1$
                            lblPostre.addMouseListener(
                                    new LblNewLabelMouseListener());
                            lblPostre.setIcon(new ImageIcon(
                                    VentanaGestionPedidos.class.getResource(
                                            "/presentacion/imagenes/ice-cream.png"))); //$NON-NLS-1$
                            GridBagConstraints gbc_lblPostre = new GridBagConstraints();
                            gbc_lblPostre.insets = new Insets(0, 0, 5, 5);
                            gbc_lblPostre.gridx = 8;
                            gbc_lblPostre.gridy = 1;
                            pnlProductos.add(lblPostre, gbc_lblPostre);
                        }
                    }
                    tResumen.getColumnModel().getColumn(3)
                            .setPreferredWidth(96);
                }
            }
        }

    }

    private class BtnTerminarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    private class BtnEliminarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel dtm = (DefaultTableModel) tResumen.getModel();
            if (tResumen.getSelectedRow() > -1) {
                if (JOptionPane.showConfirmDialog(frame,
                        MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.DialogoConfirmacion"), //$NON-NLS-1$
                        MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraCuidado"), JOptionPane.YES_NO_OPTION) == 0) { //$NON-NLS-1$
                    dtm.removeRow(tResumen.getSelectedRow());
                }
            } else {
                JOptionPane.showMessageDialog(frame,
                        MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.DialogoInfo"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraAviso"), //$NON-NLS-1$ //$NON-NLS-2$
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FormularioCliente cliente = new FormularioCliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
        }
    }

    private class LblAyudapedidoMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MensajeAyuda1") //$NON-NLS-1$
                            + MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MensajeAyuda2") //$NON-NLS-1$
                            + MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MensajeAyuda3"), //$NON-NLS-1$
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraAyuda"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }

    private class LblAyudaMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ResumenMensajeAyuda") //$NON-NLS-1$
                            + MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ResumenMensajeAyuda2") //$NON-NLS-1$
                            + MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ResumenMensajeAyuda3") //$NON-NLS-1$
                            + MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ResumenMensajeAyuda4"), //$NON-NLS-1$
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraAyuda"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }

    private class LblNewLabelMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            ((JLabel) e.getComponent()).setText(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MarcaSelected")); //$NON-NLS-1$
        }
    }

    private class LblAyuda_1MouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.ProductosMensajeAyuda"), //$NON-NLS-1$
                    MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraAyuda"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }

    private class BtnConfirmarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (lblBebida.getText().equals(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MarcaSelected")) //$NON-NLS-1$
                    || lblComida.getText().equals(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MarcaSelected")) //$NON-NLS-1$
                    || lblPostre.getText().equals(MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.MarcaSelected"))) { //$NON-NLS-1$
                JOptionPane.showMessageDialog(frame, MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.DialogoAñadido"), //$NON-NLS-1$
                        MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraInformacion"), JOptionPane.WARNING_MESSAGE); //$NON-NLS-1$
            } else {
                JOptionPane.showMessageDialog(frame,
                        MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.DialogoInfo"), MessagesVentanaGestionPedidos.getString("VentanaGestionPedidos.CabeceraAviso"), //$NON-NLS-1$ //$NON-NLS-2$
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
