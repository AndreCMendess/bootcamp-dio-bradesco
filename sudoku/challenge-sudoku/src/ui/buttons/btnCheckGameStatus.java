package ui.buttons;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class btnCheckGameStatus  extends JButton {
    
    public btnCheckGameStatus(final ActionListener actionListener) {
        this.setText("Verificar Jogo");
        this.addActionListener(actionListener);
    }
}
