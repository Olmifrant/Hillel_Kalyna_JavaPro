package ua.hillel.kalina.lessons.lesson_010.Hw_13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderBoardTest {

    @Test
    @DisplayName("addValidOleg")
    void addValidOleg() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Олег");
        assertEquals(1, board.map.size());
        assertEquals("Олег", board.map.lastEntry().getValue().get(0).getName());
        assertEquals(0, board.map.lastEntry().getValue().get(0).getNumm());

    }

    @Test
    @DisplayName("addSomePeople")
    void addSomePeople() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Олег");
        assertEquals(1, board.map.size());
        assertEquals("Олег", board.map.lastEntry().getValue().get(0).getName());
        assertEquals(0, board.map.lastEntry().getValue().get(0).getNumm());

        board.add("Alex");
        assertEquals(2, board.map.size());
        assertEquals("Alex", board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.lastEntry().getValue().get(0).getNumm());

    }

    @Test
    @DisplayName("addInvalidAndrey")
    void addInvalidAndrey() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        List list = new ArrayList<>();
        list.add("Andrey");
        board.add(list.toString());
        assertEquals("[Andrey]",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.size());
    }

    @Test
    void deliverFirstNotHaveClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        assertThrows(NullPointerException.class, board::deliverFirst);

    }
    @Test
    void deliverFirstHaveOneClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Human");

        assertEquals(0,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals("Human",  board.deliverFirst());
        assertThrows(NullPointerException.class, ()-> board.map.get(0).get(0));
    }

    @Test
    void deliverFirstHaveSomeClients() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Human");
        assertEquals(0,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals("Human",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(1, board.map.size());

        board.add("Cat");
        assertEquals(1,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals("Cat",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(2, board.map.size());

        board.add("Dog");
        assertEquals(2,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals("Dog",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(3, board.map.size());

        assertEquals("Human",  board.deliverFirst());
        assertEquals(2,board.map.lastEntry().getValue().get(0).getNumm());
        assertEquals("Dog",board.map.lastEntry().getValue().get(0).getName());
        assertEquals(2, board.map.size());
        assertThrows(NullPointerException.class, ()-> board.map.get(0).get(0));
    }

    @Test
    void deliverySome() {

        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Bibba");
        board.add("Bobba");
        board.add("Budda");

        assertEquals(null, board.deliverySome(10));
        assertEquals("Bobba", board.deliverySome(1)[1]);
        assertThrows(NullPointerException.class, () -> board.map.get(1).get(0));
        assertEquals(null, board.deliverySome(1));

    }

    @Test
    void draw() {
    }
}