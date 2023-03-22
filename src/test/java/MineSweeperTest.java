import org.example.MineSweeperGame;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MineSweeperTest {
    @Test
    public void test_play() {
        MineSweeperGame game = new MineSweeperGame();
        game.revealed[0][0] = true;
        game.revealed[1][1] = true;
        game.play();
        assertFalse(game.revealed[0][0]);
        assertTrue(game.revealed[1][1]);
    }

}
