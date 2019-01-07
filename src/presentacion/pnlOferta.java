package presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pnlOferta extends JPanel {
    private JLabel lblProducto;
    private JLabel lblDesc;

    /**
     * Create the panel.
     */
    public pnlOferta() {
        addMouseListener(new ThisMouseListener());
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 50, 0 };
        gridBagLayout.rowHeights = new int[] { 100, 30, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);
        {
            lblProducto = new JLabel("");
            lblProducto.setIcon(new ImageIcon(pnlOferta.class
                    .getResource("/presentacion/imagenes/soft-drink.png")));
            GridBagConstraints gbc_lblProducto = new GridBagConstraints();
            gbc_lblProducto.insets = new Insets(0, 0, 5, 0);
            gbc_lblProducto.gridx = 0;
            gbc_lblProducto.gridy = 0;
            add(lblProducto, gbc_lblProducto);
        }
        {
            lblDesc = new JLabel("¡(x) por 1,30€!");
            GridBagConstraints gbc_lblDesc = new GridBagConstraints();
            gbc_lblDesc.gridx = 0;
            gbc_lblDesc.gridy = 1;
            add(lblDesc, gbc_lblDesc);
        }

    }

    private class ThisMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            e.getComponent().setBackground(new Color(250, 250, 150));
        }
    }
}
