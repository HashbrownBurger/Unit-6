import java.util.ArrayList;

public class Player {
    private String name;
    private Deck deck;
    private ArrayList<Card> hand;

    public Player(String name, Deck deck) {
        hand = new ArrayList<>();
        this.name = name;
        this.deck = deck;
    }

    public void drawCard() {
        hand.add(deck.getDeck().remove(0));
    }

    public void draw(int cardNumber) {
        for (int i = 0; i < cardNumber; i++) {
            drawCard();
        }
    }

    public String toString(){
        return "Player " + name + ": " + hand;
    }
}
