package ui.input;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Dimension;
import java.awt.Font;


import model.Space;
import service.EventEnum;
import service.EventListener;

public class NumberText extends JTextField implements EventListener {

    private final Space space;

    public NumberText(final Space space) {
        this.space = space;
        var dimension = new Dimension(50,50);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setVisible(true);
        this.setFont(new Font("Arial",Font.PLAIN,20));
        this.setHorizontalAlignment(CENTER);
        this.setDocument(new NumberTextLimit());
        this.setEnabled(!space.isFixed());
        if(this.space.isFixed()) {
            this.setText(space.getActual().toString());
        }
        this.getDocument().addDocumentListener(new DocumentListener() {

            private void changeSpace() {
                if(getText().isEmpty()) {
                    space.clearSpace();
                } else {
                    space.setActual(Integer.parseInt(getText()));
                }
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'insertUpdate'");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'removeUpdate'");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'changedUpdate'");
            }
            
        });
    }

    @Override
    public void update(EventEnum eventType) {
        if(eventType.equals(EventEnum.CLEAR_SPACE) && (this.isEnabled())) {
            this.setText("");
        }
    }
}
