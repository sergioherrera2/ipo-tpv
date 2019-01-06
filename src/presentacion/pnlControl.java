package presentacion;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

public class pnlControl extends JPanel {
	private JButton btnCerrarSesin;

	/**
	 * Create the panel.
	 */
	public pnlControl() {
		setBorder(new TitledBorder(null, "Control", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 1, 0, 0));

		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.setIcon(new ImageIcon(pnlControl.class.getResource("/presentacion/iconos/exit-to-app-button.png")));
		btnCerrarSesin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnCerrarSesin);

	}

}
