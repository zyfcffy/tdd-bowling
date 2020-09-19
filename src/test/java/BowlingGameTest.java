import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    @Test
    void should_throw_exception_when_input_illegal() {
        assertThrows(Exception.class, () -> {
            BowlingGame bowlingGame = new BowlingGame();
            int[] test = {-1, -2, 4, 5, 4, 2, 7, 3, 5, 6, 1, 5, 3, 4, 2, 11, 1};
            int score = bowlingGame.getScore(test);
        });
    }

    @Test
    void should_throw_exception_when_round_not_enough() {
        assertThrows(Exception.class, () -> {
            BowlingGame bowlingGame = new BowlingGame();
            int[] test = {7, 3, 5, 6, 1, 5, 3, 4, 2, 11, 1};
            int score = bowlingGame.getScore(test);
        });
    }

    @Test
    void should_throw_exception_when_round_more_than_10() {
        assertThrows(Exception.class, () -> {
            BowlingGame bowlingGame = new BowlingGame();
            int[] test = {7, 3, 5, 6, 1, 5, 3, 4, 2, 11, 1, 2, 3, 8, 7, 9, 10, 3, 6, 7, 8, 9};
            int score = bowlingGame.getScore(test);
        });
    }

    @Test
    void should_return_score_when_all_of_first_bat_strike() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 9, 8};
        int score = bowlingGame.getScore(test);
        assertEquals(296, score);
    }
}
