package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;

public class pnlOfertas extends JPanel {
	private JPanel pnlCentral;
	private JPanel pnlBotones;
	private JPanel pnlPromociones;
	private JPanel pnlOfertas;
	private JPanel pnlInfo;
	private JPanel pnlClientes;
	private JButton btnNuevaOferta;
	private JButton btnEditarOferta;
	private JButton btnBorrarOferta;
	private JButton btnSeleccionar;
	private JButton btnEnviar;
	private JLabel lblOfertaVlidaHasta;

	/**
	 * Create the panel.
	 */
	public pnlOfertas() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		setLayout(null);
		
		pnlCentral = new JPanel();
		pnlCentral.setBounds(0, 0, 1126, 720);
		add(pnlCentral);
		pnlCentral.setLayout(null);
		
		pnlPromociones = new JPanel();
		pnlPromociones.setBorder(new TitledBorder(null, "Promociones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlPromociones.setBounds(12, 13, 1114, 250);
		pnlCentral.add(pnlPromociones);
		
		pnlOfertas = new JPanel();
		pnlOfertas.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlOfertas.setBounds(12, 276, 1114, 297);
		pnlCentral.add(pnlOfertas);
		
		pnlInfo = new JPanel();
		pnlInfo.setBorder(new TitledBorder(null, "Informaci\u00F3n sobre ofertas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlInfo.setBounds(12, 586, 550, 121);
		pnlCentral.add(pnlInfo);
		
		lblOfertaVlidaHasta = new JLabel("Oferta v\u00E1lida hasta...");
		pnlInfo.add(lblOfertaVlidaHasta);
		
		pnlClientes = new JPanel();
		pnlClientes.setBorder(new TitledBorder(null, "Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlClientes.setBounds(574, 586, 552, 121);
		pnlCentral.add(pnlClientes);
		
		pnlBotones = new JPanel();
		pnlBotones.setBounds(1124, 0, 156, 720);
		add(pnlBotones);
		pnlBotones.setLayout(null);
		
		btnNuevaOferta = new JButton("Nueva oferta");
		btnNuevaOferta.setBounds(12, 19, 132, 50);
		pnlBotones.add(btnNuevaOferta);
		
		btnEditarOferta = new JButton("Editar oferta");
		btnEditarOferta.setBounds(12, 82, 132, 50);
		pnlBotones.add(btnEditarOferta);
		
		btnBorrarOferta = new JButton("Borrar oferta");
		btnBorrarOferta.setBounds(12, 521, 132, 50);
		pnlBotones.add(btnBorrarOferta);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.setBounds(12, 592, 132, 50);
		pnlBotones.add(btnSeleccionar);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(12, 655, 132, 50);
		pnlBotones.add(btnEnviar);

	}
}
