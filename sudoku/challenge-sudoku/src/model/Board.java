package model;

import java.util.Collection;
import java.util.List;
import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;

public class Board {

    private final List<List<Space>> spaces;

    public Board (final  List<List<Space>> spaces) {
         this.spaces = spaces;
    }
    
    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatus getStatus() {
        if(spaces.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))) {
            return GameStatus.NOT_STARTED;     
        }

        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getActual())) ? GameStatus.INCOMPLETE : GameStatus.COMPLETE;
    }

    public boolean hasErrors() {

        if(getStatus() == GameStatus.NOT_STARTED) {
            return false;
        }

        spaces.stream().flatMap(Collection::stream).anyMatch(s -> nonNull(s.getActual()) && !s.getActual().equals(s.getExpected()));
        return true;
    }

    public boolean changeValue(final int col, final int row, final Integer value ) {
        var space = this.spaces.get(col).get(row);
        if(space.isFixed()) {
            return false;
        } else {
            space.setActual(value);
            return true;
        }
    }

    public boolean clearValue(final int col, final int row) {
        var space = this.spaces.get(col).get(row);
        if(space.isFixed()) {
            return false;
        } else {
            space.clearSpace();
            return true;
        }
    }

    public void reset() {
        this.spaces.forEach(t -> t.forEach(Space::clearSpace));
    }

    public boolean gameFinish() {
        return !hasErrors() && getStatus().equals(GameStatus.COMPLETE);
    }

}
