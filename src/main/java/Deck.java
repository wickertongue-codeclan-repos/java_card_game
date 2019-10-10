import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {
    private String name;
    private ArrayList<Card> cards;

    public Deck(String name, ArrayList<Card> cards) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int countCards() {
        return this.cards.size();
    }
}
