package ui.screen;

import model.Space;
import service.BoardService;
import service.EventEnum;
import service.NotificationService;
import ui.buttons.btnCheckGameStatus;
import ui.buttons.btnFinishGame;
import ui.buttons.btnReset;
import ui.frame.MainFrame;
import ui.input.NumberText;
import ui.panel.MainPanel;
import ui.panel.SudokuSector;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainScreen {

    private final static Dimension dimension = new Dimension(600,600);
    private final BoardService boardService;
    private final NotificationService notificationService;

    private JButton finishGameButton;
    private JButton checkGameStatusButton;
    private JButton resetButton;

    public MainScreen(final Map<String,String> gameConfig) {
        this.boardService = new BoardService(gameConfig);
        this.notificationService = new NotificationService();
    }

    public void buildMainScreen() {
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension,mainPanel);
        for(int r = 0; r < 9; r +=3) {
            var endrow = r + 2;
            for(int c = 0 ; c < 9 ; c +=3) {
                var endCol = c + 2;
                var spaces = getSpacesFromSector(boardService.getSpaces(),c,endCol,r,endrow);
                JPanel sector = generateSection(spaces);
                mainPanel.add(sector);
            }
        }
        addResetButton(mainPanel);
        addShowGameStatusButton(mainPanel);
        addFinishGameButton(mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }

    private List<Space> getSpacesFromSector(List<List<Space>> spaces, final int initColl, final int endCol , final int endRow,final int initRow) {
        List<Space> spaceSector = new ArrayList<>();
        for(int r = initRow; r <= endRow; r++) {
            for(int c = initColl; c <= endCol; c++) {
                spaceSector.add(spaces.get(c).get(r));
            }
        }
        return spaceSector;
    }


    private JPanel generateSection(final List<Space> spaces) {
        List<NumberText> fieds = new ArrayList<>(spaces.stream().map(NumberText::new).toList());
        fieds.forEach(t -> notificationService.subscriber(EventEnum.CLEAR_SPACE,t));
        return new SudokuSector(fieds);
    }

    private void addFinishGameButton(final JPanel mainPanel) {
        finishGameButton = new btnFinishGame(e -> {
            if(boardService.gameIsFinished()) {
                JOptionPane.showMessageDialog(null,"Parabens por concluir o jogo");
                resetButton.setEnabled(false);
                checkGameStatusButton.setEnabled(false);
                finishGameButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Seu jogo tem algum erro , tente novamente");
            }
        });
        mainPanel.add(finishGameButton);
    }

    private void addResetButton(final JPanel mainPanel) {
        resetButton = new btnReset(e -> {
            var dialogResult = JOptionPane.showConfirmDialog(
               null , 
                "Deseja realmente reiniciar o jogo ?",
                 "Limpar o jogo", 
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE);

                 if(dialogResult == 0) {
                    boardService.reset();
                    notificationService.notify(EventEnum.CLEAR_SPACE);
                 }  
        });   
        mainPanel.add(resetButton);
    }

    private void addShowGameStatusButton(final JPanel mainPanel) {
        checkGameStatusButton = new btnCheckGameStatus(e -> {
            var hasErros = boardService.hasErrors();
            var gameStatus = boardService.getStatus();
            var msg = switch(gameStatus) {
                case NOT_STARTED -> "O jogo não foi iniciado";
                case INCOMPLETE -> "O jogo não esta completo";
                case COMPLETE -> "O esta completo";
            };
            msg += hasErros ? " e contem erros" : " e não contem erros";
            JOptionPane.showMessageDialog(null,msg);
        });
        mainPanel.add(checkGameStatusButton);
    }
}
