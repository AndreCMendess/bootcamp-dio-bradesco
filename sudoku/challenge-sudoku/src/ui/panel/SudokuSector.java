package ui.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ui.input.NumberText;

public class SudokuSector extends JPanel{

    public SudokuSector(final List<NumberText> textField) {
        var dimension = new Dimension(170,178);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(Color.black,2,true));
        this.setVisible(true);
        textField.forEach(this::add);
    }

}
