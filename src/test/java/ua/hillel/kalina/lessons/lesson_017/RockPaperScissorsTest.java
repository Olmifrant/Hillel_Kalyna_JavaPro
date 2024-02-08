package ua.hillel.kalina.lessons.lesson_017;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {


    @Test
    public void testDetermineWinner_PlayerWins() {
        assertEquals(1, RockPaperScissors.determineWinner(1, 2));
        assertEquals(1, RockPaperScissors.determineWinner(2, 3));
        assertEquals(1, RockPaperScissors.determineWinner(3, 1));
    }

    @Test
    public void testDetermineWinner_ComputerWins() {
        assertEquals(-1, RockPaperScissors.determineWinner(2, 1));
        assertEquals(-1, RockPaperScissors.determineWinner(3, 2));
        assertEquals(-1, RockPaperScissors.determineWinner(1, 3));
    }

    @Test
    public void testDetermineWinner_Draw() {
        assertEquals(0, RockPaperScissors.determineWinner(1, 1));
        assertEquals(0, RockPaperScissors.determineWinner(2, 2));
        assertEquals(0, RockPaperScissors.determineWinner(3, 3));
    }





}