package ua.hillel.kalina.lessons.lesson_010.Hw_13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderBoardTest {

    String clients1 = "Oleg";
    String clients2 = "Olaf";
    String clients3 = "Orusultan";

    @Test
    @DisplayName("addValidClients")
    void addValidClientsOleg() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        assertEquals(1, board.map.size());
        assertEquals(clients1, board.map.lastEntry().getValue().get(0).getName());
        assertEquals(0, board.map.lastEntry().getValue().get(0).getNumm());

    }

    @Test
    @DisplayName("addSomeClients")
    void addSomeClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        assertEquals(1, board.map.size());
        assertEquals(clients1, board.map.lastEntry().getValue().get(0).getName());
        assertEquals(0, board.map.lastEntry().getValue().get(0).getNumm());

        board.add(clients2);
        assertEquals(2, board.map.size());
        assertEquals(clients2, board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.lastEntry().getValue().get(0).getNumm());

    }

    @Test
    @DisplayName("addSomePeopleAfterDeleteClients")
    void addSomePeopleAfterDeleteClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        board.add(clients2);
        board.deliverySome(0);
        board.add(clients3);

        assertEquals(2, board.map.lastEntry().getValue().get(0).getNumm());
        assertThrows(NullPointerException.class, () -> board.map.get(0).get(0));

    }


    @Test
    @DisplayName("addInvalidAndrey")
    void addInvalidAndrey() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        List list = new ArrayList<>();
        list.add(clients3);
        board.add(list.toString());
        assertEquals("[Orusultan]",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.size());
    }

    @Test
    @DisplayName("deliverFirstNotHaveClients")
    void deliverFirstNotHaveClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        assertThrows(NullPointerException.class, board::deliverFirst);

    }
    @Test
    @DisplayName("deliverFirstHaveOneClients")
    void deliverFirstHaveOneClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add(clients1);

        assertEquals(0,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals(clients1,  board.deliverFirst());
        assertThrows(NullPointerException.class, ()-> board.map.get(0).get(0));
    }

    @Test
    @DisplayName("deliverFirstHaveSomeClients")
    void deliverFirstHaveSomeClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        assertEquals(0,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals(clients1,board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.size());

        board.add(clients2);
        assertEquals(1,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals(clients2,board.map.lastEntry().getValue().get(0).getName());
        assertEquals(2, board.map.size());

        board.add(clients3);
        assertEquals(2,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals(clients3,board.map.lastEntry().getValue().get(0).getName());
        assertEquals(3, board.map.size());

        assertEquals(clients1,  board.deliverFirst());
        assertEquals(2,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals(clients3,board.map.lastEntry().getValue().get(0).getName());
        assertEquals(2, board.map.size());
        assertThrows(NullPointerException.class, ()-> board.map.get(0).get(0));
    }

    @Test
    @DisplayName("deliverySome")
    void deliverySome() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        board.add(clients2);
        board.add(clients3);

        assertNull(board.deliverySome(10));
        assertEquals(clients2, board.deliverySome(1)[1]);
        assertThrows(NullPointerException.class, () -> board.map.get(1).get(0));
        assertNull(board.deliverySome(1));

    }

    @Test
    @DisplayName("deliverySomeNotHave")
    void deliverySomeNotHave() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        assertNull(board.deliverySome(5));

    }


    @Test
    @DisplayName("draw")
    void draw() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();

        assertEquals(0, board.map.size());
        board.add(clients1);
        board.add(clients2);
        board.add(clients3);

        assertTrue(board.draw());
    }
}