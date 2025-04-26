import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ui.screen.MainScreen;

public class Main {

    public static void main(String[] args) {
        try {
       
            Path path = Paths.get("sudoku/challenge-sudoku/src/argInitial.txt");
            String content = Files.readString(path); 
         
            final var gameConfig = Stream.of(content.split(" "))
                .collect(Collectors.toMap(
                    k -> k.split(";")[0],   
                    v -> v.split(";")[1]   
                ));

        
            var mainScreen = new MainScreen(gameConfig);
            mainScreen.buildMainScreen();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
