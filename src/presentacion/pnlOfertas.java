package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class pnlOfertas extends JPanel {
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

	/**
	 * Create the panel.
	 */
	public pnlOfertas() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{771, 507, 100, 0};
		gridBagLayout.rowHeights = new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnlPromociones = new JPanel();
		pnlPromociones.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Promociones", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_pnlPromociones = new GridBagConstraints();
		gbc_pnlPromociones.gridheight = 5;
		gbc_pnlPromociones.gridwidth = 2;
		gbc_pnlPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_pnlPromociones.fill = GridBagConstraints.BOTH;
		gbc_pnlPromociones.gridx = 0;
		gbc_pnlPromociones.gridy = 0;
		add(pnlPromociones, gbc_pnlPromociones);
		GridBagLayout gbl_pnlPromociones = new GridBagLayout();
		gbl_pnlPromociones.columnWidths = new int[]{1156, 0};
		gbl_pnlPromociones.rowHeights = new int[]{220, 0};
		gbl_pnlPromociones.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlPromociones.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlPromociones.setLayout(gbl_pnlPromociones);
		
		spPromociones = new JScrollPane();
		GridBagConstraints gbc_spPromociones = new GridBagConstraints();
		gbc_spPromociones.fill = GridBagConstraints.BOTH;
		gbc_spPromociones.gridx = 0;
		gbc_spPromociones.gridy = 0;
		pnlPromociones.add(spPromociones, gbc_spPromociones);
		
		btnNuevaOferta = new JButton("Nueva oferta");
		GridBagConstraints gbc_btnNuevaOferta = new GridBagConstraints();
		gbc_btnNuevaOferta.fill = GridBagConstraints.BOTH;
		gbc_btnNuevaOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnNuevaOferta.gridx = 2;
		gbc_btnNuevaOferta.gridy = 0;
		add(btnNuevaOferta, gbc_btnNuevaOferta);
		
		btnEditarOferta = new JButton("Editar oferta");
		GridBagConstraints gbc_btnEditarOferta = new GridBagConstraints();
		gbc_btnEditarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnEditarOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnEditarOferta.gridx = 2;
		gbc_btnEditarOferta.gridy = 1;
		add(btnEditarOferta, gbc_btnEditarOferta);
		
		pnlOfertas = new JPanel();
		pnlOfertas.setBorder(new TitledBorder(null, "Ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlOfertas = new GridBagConstraints();
		gbc_pnlOfertas.gridheight = 5;
		gbc_pnlOfertas.gridwidth = 2;
		gbc_pnlOfertas.insets = new Insets(0, 0, 5, 5);
		gbc_pnlOfertas.fill = GridBagConstraints.BOTH;
		gbc_pnlOfertas.gridx = 0;
		gbc_pnlOfertas.gridy = 5;
		add(pnlOfertas, gbc_pnlOfertas);
		GridBagLayout gbl_pnlOfertas = new GridBagLayout();
		gbl_pnlOfertas.columnWidths = new int[]{583, 0};
		gbl_pnlOfertas.rowHeights = new int[]{2, 0};
		gbl_pnlOfertas.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pnlOfertas.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pnlOfertas.setLayout(gbl_pnlOfertas);
		
		spOfertas = new JScrollPane();
		GridBagConstraints gbc_spOfertas = new GridBagConstraints();
		gbc_spOfertas.fill = GridBagConstraints.BOTH;
		gbc_spOfertas.gridx = 0;
		gbc_spOfertas.gridy = 0;
		pnlOfertas.add(spOfertas, gbc_spOfertas);
		
		btnBorrarOferta = new JButton("Borrar oferta");
		GridBagConstraints gbc_btnBorrarOferta = new GridBagConstraints();
		gbc_btnBorrarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarOferta.insets = new Insets(0, 0, 5, 0);
		gbc_btnBorrarOferta.gridx = 2;
		gbc_btnBorrarOferta.gridy = 9;
		add(btnBorrarOferta, gbc_btnBorrarOferta);
		
		pnlInfo = new JPanel();
		pnlInfo.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlInfo = new GridBagConstraints();
		gbc_pnlInfo.gridheight = 4;
		gbc_pnlInfo.insets = new Insets(0, 0, 0, 5);
		gbc_pnlInfo.fill = GridBagConstraints.BOTH;
		gbc_pnlInfo.gridx = 0;
		gbc_pnlInfo.gridy = 10;
		add(pnlInfo, gbc_pnlInfo);
		pnlInfo.setLayout(new GridLayout(0, 1, 0, 0));
		
		taInfo = new JTextArea();
		taInfo.setFont(new Font("Segoe UI", Font.BOLD, 13));
		taInfo.setEditable(false);
		taInfo.setText("Oferta v\u00E1lida hasta el 31 de diciembre de 2018...");
		taInfo.setEnabled(false);
		pnlInfo.add(taInfo);
		
		pnlClientes = new JPanel();
		pnlClientes.setBorder(new TitledBorder(null, "Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlClientes = new GridBagConstraints();
		gbc_pnlClientes.gridheight = 4;
		gbc_pnlClientes.insets = new Insets(0, 0, 0, 5);
		gbc_pnlClientes.fill = GridBagConstraints.BOTH;
		gbc_pnlClientes.gridx = 1;
		gbc_pnlClientes.gridy = 10;
		add(pnlClientes, gbc_pnlClientes);
		pnlClientes.setLayout(new GridLayout(1, 0, 0, 0));
		
		spClientes = new JScrollPane();
		pnlClientes.add(spClientes);
		
		lsClientes = new JList();
		lsClientes.setModel(new AbstractListModel() {
			String[] values = new String[] {"sergio.herrera2@alu.uclm.es", "manolofergn@gmail.com"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spClientes.setViewportView(lsClientes);
		
		btnSeleccionar = new JButton("Seleccionar");
		GridBagConstraints gbc_btnSeleccionar = new GridBagConstraints();
		gbc_btnSeleccionar.fill = GridBagConstraints.BOTH;
		gbc_btnSeleccionar.insets = new Insets(0, 0, 5, 0);
		gbc_btnSeleccionar.gridx = 2;
		gbc_btnSeleccionar.gridy = 12;
		add(btnSeleccionar, gbc_btnSeleccionar);
		
		btnEnviarOferta = new JButton("Enviar oferta");
		GridBagConstraints gbc_btnEnviarOferta = new GridBagConstraints();
		gbc_btnEnviarOferta.fill = GridBagConstraints.BOTH;
		gbc_btnEnviarOferta.gridx = 2;
		gbc_btnEnviarOferta.gridy = 13;
		add(btnEnviarOferta, gbc_btnEnviarOferta);

	}
}
