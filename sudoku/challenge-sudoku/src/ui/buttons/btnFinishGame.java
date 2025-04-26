package ui.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class btnFinishGame extends JButton {

    public btnFinishGame(final ActionListener actionListener) {
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }

}
