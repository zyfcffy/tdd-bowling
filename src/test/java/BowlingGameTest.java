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

    @Test
    void should_return_score_when_spare_in_one_round() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {5, 5, 3, 7, 4, 6, 7, 3, 5, 5, 4, 5, 6, 3, 9, 1, 4, 5, 4, 6, 9};
        int score = bowlingGame.getScore(test);
        assertEquals(106, score);
    }


    @Test
    void should_return_score_when_not_strike_and_not_spare()throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {5, 3, 3, 6, 4, 5, 7, 2, 5, 4, 4, 5, 6, 3, 8, 1, 4, 5, 4, 5};
        int score = bowlingGame.getScore(test);
        assertEquals(89, score);
    }
}
