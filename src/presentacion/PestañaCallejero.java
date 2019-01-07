package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PestañaCallejero extends JPanel {
    private JPanel pnlCallejero;
    private JLabel lblMapa;
    private JLabel lblPrximosDestinos;
    private JScrollPane spListas;
    private JList lstHoras;
    private JList lstDirecciones;
    private JLabel lblInfoDelPedido;
    private JRadioButton rdbtnPagado;
    private JRadioButton rdbtnCaliente;
    private JRadioButton rdbtnVip;
    private JLabel lblHelp;

    /**
     * Create the panel.
     */
    public PestañaCallejero() {
        setBounds(new Rectangle(0, 0, 1280, 720));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 1028, 121, 131, 0 };
        gridBagLayout.rowHeights = new int[] { 0, 42, 47, 194, 0, 0, 0, 0, 0 };
        gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0 };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
                0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);

        lblHelp = new JLabel(""); //$NON-NLS-1$
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setIcon(new ImageIcon(PestañaCallejero.class
                .getResource("/presentacion/iconos/information.png"))); //$NON-NLS-1$
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 3;
        gbc_lblHelp.gridy = 0;
        add(lblHelp, gbc_lblHelp);

        pnlCallejero = new JPanel();
        pnlCallejero.setBorder(new TitledBorder(null, MessagesPestanaCallejero.getString("PestañaCallejero.pnlCallejero.borderTitle"), //$NON-NLS-1$
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        GridBagConstraints gbc_pnlCallejero = new GridBagConstraints();
        gbc_pnlCallejero.gridheight = 7;
        gbc_pnlCallejero.insets = new Insets(0, 0, 0, 5);
        gbc_pnlCallejero.fill = GridBagConstraints.BOTH;
        gbc_pnlCallejero.gridx = 0;
        gbc_pnlCallejero.gridy = 1;
        add(pnlCallejero, gbc_pnlCallejero);
        GridBagLayout gbl_pnlCallejero = new GridBagLayout();
        gbl_pnlCallejero.columnWidths = new int[] { 0, 0 };
        gbl_pnlCallejero.rowHeights = new int[] { 0, 0 };
        gbl_pnlCallejero.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
        gbl_pnlCallejero.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
        pnlCallejero.setLayout(gbl_pnlCallejero);

        lblMapa = new JLabel(""); //$NON-NLS-1$
        lblMapa.setIcon(new ImageIcon(PestañaCallejero.class
                .getResource("/presentacion/imagenes/mapa03.jpg"))); //$NON-NLS-1$
        GridBagConstraints gbc_lblMapa = new GridBagConstraints();
        gbc_lblMapa.fill = GridBagConstraints.BOTH;
        gbc_lblMapa.gridx = 0;
        gbc_lblMapa.gridy = 0;
        pnlCallejero.add(lblMapa, gbc_lblMapa);

        lblPrximosDestinos = new JLabel(MessagesPestanaCallejero.getString("PestañaCallejero.lblPrximosDestinos.text")); //$NON-NLS-1$
        lblPrximosDestinos
                .setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_lblPrximosDestinos = new GridBagConstraints();
        gbc_lblPrximosDestinos.gridwidth = 2;
        gbc_lblPrximosDestinos.insets = new Insets(0, 0, 5, 5);
        gbc_lblPrximosDestinos.gridx = 1;
        gbc_lblPrximosDestinos.gridy = 1;
        add(lblPrximosDestinos, gbc_lblPrximosDestinos);

        spListas = new JScrollPane();
        GridBagConstraints gbc_spListas = new GridBagConstraints();
        gbc_spListas.gridheight = 2;
        gbc_spListas.insets = new Insets(0, 0, 5, 5);
        gbc_spListas.gridwidth = 2;
        gbc_spListas.fill = GridBagConstraints.BOTH;
        gbc_spListas.gridx = 1;
        gbc_spListas.gridy = 2;
        add(spListas, gbc_spListas);

        lstHoras = new JList();
        lstHoras.setFont(new Font("Segoe UI", Font.BOLD, 13)); //$NON-NLS-1$
        lstHoras.setModel(new AbstractListModel() {
            String[] values = new String[] { "20:48", "21:03" }; //$NON-NLS-1$ //$NON-NLS-2$

            @Override
            public int getSize() {
                return values.length;
            }

            @Override
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        spListas.setRowHeaderView(lstHoras);

        lstDirecciones = new JList();
        lstDirecciones.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        lstDirecciones.setModel(new AbstractListModel() {
            String[] values = new String[] { "Calle Calatrava, 48", //$NON-NLS-1$
                    "Calle Toledo, 5" }; //$NON-NLS-1$

            @Override
            public int getSize() {
                return values.length;
            }

            @Override
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        spListas.setViewportView(lstDirecciones);

        lblInfoDelPedido = new JLabel(MessagesPestanaCallejero.getString("PestañaCallejero.lblInfoDelPedido.text")); //$NON-NLS-1$
        lblInfoDelPedido.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        GridBagConstraints gbc_lblInfoDelPedido = new GridBagConstraints();
        gbc_lblInfoDelPedido.fill = GridBagConstraints.VERTICAL;
        gbc_lblInfoDelPedido.gridwidth = 2;
        gbc_lblInfoDelPedido.insets = new Insets(0, 0, 5, 5);
        gbc_lblInfoDelPedido.gridx = 1;
        gbc_lblInfoDelPedido.gridy = 4;
        add(lblInfoDelPedido, gbc_lblInfoDelPedido);

        rdbtnPagado = new JRadioButton(MessagesPestanaCallejero.getString("PestañaCallejero.rdbtnPagado.text")); //$NON-NLS-1$
        rdbtnPagado.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        GridBagConstraints gbc_rdbtnPagado = new GridBagConstraints();
        gbc_rdbtnPagado.fill = GridBagConstraints.BOTH;
        gbc_rdbtnPagado.gridwidth = 2;
        gbc_rdbtnPagado.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnPagado.gridx = 1;
        gbc_rdbtnPagado.gridy = 5;
        add(rdbtnPagado, gbc_rdbtnPagado);

        rdbtnCaliente = new JRadioButton(MessagesPestanaCallejero.getString("PestañaCallejero.rdbtnCaliente.text")); //$NON-NLS-1$
        rdbtnCaliente.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        GridBagConstraints gbc_rdbtnCaliente = new GridBagConstraints();
        gbc_rdbtnCaliente.fill = GridBagConstraints.BOTH;
        gbc_rdbtnCaliente.gridwidth = 2;
        gbc_rdbtnCaliente.insets = new Insets(0, 0, 5, 5);
        gbc_rdbtnCaliente.gridx = 1;
        gbc_rdbtnCaliente.gridy = 6;
        add(rdbtnCaliente, gbc_rdbtnCaliente);

        rdbtnVip = new JRadioButton("VIP"); //$NON-NLS-1$
        rdbtnVip.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
        GridBagConstraints gbc_rdbtnVip = new GridBagConstraints();
        gbc_rdbtnVip.insets = new Insets(0, 0, 0, 5);
        gbc_rdbtnVip.fill = GridBagConstraints.BOTH;
        gbc_rdbtnVip.gridwidth = 2;
        gbc_rdbtnVip.gridx = 1;
        gbc_rdbtnVip.gridy = 7;
        add(rdbtnVip, gbc_rdbtnVip);

    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    MessagesPestanaCallejero.getString("PestañaCallejero.MensajeAyuda") //$NON-NLS-1$
                            + MessagesPestanaCallejero.getString("PestañaCallejero.MensajeAyuda2"), //$NON-NLS-1$
                    MessagesPestanaCallejero.getString("PestañaCallejero.CabeceraAyuda"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$
        }
    }
}
