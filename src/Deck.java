import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card>list;

    public Deck(){
        list = new ArrayList<>();
        list.add(new Card(2, " Clubs" ));
        list.add(new Card(3, " Clubs" ));
        list.add(new Card(4, " Clubs" ));
        list.add(new Card(5, " Clubs" ));
        list.add(new Card(6, " Clubs" ));
        list.add(new Card( 7, " Clubs" ));
        list.add(new Card(8, " Clubs" ));
        list.add(new Card(9, " Clubs" ));
        list.add(new Card(10, " Clubs" ));
        list.add(new Card( 11, " Clubs" ));
        list.add(new Card(12, " Clubs" ));
        list.add(new Card(13, " Clubs" ));
        list.add(new Card(14, " Clubs" ));

        list.add(new Card(2, " Spades" ));
        list.add(new Card(3, " Spades" ));
        list.add(new Card(4, " Spades" ));
        list.add(new Card(5, " Spades" ));
        list.add(new Card(6, " Spades" ));
        list.add(new Card( 7, " Spades" ));
        list.add(new Card(8, " Spades" ));
        list.add(new Card(9, " Spades" ));
        list.add(new Card(10, " Spades" ));
        list.add(new Card( 11, " Spades" ));
        list.add(new Card(12, " Spades" ));
        list.add(new Card(13, " Spades" ));
        list.add(new Card(14, " Spades" ));

        list.add(new Card(2, " Diamonds" ));
        list.add(new Card(3, " Diamonds" ));
        list.add(new Card(4, " Diamonds" ));
        list.add(new Card(5, " Diamonds" ));
        list.add(new Card(6, " Diamonds" ));
        list.add(new Card( 7, " Diamonds" ));
        list.add(new Card(8, " Diamonds" ));
        list.add(new Card(9, " Diamonds" ));
        list.add(new Card(10, " Diamonds" ));
        list.add(new Card( 11, " Diamonds" ));
        list.add(new Card(12, " Diamonds" ));
        list.add(new Card(13, " Diamonds" ));
        list.add(new Card(14, " Diamonds" ));

        list.add(new Card(2, " Hearts" ));
        list.add(new Card(3, " Hearts" ));
        list.add(new Card(4, " Hearts" ));
        list.add(new Card(5, " Hearts" ));
        list.add(new Card(6, " Hearts" ));
        list.add(new Card( 7, " Hearts" ));
        list.add(new Card(8, " Hearts" ));
        list.add(new Card(9, " Hearts" ));
        list.add(new Card(10, " Hearts" ));
        list.add(new Card( 11, " Hearts" ));
        list.add(new Card(12, " Hearts" ));
        list.add(new Card(13, " Hearts" ));
        list.add(new Card(14, " Hearts" ));
    }

    public ArrayList<Card> getDeck(){
        return list;
    }

    public void shuffle(){
        Collections.shuffle(list);
    }
}
