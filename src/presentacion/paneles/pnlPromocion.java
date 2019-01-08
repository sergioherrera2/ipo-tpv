package presentacion.paneles;

import javax.swing.JPanel;

import presentacion.messages.MessagesPnlPromocion;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class pnlPromocion extends JPanel {
    private JLabel lblComida;
    private JLabel lblBebida;
    private JLabel lblDesc;

    /**
     * Create the panel.
     */
    public pnlPromocion() {
        addMouseListener(new ThisMouseListener());
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] { 100, 10, 100, 0 };
        gridBagLayout.rowHeights = new int[] { 100, 30, 0 };
        gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
        setLayout(gridBagLayout);
        {
            lblComida = new JLabel("");
            lblComida.setIcon(new ImageIcon(pnlPromocion.class
                    .getResource("/presentacion/imagenes/pizza (1).png")));
            GridBagConstraints gbc_lblComida = new GridBagConstraints();
            gbc_lblComida.insets = new Insets(0, 0, 5, 5);
            gbc_lblComida.gridx = 0;
            gbc_lblComida.gridy = 0;
            add(lblComida, gbc_lblComida);
        }
        {
            lblBebida = new JLabel("");
            lblBebida.setIcon(new ImageIcon(pnlPromocion.class
                    .getResource("/presentacion/imagenes/soft-drink.png")));
            GridBagConstraints gbc_lblBebida = new GridBagConstraints();
            gbc_lblBebida.insets = new Insets(0, 0, 5, 0);
            gbc_lblBebida.gridx = 2;
            gbc_lblBebida.gridy = 0;
            add(lblBebida, gbc_lblBebida);
        }
        {
            lblDesc = new JLabel(MessagesPnlPromocion.getString("pnlPromocion.lblDesc.text")); //$NON-NLS-1$
            lblDesc.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            GridBagConstraints gbc_lblDesc = new GridBagConstraints();
            gbc_lblDesc.gridwidth = 3;
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
