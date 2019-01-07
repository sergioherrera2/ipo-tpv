package presentacion.paneles;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pnlControl extends JPanel {
    private JButton btnCerrarSesin;

    /**
     * Create the panel.
     */
    public pnlControl() {
        setBorder(new TitledBorder(null, "Control", TitledBorder.LEADING, //$NON-NLS-1$
                TitledBorder.TOP, null, null));
        setLayout(new GridLayout(0, 1, 0, 0));

        btnCerrarSesin = new JButton(MessagesPnlControl.getString("pnlControl.btnCerrarSesin.text")); //$NON-NLS-1$
        btnCerrarSesin.addActionListener(new BtnCerrarSesinActionListener());
        btnCerrarSesin.setIcon(new ImageIcon(pnlControl.class
                .getResource("/presentacion/iconos/exit-to-app-button.png"))); //$NON-NLS-1$
        btnCerrarSesin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15)); //$NON-NLS-1$
        add(btnCerrarSesin);

    }

    private class BtnCerrarSesinActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(null,
                    MessagesPnlControl.getString("pnlControl.DialogoConfirmacion"), MessagesPnlControl.getString("pnlControl.DialogoAviso"), //$NON-NLS-1$ //$NON-NLS-2$
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE) == 0) {
                System.exit(0);
            }
        }
    }
}
