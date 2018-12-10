package presentacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import java.awt.Insets;

public class pnlCallejero extends JPanel {
	private JPanel pnlCallejero;

	/**
	 * Create the panel.
	 */
	public pnlCallejero() {
		setBounds(new Rectangle(0, 0, 1280, 720));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 381, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		pnlCallejero = new JPanel();
		pnlCallejero.setBorder(new TitledBorder(null, "Callejero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlCallejero = new GridBagConstraints();
		gbc_pnlCallejero.insets = new Insets(0, 0, 0, 5);
		gbc_pnlCallejero.fill = GridBagConstraints.BOTH;
		gbc_pnlCallejero.gridx = 0;
		gbc_pnlCallejero.gridy = 0;
		add(pnlCallejero, gbc_pnlCallejero);

	}

}
