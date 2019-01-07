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

        lblHelp = new JLabel("");
        lblHelp.addMouseListener(new LblHelpMouseListener());
        lblHelp.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/information.png")));
        GridBagConstraints gbc_lblHelp = new GridBagConstraints();
        gbc_lblHelp.insets = new Insets(0, 0, 5, 0);
        gbc_lblHelp.gridx = 3;
        gbc_lblHelp.gridy = 0;
        add(lblHelp, gbc_lblHelp);

        pnlPromociones = new JPanel();
        pnlPromociones.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlPromociones.setBorder(
                new TitledBorder(UIManager.getBorder("TitledBorder.border"),
                        "Promociones", TitledBorder.LEADING, TitledBorder.TOP,
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

        btnNuevaOferta = new JButton("Nueva oferta");
        btnNuevaOferta.addActionListener(new BtnNuevaOfertaActionListener());
        btnNuevaOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/rounded-add-button.png")));
        btnNuevaOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnNuevaOferta = new GridBagConstraints();
        gbc_btnNuevaOferta.fill = GridBagConstraints.BOTH;
        gbc_btnNuevaOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnNuevaOferta.gridx = 2;
        gbc_btnNuevaOferta.gridy = 1;
        add(btnNuevaOferta, gbc_btnNuevaOferta);

        btnEditarOferta = new JButton("Editar oferta");
        btnEditarOferta.addActionListener(new BtnEditarOfertaActionListener());
        btnEditarOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/edit24.png")));
        btnEditarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
        gbc_btnEditarOferta.fill = GridBagConstraints.BOTH;
        gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnEditarOferta.gridx = 2;
        gbc_btnEditarOferta.gridy = 2;
        add(btnEditarOferta, gbc_btnEditarOferta);

        pnlOfertas = new JPanel();
        pnlOfertas.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlOfertas.setBorder(new TitledBorder(null, "Ofertas",
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

        btnBorrarOferta = new JButton("Borrar oferta");
        btnBorrarOferta.addActionListener(new BtnBorrarPromoActionListener());
        btnBorrarOferta.setIcon(new ImageIcon(PestañaOfertas.class.getResource(
                "/presentacion/iconos/rubbish-bin-delete-button.png")));
        btnBorrarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
        gbc_btnBorrarOferta.fill = GridBagConstraints.BOTH;
        gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 5);
        gbc_btnBorrarOferta.gridx = 2;
        gbc_btnBorrarOferta.gridy = 10;
        add(btnBorrarOferta, gbc_btnBorrarOferta);

        pnlInfo = new JPanel();
        pnlInfo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlInfo.setBorder(new TitledBorder(null, "Informaci\u00F3n",
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
        taInfo.setFont(new Font("Segoe UI", Font.BOLD, 13));
        taInfo.setEditable(false);
        taInfo.setText(
                "Oferta v\u00E1lida hasta el 31 de diciembre de 2018...");
        taInfo.setEnabled(false);
        pnlInfo.add(taInfo);

        pnlClientes = new JPanel();
        pnlClientes.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        pnlClientes.setBorder(new TitledBorder(null, "Clientes",
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
            String[] values = new String[] { "sergio.herrera2@alu.uclm.es",
                    "manolofergn@gmail.com" };

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

        btnSeleccionar = new JButton("Seleccionar");
        btnSeleccionar.addActionListener(new BtnSeleccionarActionListener());
        btnSeleccionar.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/select-all.png")));
        btnSeleccionar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
        GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
        gbc_btnSeleccionar.fill = GridBagConstraints.BOTH;
        gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 5);
        gbc_btnSeleccionar.gridx = 2;
        gbc_btnSeleccionar.gridy = 13;
        add(btnSeleccionar, gbc_btnSeleccionar);

        btnEnviarOferta = new JButton("Enviar oferta");
        btnEnviarOferta.addActionListener(new BtnEnviarOfertaActionListener());
        btnEnviarOferta.setIcon(new ImageIcon(PestañaOfertas.class
                .getResource("/presentacion/iconos/send-button.png")));
        btnEnviarOferta.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
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
                    "Este módulo no ha sido implementado. "
                            + "En una versión final, este botón añadiría un panel con una oferta o promoción en una de las listas.",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class BtnBorrarPromoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (pnlPromo1.getBackground().equals(new Color(250, 250, 150))) {
                if (JOptionPane.showConfirmDialog(new JPanel(),
                        "¿Estás seguro de que quieres borrar la promoción?",
                        "Cuidado", JOptionPane.YES_NO_OPTION) == 0) {
                    pnlPromo1.setBackground(new Color(250, 250, 250));
                    pnlPromo1.setVisible(false);
                }
            } else if (pnlOferta1.getBackground()
                    .equals(new Color(250, 250, 150))) {
                if (JOptionPane.showConfirmDialog(new JPanel(),
                        "¿Estás seguro de que quieres borrar la promoción?",
                        "Cuidado", JOptionPane.YES_NO_OPTION) == 0) {
                    pnlOferta1.setBackground(new Color(250, 250, 250));
                    pnlOferta1.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(new JPanel(),
                        "Primero tienes que seleccionar una promoción.",
                        "Cuidado", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    private class BtnEditarOfertaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    "Este módulo no ha sido implementado. "
                            + "En una versión final, este botón editaría una oferta o promoción seleccionada (con fondo amarillo).",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class BtnSeleccionarActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    "Este módulo no ha sido implementado. "
                            + "En una versión final, este botón permitiría la selección múltiple de los e-mails a la izquierda.",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class BtnEnviarOfertaActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(new JPanel(),
                    "Vas a enviar las ofertas seleccionadas los e-mails marcados. ¿Enviar?",
                    "Cuidado", JOptionPane.YES_NO_OPTION) == 0) {
                JOptionPane.showMessageDialog(new JPanel(),
                        "¡Oferta/s enviada/s!.", "Información",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class LblHelpMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(new JPanel(),
                    "Esta es la pestaña ofertas y promociones, en la que tenemos la posibilidad de añadir ofertas, editarlas y eliminarlas.\n"
                            + "El panel información nos mostrará la información relacionada con la oferta o promoción seleccionada.\n"
                            + "Adicionalmente, podemos enviar mediante la selección de e-mails, las ofertas o promociones a los clientes VIP (que son los únicos que aparecerán aquí) que queramos.",
                    "Ayuda", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
