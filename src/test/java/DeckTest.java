import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private Card card;
    private ArrayList<Card> cards;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.JACK);
        cards = new ArrayList<Card>();
        deck = new Deck("Decklan", cards);
    }

    @Test
    public void canGetDeckName() {
        assertEquals("Decklan", deck.getName());
    }

    @Test
    public void cardsStartsEmpty() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void cardsIncreasesAsCardIsAdded() {
        cards.add(card);
        assertEquals(1, deck.countCards());
    }
}
