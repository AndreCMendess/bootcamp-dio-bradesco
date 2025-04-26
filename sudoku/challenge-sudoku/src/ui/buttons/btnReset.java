package ui.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class btnReset extends JButton{

    public btnReset(final ActionListener actionListener) {
        this.setText("Reiniciar Jogo");
        this.addActionListener(actionListener);
    }

}
