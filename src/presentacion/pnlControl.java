package presentacion;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;

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

		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		add(btnCerrarSesin);

	}

}
