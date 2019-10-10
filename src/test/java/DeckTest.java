import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private ArrayList<Card> cards;

    @Before
    public void before() {
        cards = new ArrayList<Card>();
        deck = new Deck("Decklan", cards);
    }

    @Test
    public void canGetDeckName() {
        assertEquals("Decklan", deck.getName());
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.countCards());
    }
}
