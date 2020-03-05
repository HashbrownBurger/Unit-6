public class CardTester {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.getDeck());
        deck.shuffle();
        System.out.println(deck.getDeck());
        Player player1 = new Player("Skyler", deck);
        player1.draw(7);
        System.out.println(player1);

    }

}
