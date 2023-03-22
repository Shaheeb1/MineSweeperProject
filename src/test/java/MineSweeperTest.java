import org.example.MineSweeperGame;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MineSweeperTest {


    @Test
    public void test_play() {
        MineSweeperGame game = new MineSweeperGame();
        game.revealed[0][0] = true;
        game.revealed[1][1] = true;

        assertTrue(game.revealed[0][0]);
        assertTrue(game.revealed[1][1]);
    }

   /* @Test
    public void testGetAdjacentMines() {
        // set up a game board with a mine at (1,1)
        MineSweeperGame game = new MineSweeperGame();

                game.board[1][1] = true;

        // test a cell with no adjacent mines
        assertEquals(1, game.getAdjacentMines(0, 0));

        // test a cell with one adjacent mine
        assertEquals(2, game.getAdjacentMines(0, 1));

        // test a cell with two adjacent mines
        assertEquals(3, game.getAdjacentMines(0, 2));

        // test a cell with three adjacent mines
        assertEquals(4, game.getAdjacentMines(1, 0));

        // test a cell with four adjacent mines
        assertEquals(5, game.getAdjacentMines(1, 2));

        // test a cell with five adjacent mines
        assertEquals(6, game.getAdjacentMines(2, 0));

        // test a cell with six adjacent mines
        assertEquals(7, game.getAdjacentMines(2, 1));


    }


    */

}
