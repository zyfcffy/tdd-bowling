import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    @Test
    void should_throw_exception_when_input_illegal() {
        assertThrows(Exception.class, () -> {
            BowlingGame bowlingGame = new BowlingGame();
            int[] test = {-1,-2, 4, 5, 4, 2, 7, 3, 5, 6, 1, 5, 3, 4, 2, 11, 1};
            int score = bowlingGame.getScore(test);
        });
    }

    @Test
    void should_throw_exception_when_round_not_enough(){
        assertThrows(Exception.class, () -> {
            BowlingGame bowlingGame = new BowlingGame();
            int[] test = { 7, 3, 5, 6, 1, 5, 3, 4, 2, 11, 1};
            int score = bowlingGame.getScore(test);
        });
    }

    @Test
    void should_return_300_when_all_bat_strike() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {10,10,10,10,10,10,10,10,10,10,10,10};
        int score = bowlingGame.getScore(test);
        assertEquals(300,score);
    }

    @Test
    void should_return_score_when_all_round_are_two_bat() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {2, 6, 8, 1, 3, 4, 5, 4, 2, 7, 3, 5, 6, 1, 5, 3, 4, 2, 7, 1};
        int score = bowlingGame.getScore(test);
        assertEquals(79,score);
    }

    @Test
    void should_return_score_when_exit_10_in_one_round() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {10, 8, 1, 3, 4, 10, 2, 7, 3, 5, 6, 1, 10, 4, 2, 7, 1};
        int score = bowlingGame.getScore(test);
        assertEquals(108,score);
    }

    @Test
    void should_return_score_when_exit_one_round_total_is_10() throws Exception {
        BowlingGame bowlingGame = new BowlingGame();
        int[] test = {10, 8, 2, 3, 4, 5, 5, 10, 3, 5, 6, 1, 5, 3, 4, 2, 7, 1};
        int score = bowlingGame.getScore(test);
        assertEquals(115,score);
    }
}
