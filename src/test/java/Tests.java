import com.tictactoe.Board;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    void boardGenerating3x3() {
        Board board = new Board();
        board.setBoard3x3();

        assertEquals(board.getBoard().length,3);
    }
    @Test
    void boardGenerating10x10() {
        Board board = new Board();
        board.setBoard10x10();

        assertEquals(board.getBoard().length,10);
        board.showBoard();
    }
}
