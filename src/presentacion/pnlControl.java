package presentacion;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.GridLayout;

public class pnlControl extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCerrarSesin;

	/**
	 * Create the panel.
	 */
	public pnlControl() {
		setBorder(new TitledBorder(null, "Control", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 1, 0, 0));

		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		add(btnCerrarSesin);

	}

}