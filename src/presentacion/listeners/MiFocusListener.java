package presentacion.listeners;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MiFocusListener extends FocusAdapter {
    @Override
    public void focusGained(FocusEvent e) {
        e.getComponent().setBackground(new Color(250, 250, 150));
    }

    @Override
    public void focusLost(FocusEvent e) {
        e.getComponent().setBackground(new Color(250, 250, 250));
    }
}
